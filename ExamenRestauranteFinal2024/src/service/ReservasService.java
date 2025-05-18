package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import modelo.Reserva;
import modelo.Restaurante;

public class ReservasService {

	private OpenConnection openConn;

	public ReservasService() {
		openConn = new OpenConnection();
	}

	public void insertarMapaReservas(Restaurante re) throws SQLException, ReservasException {
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				for (Map.Entry<String, Reserva> entry : re.getMapaRe().entrySet()) {
					stmt.setString(1, entry.getKey()); // Nombre cliente
					stmt.setDate(2, java.sql.Date.valueOf(entry.getValue().getFecha())); // Fecha
					// stmt.setInt(3, );
					// stmt.setString(4,);
					stmt.executeUpdate();
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				System.out.println(e.getMessage());
				throw e;
			}

			System.out.println("Todo correcto");
		} catch (SQLException a) {
			System.out.println("ERROR: " + a.getMessage());
			throw new ReservasException("Error al insertar reservas: " + a.getMessage());
		}
	}

}
