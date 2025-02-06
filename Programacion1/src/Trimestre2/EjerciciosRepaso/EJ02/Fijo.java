package Trimestre2.EjerciciosRepaso.EJ02;

public class Fijo extends Telefono {

	private String direccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Fijo(int numero, String direccion) { // Int numero lo hereda del padre
		super(numero); // Super se pone para iniciar atributo de telefono
		this.direccion = direccion;
	}
}
