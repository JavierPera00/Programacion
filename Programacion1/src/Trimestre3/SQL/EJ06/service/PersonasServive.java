package Trimestre3.SQL.EJ06.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Trimestre3.SQL.EJ06.modelo.Persona;

public class PersonasServive {

	private OpenConnection openConn;
	
	public PersonasServive() {
		openConn = new OpenConnection();
	}
	
	public Persona consultarPersona(String dni1){
		String sql = "SELECT * FROM PERSONAS";
		try(Connection conn = openConn.getNewConnection();
			 Statement stm = conn.createStatement()){
			
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				String dni = rs.getString("DNI");
				String nombre  = rs.getString("NOMBRE");
				String apellidos = rs.getString("APELLIDOS");
				if(dni.equalsIgnoreCase(dni1)) {
					Persona p1 = new Persona ();
					p1.setDni(dni1);
					p1.setNombre(nombre);
					p1.setApellidos(apellidos);
					p1.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
					return p1;
					}
			}
		}catch (SQLException e ){
			System.out.println("Error accediendo a la Base de Datos");
		}
		finally {
            System.out.println("");
        }
		return null;
	}
	public List<Persona> buscarPersona(String cadena) {
		List<Persona> lista = new ArrayList<>();										  
		String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + cadena + "%' or APELLIDOS LIKE '%" + cadena + "%'";
		System.out.println(sql);
		try (Connection conn = openConn.getNewConnection(); 
				Statement stm = conn.createStatement()) {
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
			Persona p1 = new Persona();
			p1.setNombre(rs.getString("NOMBRE"));	
			p1.setApellidos(rs.getString("APELLIDOS"));
			p1.setDni(rs.getString("DNI"));
			p1.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
			lista.add(p1);
			}
		} catch (SQLException e) {
			System.out.println("Fallo al ingresar la cadena");
		} 
		return lista;
	}
	
	public void insertarPersona(Persona p) throws SQLException {		
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFechaNac()));
			System.out.println(sql);
			stmt.execute();
		}
	}
	
	public void ActualizarPersona(Persona p) throws SQLException {		
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ?";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, p.getNombre());
			stmt.setString(2, p.getApellidos());
			stmt.setDate(3, Date.valueOf(p.getFechaNac()));
			stmt.setString(4, p.getDni());
			System.out.println(sql);
			stmt.executeUpdate();
		}
	}
	
	public void borrarPersona(String dni) throws SQLException {		
		String sql = "DELETE FROM PERSONAS WHERE DNI = ?";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, dni);	
			System.out.println(sql);
			stmt.executeUpdate();
		}
	}
}


