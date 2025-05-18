package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Reserva {

	private LocalDate fecha;
	private Integer numero;
	private Boolean confirmada;

	public Reserva(LocalDate fecha1, Integer numero) {
		this.fecha = fecha1;
		this.numero = numero;
		this.confirmada = false;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean getConfirmada() {
		return confirmada;
	}

	public void setConfirmada(Boolean confirmada) {
		this.confirmada = confirmada;
	}

	public Boolean isProxima() {
		LocalDate fecha = LocalDate.now();
		Period periodo = this.fecha.until(fecha);
		if (periodo.getDays() <= 3) {
			return true;
		}
		return false;
	}
	
	

}
