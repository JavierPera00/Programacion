package Trimestre2.MetodosInicio.EJ43;

public abstract class Trabajadores  {

	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;
	
	
	public Trabajadores(String nombre, Integer añoNacimiento, String nacionalidad) {
		this.nombre=nombre;
		this.añoNacimiento=añoNacimiento;
		this.nacionalidad=nacionalidad;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	public abstract Double getSueldo();
	
	@Override
	public abstract String toString(); 
		
	

}
