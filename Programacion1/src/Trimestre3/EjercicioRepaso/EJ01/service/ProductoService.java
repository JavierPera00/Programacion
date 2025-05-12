package Trimestre3.EjercicioRepaso.EJ01.service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Trimestre3.EjercicioRepaso.EJ01.modelo.Producto;



public class ProductoService {

	private OpenConnection openConn;

	public ProductoService() {
		openConn = new OpenConnection();
	}

	public void insertarProducto(Producto prod) throws ProductoInvalidoException, SQLException {
		String sql = "INSERT INTO productos_gourmet VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			if (prod.getPrecio().compareTo(new BigDecimal(0)) <= 0) {
				throw new ProductoInvalidoException();
			} else {
				stmt.setInt(1, prod.getId());
				stmt.setString(2, prod.getNombre());
				stmt.setString(3, prod.getTipo());
				stmt.setBigDecimal(4, prod.getPrecio());
				stmt.setBoolean(5, prod.getDisponible());
				stmt.execute();
			}
		}
	}

	public void insertarProductos(List<Producto> producto) throws SQLException {
		String sql = "INSERT INTO productos_gourmet VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				for (Producto prod : producto) {
					stmt.setInt(1, prod.getId());
					stmt.setString(2, prod.getNombre());
					stmt.setString(3, prod.getTipo());
					stmt.setBigDecimal(4, prod.getPrecio());
					stmt.setBoolean(5, prod.getDisponible());
					stmt.execute();
				}
			} catch (SQLException a) {
				System.out.println("Error al introducir el usuario");
				conn.rollback();
			}
			conn.commit();
			System.out.println("Todo correcto");
		}
	}

	public List<Producto> consultarTipoProductos(String tipo) throws ProductoNoEncontradoException, SQLException {
		List<Producto> lista = new ArrayList<>();
		String sql = "SELECT * FROM productos_gourmet";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				String tipo1 = rs.getString("TIPO");
				if (tipo1.equals(tipo)) {
					Producto a = new Producto();
					a.setId(rs.getInt("ID"));
					a.setNombre(rs.getString("NOMBRE"));
					a.setTipo(rs.getString(tipo1));
					a.setPrecio(rs.getBigDecimal("PRECIO"));
					a.setDisponible(rs.getBoolean("DISPONIBLE"));
					lista.add(a);
				} else {
					throw new ProductoNoEncontradoException("ERROR | Producto no encontrado |");
				}
			}
		}
		return lista;
	}

	public void eliminaProducto(Integer id) throws SQLException, ProductoNoEncontradoException {
		String sql = "DELETE FROM productos_gourmet WHERE id = ?";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			Integer result = stmt.executeUpdate();
			if (result == 0) {
				throw new ProductoNoEncontradoException("No hay ningun producto con esa id");
			}
		}
	}

	public Map<Integer, Producto> consultarProductosDisponibles() throws SQLException {
		Map<Integer, Producto> mapa = new HashMap<>();
		String sql = "SELECT * FROM productos_gourmet WHERE DISPONIBLE = 1";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Producto a = new Producto();
				a.setId(rs.getInt("ID"));
				a.setNombre(rs.getString("NOMBRE"));
				a.setTipo(rs.getString("TIPO"));
				a.setPrecio(rs.getBigDecimal("PRECIO"));
				a.setDisponible(rs.getBoolean("DISPONIBLE"));
				mapa.put(a.getId(), a);
			}
		}
		return mapa;
	}
}
