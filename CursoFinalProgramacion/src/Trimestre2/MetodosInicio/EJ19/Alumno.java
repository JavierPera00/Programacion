package Trimestre2.MetodosInicio.EJ19;

public class Alumno {

	private String dni;
	private String nombre;
	private Integer edad;
	private Float nota;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota2) {
		this.nota = nota2;
	} 
	
	public Float aprobar (Float aprobar) {
		this.nota = 5f;
		return nota;
	
	}

}
