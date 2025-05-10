package Trimestre2.EjerciciosRepaso.EJ05;

import java.time.LocalDate;

public class Cd extends publicacion {
	
	private Boolean prestados;

	public Boolean getPrestados() {
		return prestados;
	}

	public void setPrestados(Boolean prestados) {
		this.prestados = prestados;
	}

	public Cd(String codigo, String autor, String titulo, LocalDate fecha, Boolean prestados) {
		super(codigo, autor, titulo, fecha);
		this.prestados = false;
	}

	public void prestar () {
		this.prestados = true;
	}
	public void devolver () {
		this.prestados = false;
	}
	public Boolean estarPrestado () {
		if (this.prestados= true) {
			return true;
		}
		return false;
	}
	
	
}
