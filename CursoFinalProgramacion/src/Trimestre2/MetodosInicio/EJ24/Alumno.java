package Trimestre2.MetodosInicio.EJ24;

public class Alumno {

	private String dni;
	private Float nota;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota2) {
		this.nota = nota2;
	}

	public Float aprobar(Float aprobar) {
		this.nota = 5f;
		return nota;

	}
	
	public String dni(String dni) {
		return this.dni;
	}

	public Alumno(String dni, Float nota) {
		this.nota=nota;
		this.dni=dni;
	}

	@Override
	public String toString() {
		return "Alumno  [dni = " + dni + " | nota: " + nota + "]";
	}
	
}
