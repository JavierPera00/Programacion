package Trimestre2.ExamenTrenesTipoC;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pasajero {

	private String dni;
	private String nombre;
	private LocalDate fecha;

	/*
	 * public Pasajero(String dni, String nombre, LocalDate fecha) { super();
	 * this.dni = dni; this.nombre = nombre; this.fecha = fecha; }
	 */
	public Pasajero() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Boolean isTerceraEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = this.fecha.until(hoy);
		if (periodo.getYears() >= 65) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return this.dni + " - " + this.nombre + " - " + this.fecha.format(formato);
	}

}
