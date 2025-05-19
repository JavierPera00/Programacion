package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Trastero;

public class TrasterosService {

	private OpenConnection openConn;

	public TrasterosService() {
		openConn = new OpenConnection();
	}

	public void ActualizarPersona(Trastero p) throws SQLException, TrasteroEstadoException {
		String sql = "UPDATE TRASTEROS SET PRECIO_METRO_DIA = ?, DNI_ALQUILER = ?,FECHA_INICIO_ALQUILER = ?, FECHA_FIN_ALQUILER = ?,ALQUILADO = ? WHERE CODIGO = '"
				+ p.getCodigo() + "'";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			try {
				stmt.setInt(1, p.getMetro());
				stmt.setString(2, p.getDni());
				stmt.setDate(3, Date.valueOf(p.getF_ini()));
				stmt.setDate(4, Date.valueOf(p.getF_fin()));
				stmt.setBoolean(5, true);
				stmt.executeUpdate();
			} catch (SQLException a) {
				throw new TrasteroEstadoException("No se ha encontrado trastero");
			}
		} catch (SQLException w) {
			throw new TrasteroEstadoException(w.getMessage());
		}
	}
	
	public void crearTrastero(Trastero p) throws TrasteroEstadoException {
		String sql = "INSERT INTO TRASTEROS (COD_TRASTERO,METROS,ALQUILADO) VALUES(?,?,?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setString(2, p.getCodigo());
				stmt.setInt(2, p.getMetro());
				stmt.setBoolean(3, false);
				stmt.executeUpdate();
			
		} catch (SQLException w) {
			throw new TrasteroEstadoException(" ERROR insertando en BBDD" + w.getMessage());
		}
		
	}

}
