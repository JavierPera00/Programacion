package PracticaFinalJavierPeraVidal.modelo;

import java.time.LocalDate;

public class Jugador {

	private Integer numero;
	private String codigoEquipo;
	private LocalDate fechaNacimiento;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCodigoEquipo() {
		return codigoEquipo;
	}
	public void setCodigoEquipo(String codigoEquipo) {
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
				+ ", nombre=" + nombre + "]";
	}
	
	
}
