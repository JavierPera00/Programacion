package Trimestre2.MetodosInicio.EJ55;

import java.math.BigDecimal;

public class Alumno {

	private String dni;
	private BigDecimal nota;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public BigDecimal getNota() {
		return nota;
	}
	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}
	public Alumno(String dni, BigDecimal nota) {
		super();
		this.dni = dni;
		this.nota = nota;
	}
	
}
