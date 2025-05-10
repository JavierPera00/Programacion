package Trimestre2.CabecerasMetodo;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Javier";
		String apellido = "Pera";
		System.out.println(nombreCompleto(nombre, apellido));
	}
	public static String nombreCompleto(String n, String a) {
		String nombreCom = n + " " + a;
		return nombreCom;
	}
}
