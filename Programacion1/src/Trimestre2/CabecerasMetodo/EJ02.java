package Trimestre2.CabecerasMetodo;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double base = 5d;
		Double altura = 5d;
		System.out.println("Su resultado es: " + triangulo(base,altura));
	}
	public static Double triangulo(Double b, Double a) {
		Double partido = 2d;
		Double resultado = (b*a)/partido;
		return resultado;
	}
}
