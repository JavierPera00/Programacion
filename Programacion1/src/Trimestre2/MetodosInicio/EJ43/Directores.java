package Trimestre2.MetodosInicio.EJ43;

public class Directores extends Trabajadores {

	public Directores(String nombre, Integer año, String nacionalidad) {
		super(nombre, año, nacionalidad);
	}

	@Override
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return 200000d;
	}

	@Override
	public String toString() {
		return "[Director = " + getNombre() + ", añoNacimiento=" + getAñoNacimiento() + ", nacionalidad="
				+ getNacionalidad() + "]";
	}

}
