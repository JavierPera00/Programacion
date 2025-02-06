package Trimestre2.MetodosInicio.EJ22;

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

	public Alumno(Curso curso) {
		
	}

	@Override
	public String toString() {
		return "Alumno  [Id = " + curso.getId() + " | Descripción: " + curso.getDescripcion() + "]";
	}
	
}
