package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import modelo.Suscripcion;

public class SuscripcionService {

	private OpenConnecttion openConn;

	public SuscripcionService() {
		openConn = new OpenConnecttion();
	}
	
	public Map<Integer,Suscripcion> consultarSuscripciones(LocalDate fecha,String email) throws SQLException, noExisteException, BaseDatosException {
		Map<Integer,Suscripcion> mapa = new HashMap<>();	
		String sql = "select identificador,fecha_alta,dispositivos,mensualidad,cancelada,email_usuario from suscripcion";
		try(Connection conn = openConn.getNewConnection();Statement stm = conn.createStatement()){
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				String correo = rs.getString("email_usuario");
				LocalDate fechaUsu = rs.getDate("fecha_alta").toLocalDate();
				if(email.equalsIgnoreCase(correo)) {
					if(fechaUsu.compareTo(fecha) <= 0) {
						Integer id = rs.getInt("identificador");
						Suscripcion a = new Suscripcion(id);
						a.setCancelada(rs.getBoolean("cancelada"));
						a.setFechaAlta(fechaUsu);
						a.setImporte(rs.getBigDecimal("mensualidad"));
						a.setCantidadDispo(rs.getInt("dispositivos"));
						a.setId(id);
						mapa.put(id, a);
					}
				}
			}
			if(mapa.isEmpty()) {
				throw new noExisteException("No hay suscripciones para los filtros indicados");
			}
		}catch(SQLException a) {
			throw new BaseDatosException ("Error consultando suscripciones");
		}
		return mapa;
	}
}
