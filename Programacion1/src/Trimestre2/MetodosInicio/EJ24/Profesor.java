package Trimestre2.MetodosInicio.EJ24;

public class Profesor {
	
	private String nombre;
	private Integer edad;
	
	public Profesor(String nombre, Integer edad) {
		this.edad=edad;
		this.nombre=nombre;
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
	
	@Override
	public String toString() {
		return "Profesor  [nombre = " + nombre + " | edad: " + edad + "]";
	}
}
