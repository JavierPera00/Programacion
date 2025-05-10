package Trimestre2.MetodosInicio.EJ45;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Autentificador {

	private LocalDate fecha;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Autentificador() {
		
	}

	// 1
	public static Boolean comprobarFecha(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate fecha1 = LocalDate.parse(fecha, formato);
			return false;
		} catch (Exception e) {
			System.err.println("Fallo en la fecha");
			return true;
		}
	}

	// 2
	public static void bisiesto(String fecha) {
		Integer posicion = fecha.lastIndexOf("/");
		String año = fecha.substring(posicion + 1);
		Integer año1 = Integer.parseInt(año);
		if (año1 % 2 == 0) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}

	// 3
	public static DayOfWeek diaSemana(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse(fecha, formato);
		DayOfWeek dia1 = fecha1.getDayOfWeek();
		return dia1;
	}


	// 4
	public static Integer años(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse(fecha, formato);
		LocalDate fechaActual = LocalDate.now();
		Period periodo = fecha1.until(fechaActual);
		Integer años = periodo.getYears();
		return años;
	}

	// 5
	public static LocalDate añosVida(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse(fecha, formato);
		LocalDate vida = fecha1.plusYears(100);		
		return vida;
	}

	@Override
	public  String toString() {
		return "Autentificador [fecha=" + fecha + "]";
	}

	
}
