package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] array = new String[] { "avion", "beber", "casa", "dedo", "elefante", "fifa", "gormiti", "hambre" };
		System.out.println("Escribe una palabra");
		String palabra = scanner.nextLine();
		System.out.println("Se encuentra en la posición: " + buscarPalabra(array, palabra));
		scanner.close();
	}

	public static Integer buscarPalabra(String[] array, String palabra) {
		for (int i = 0; i < array.length; i++) {
			if (palabra.equalsIgnoreCase(array[i])) {
				return i;
			}
		}
		return -1;
	}
}
