package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;

		int tamaño = 0;
		int num1 = 0;
		int num2 = 1;
		int resultado = 0;

		// ArrayList<Integer> arraylist = new ArrayList<Integer>();
		do {
			System.out.println("Escribe el tamaño de su lista");
			tamaño = scanner.nextInt();
			Integer[] listaPalabras = new Integer[tamaño];
			if (tamaño <= 2) {
				System.out.println("Escribe un número mayor a dos");
				v = true;
			} else {
				// FIBONACCIO
				System.out.print(num1 + "  " + num2 + " ");
				for (int i = 0; i < listaPalabras.length - 2; i++) {
					resultado = num2 + num1;
					System.out.print(" " + resultado + " ");
					num1 = num2;
					num2 = resultado;
				}
				v = false;
			}

		} while (v);
		scanner.close();
	}
}
