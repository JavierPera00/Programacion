package PracticaFinalJavierPeraVidal.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import PracticaFinalJavierPeraVidal.modelo.Equipo;
import PracticaFinalJavierPeraVidal.modelo.Jugador;

public class EquiposService {

	private OpenConnection openConn;

	public EquiposService() {
		openConn = new OpenConnection();
	}

	public List<Equipo> consultarEquipos() throws SQLException {
		List<Equipo> listaEquipo = new ArrayList<>();
		String sql = "SELECT CODIGO, NOMBRE FROM EQUIPO";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Equipo equip = new Equipo();
				equip.setNombre(rs.getString("NOMBRE"));
				listaEquipo.add(equip);
			}
		} catch (SQLException e) {
			System.err.println("ERROR | [Fallo al ingresar al equipo]");
		}
		return listaEquipo;
	}

	public List<Jugador> consultarJugadoresEquipo(String codigo) throws SQLException {
		List<Jugador> listaJugador = new ArrayList<>();
		String sql = "SELECT CODIGO_EQUIPO, NUMERO, NACIMIENTO FROM JUGADOR WHERE CODIGO_EQUIPO = ?";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Jugador j = new Jugador();
				j.setNumero(rs.getInt("NUMERO"));
				j.setCodigoEquipo(rs.getString("CODIGO_EQUIPO"));
				j.setFechaNacimiento(rs.getDate("NACIMIENTO").toLocalDate());
				listaJugador.add(j);
			}
		} catch (SQLException e) {
			System.out.println("ERROR | Fallo al ingresar a la BBDD");
		}
		return listaJugador;

	}

	public Equipo consultarEquipoCompleto(String codigo)
			throws NotFoundException, EquipoServiceException, SQLException {
		String sql = "SELECT CODIGO, NOMBRE FROM EQUIPO WHERE CODIGO = ?";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				if (!rs.next()) {
					throw new NotFoundException("ERROR");
				}
				Equipo equipo = new Equipo();
				equipo.setListaJugador(consultarJugadoresEquipo(codigo));
				return equipo;
			}
		} catch (SQLException r) {
			throw new EquipoServiceException("ERROR");
		}
		return null;
	}

	public void insertarJugador(Jugador p, Connection conn) throws SQLException {
		String sql = "INSERT INTO JUGADOR (NUMERO, CODIGO_EQUIPO, NOMBRE, NACIMIENTO) VALUES (?, ?, ?, ?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(2, p.getNumero());
			stmt.setString(1, p.getCodigoEquipo());
			stmt.setString(3, p.getNombre());
			stmt.setDate(3, Date.valueOf(p.getFechaNacimiento()));
			stmt.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error al agregar al jugador");
		}
	}

	public void crearEquipo(Equipo equipo) throws SQLException, EquipoServiceException {
		String sql = "INSERT INTO EQUIPO  (CODIGO, NOMBRE) VALUES (?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			Integer cont = 0;

			stmt.setString(1, equipo.getCodigo());
			stmt.setString(2, equipo.getNombre());
			stmt.executeUpdate();
			for (Jugador jugador : equipo.getListaJugador()) {
				jugador.setNumero(cont++);
				jugador.setCodigoEquipo(equipo.getCodigo());
				insertarJugador(jugador, conn);
			}
			conn.commit();
		} catch (SQLException a) {
			throw new EquipoServiceException();
		}
	}

	public void borrarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException {
		String sqlDeleteJugadores = "DELETE FROM JUGADOR WHERE CODIGO_EQUIPO = ?";
		String sqlDeleteEquipo = "DELETE FROM EQUIPO WHERE CODIGO = ?";

		try (Connection con = openConn.getNewConnection()) {
			con.setAutoCommit(false);
			Equipo equipo = consultarEquipoCompleto(codigo);
			if (equipo == null) {
				con.rollback();
				throw new NotFoundException("No existe equipo con código: " + codigo);
			}
			try (PreparedStatement stmt = con.prepareStatement(sqlDeleteJugadores)) {
				stmt.setString(1, codigo);
				stmt.executeUpdate();
			}
			try (PreparedStatement stmtEq = con.prepareStatement(sqlDeleteEquipo)) {
				stmtEq.setString(2, codigo);
				stmtEq.executeUpdate();
			}
			con.commit();
		} catch (SQLException e) {
			throw new EquipoServiceException("Error al borrar el equipo: " + e.getMessage());
		}
	}

	public void añadirJugadorAEquipo(Equipo eq, Jugador ju) throws SQLException, EquipoServiceException {
		try (Connection conn = openConn.getNewConnection();) {
			List<Jugador> listaJugador = consultarJugadoresEquipo(eq.getCodigo());
			ju.setNumero(listaJugador.size() + 1);
			ju.setCodigoEquipo(eq.getCodigo());
			insertarJugador(ju, conn);

		} catch (SQLException r) {
			throw new EquipoServiceException("ERROR");
		}
	}

	public void exportarJugadores(String codigoEquipo, String rutaFichero)
			throws EquipoServiceException, NotFoundException {
		try {
			List<Jugador> listaJugador = consultarJugadoresEquipo(codigoEquipo);
			if (listaJugador.isEmpty()) {
				throw new NotFoundException();
			}
			List<Jugador> equiposJugador = consultarJugadoresEquipo(rutaFichero);
			for (Jugador jugador : equiposJugador) {
				System.out.println(jugador);
			}
		} catch (SQLException e) {
			throw new EquipoServiceException();
		}

	}
}
