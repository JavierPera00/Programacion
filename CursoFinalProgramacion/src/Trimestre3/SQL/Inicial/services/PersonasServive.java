package Trimestre3.SQL.Inicial.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Trimestre3.SQL.Inicial.modelo.Persona;

public class PersonasServive {

	private OpenConnection openConn;

	public PersonasServive() {
		openConn = new OpenConnection();
	}

	public Persona consultarPersona(String dni1) {
		String sql = "SELECT * FROM PERSONAS";
		try (Connection conn = openConn.getNewConnection(); Statement stm = conn.createStatement()) {

			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				String dni = rs.getString("DNI");
				String nombre = rs.getString("NOMBRE");
				String apellidos = rs.getString("APELLIDOS");
				if (dni.equalsIgnoreCase(dni1)) {
					Persona p1 = new Persona();
					p1.setDni(dni1);
					p1.setNombre(nombre);
					p1.setApellidos(apellidos);
					p1.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
					return p1;
				}
			}
		} catch (SQLException e) {
			System.out.println("Error accediendo a la Base de Datos");
		} finally {
			System.out.println("");
		}
		return null;
	}

	

}
