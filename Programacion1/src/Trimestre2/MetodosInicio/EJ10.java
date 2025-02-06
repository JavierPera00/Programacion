package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] array = new String[] {"a","b","c","d","e","f","g","h"};
		System.out.println("Escribe un número");
		Integer numero = scanner.nextInt();
		System.out.println(obtenerPalabra(array, numero));

		scanner.close();
	}

	public static String obtenerPalabra(String[] array, Integer numero) {
		String numero1 = "";
		if (array == null || numero >= array.length) {
			System.out.println("La lista esta vacía");
		} else {
				numero1 = array[numero];
		}
		return numero1;
	}
	

}
