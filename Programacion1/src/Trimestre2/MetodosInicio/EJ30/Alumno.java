package Trimestre2.MetodosInicio.EJ30;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

	private String dni;
	private Integer edad;
	private Curso curso;
	private String nombre;
	private Float nota;

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String dni, int edad, Curso curso, String nombre, Float nota) {
		this.curso = curso;
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.nota = nota;

	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	public static Boolean validarDNI(String dni) {
		Boolean v = false;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			v = false;
		} else {
			v = true;
		}
		return v;
	}

	public Boolean validar() {
		Boolean v = false;
		if (validarDNI(this.dni)) {
			if (!this.dni.equals(null)) {
				if (!this.nombre.equals(null) && this.nombre.length() < 10) {
					if (this.edad != null && (this.edad >= 12 || this.edad <= 65)) {
						if (this.curso != null) {
							v = true;
						}
					}
				}
			}
		}
		return v;
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
