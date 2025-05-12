package Trimestre2.MetodosInicio.EJ25;

import java.util.Objects;

public class Alumno {

	private String dni;
	private Float nota;
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

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

	public Alumno() {
	
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Alumno  [dni = " + dni + " | nota: " + nota + "]";
	}
	
}
