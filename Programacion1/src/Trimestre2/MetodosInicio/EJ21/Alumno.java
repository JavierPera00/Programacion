package Trimestre2.MetodosInicio.EJ21;

public class Alumno extends Persona{

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
	public Alumno () {
		
	}

	public String dni(String dni) {
		return this.dni;
	}
}
