package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Libro;

public class LibreriaService {

	private OpenConnection openConn;

	public LibreriaService() {
		openConn = new OpenConnection();
	}

	public void insertarLibroNuevo(Libro libro) throws SQLException, LibroException {
		String sql = "INSERT INTO libros VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, libro.getISBN());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());
			stmt.execute();
		} catch (SQLException a) {
			throw new LibroException();
		}
	}

	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws SQLException, LibroException {
		String sql = "UPDATE libros SET PRECIO = ? WHERE ISBN = ?";
		try (Connection conn = openConn.getNewConnection(); 	
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(2, libro.getISBN());
			stmt.setBigDecimal(1, libro.getPrecio());
			Integer result = stmt.executeUpdate(); //Puedes usar execute, que devuelve un true o false
			if (result >= 1) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			throw new LibroException();
		}
	}

}
