package PracticaFinalJavierPeraVidal.modelo;

import java.time.LocalDate;

public class Jugador {

	private Integer numero;
	private Integer codigoEquipo;
	private LocalDate fechaNacimiento;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCodigoEquipo() {
		return codigoEquipo;
	}
	public void setCodigoEquipo(Integer codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", codigoEquipo=" + codigoEquipo + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
}
