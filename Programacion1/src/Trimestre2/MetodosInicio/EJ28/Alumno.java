package Trimestre2.MetodosInicio.EJ28;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		this.dni = dni.toUpperCase();
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

	public static Boolean validarDNI(String dni) {
		Boolean v = false;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if(match.matches()) {
		 v = false;
		}
		else {
		 v = true;
		} 
		return v;		
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
