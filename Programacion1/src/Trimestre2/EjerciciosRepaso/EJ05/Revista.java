package Trimestre2.EjerciciosRepaso.EJ05;

import java.time.LocalDate;

public class Revista extends publicacion {

	private Boolean consultado;

	public Boolean getConsultado() {
		return consultado;
	}

	public void setConsultado(Boolean consultado) {
		this.consultado = consultado;
	}

	public Revista(String codigo, String autor, String titulo, LocalDate fecha, Boolean consultado) {
		super(codigo, autor, titulo, fecha);
		this.consultado = false;
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
