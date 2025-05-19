package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuario {

	private String email;
	private String dni;
	private List<Suscripcion> lista;

	// Get y Set:
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Suscripcion> getLista() {
		return lista;
	}

	public void setLista(List<Suscripcion> lista) {
		this.lista = lista;
	}

	// Constructores:
	public Usuario() {
		this.lista = new ArrayList<>();
	}

	// Métodos:
	public Boolean tieneSuscripcionesActivas() {
		for (Suscripcion suscripcion : lista) {
			if (suscripcion.getCancelada() == false) {
				return false;
			}
		}
		return true;
	}

	public BigDecimal getTotalProximasRenovaciones() {
		BigDecimal resultado = BigDecimal.ZERO;
		for (Suscripcion suscripcion : lista) {
			if (suscripcion.getCancelada() == true) {
				resultado = resultado.add(suscripcion.getImporte());
			}
		}
		return resultado;
	}

	public Map<Integer, Integer> getNumDispositivos() {
		Map<Integer, Integer> mapa = new HashMap<>();
		for (Suscripcion suscripcion : lista) {
			mapa.put(suscripcion.getId(), suscripcion.getCantidadDispo());
		}
		return mapa;
	}

	public Suscripcion getSuscripcionMayorRiesgo() {
		LocalDate fecha = LocalDate.now();
		Suscripcion sus = null;
		for (Suscripcion suscripcion : lista) {
			if (suscripcion.getCancelada() == false && suscripcion.getFechaRenovacion().compareTo(fecha) < 0) {
				Period periodo = suscripcion.getFechaRenovacion().until(fecha);
				Period periodo1 = sus.getFechaRenovacion().until(fecha);
				if (sus == null || periodo.getDays() < periodo1.getDays()) {
					sus = suscripcion;
				}
			}
		}
		return sus;
	}

}
