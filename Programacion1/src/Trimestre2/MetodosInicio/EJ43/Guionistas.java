package Trimestre2.MetodosInicio.EJ43;

public class Guionistas extends Trabajadores{
	
	
	public Guionistas(String nombre, Integer año, String nacionalidad) {
		super(nombre, año, nacionalidad);
	}

	@Override
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return 50000d;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Guionista = " + getNombre() + ", añoNacimiento=" + getAñoNacimiento() + ", nacionalidad=" + getNacionalidad()+ "]";
	}
}
