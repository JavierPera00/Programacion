package Trimestre2.MetodosInicio.EJ43;

public class Actores extends Trabajadores{


	public Actores(String nombre, Integer año, String nacionalidad) {
		super(nombre, año, nacionalidad);
		
	}
	@Override
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return 100000d;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Actor = " + getNombre() + ", añoNacimiento=" + getAñoNacimiento() + ", nacionalidad=" + getNacionalidad()+ "]";
	}
	


}
