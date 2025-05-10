package Trimestre2.CabecerasMetodo;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double centigrados = 1d;
		System.out.println(paso(centigrados));
	}
	public static Double paso (Double c) {
		Double resultado = (c*9/5)+32;
		return resultado;
	}
}
