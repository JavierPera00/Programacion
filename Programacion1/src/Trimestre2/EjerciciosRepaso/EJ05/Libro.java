package Trimestre2.EjerciciosRepaso.EJ05;

import java.time.LocalDate;

public class Libro extends publicacion {
	private Boolean prestados;
	private Boolean consultado;

	public Boolean getConsultado() {
		return consultado;
	}

	public void setConsultado(Boolean consultado) {
		this.consultado = consultado;
	}

	public Boolean getPrestados() {
		return prestados;
	}

	public void setPrestados(Boolean prestados) {
		this.prestados = prestados;
	}

	public Libro(String codigo, String autor, String titulo, LocalDate fecha, Boolean prestados, Boolean consultado) {
		super(codigo, autor, titulo, fecha);
		this.prestados = false;
		this.consultado = false;
	}

	public void prestar() {
		this.prestados = true;
	}

	public void devolver() {
		this.prestados = false;
	}

	public Boolean estarPrestado() {
		if (this.prestados == true) {
			return true;
		}
		return false;
	}

	public void retirarParaConsultar() {
		this.consultado = true;
	}

	public void terminarConsulta() {
		this.consultado = false;
	}

	public Boolean estaPrestado() {
		if (this.consultado == true) {
			return true;
		}
		return false;
	}

}
