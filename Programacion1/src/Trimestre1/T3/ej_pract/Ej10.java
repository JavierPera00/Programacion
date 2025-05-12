package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tamaño = 0;
		int principio = 0;
		int finall = 1;
		int resultado = 0;
		// ArrayList<Integer> arraylist = new ArrayList<Integer>();
		do {
			System.out.println("Escribe el tamaño de serie Fibonacci, mayor que dos");
			tamaño = scanner.nextInt();
			Integer[] listaPalabras = new Integer[tamaño];
			if (tamaño > 2) {
				// FIBONACCI
				System.out.print(principio + " " + finall + " ");
				for (int i = 0; i < listaPalabras.length - 2; i++) {
					resultado = finall + principio;
					System.out.print(" " + resultado + " ");
					principio = finall;
					finall = resultado;
				}
			} else {
				System.err.println("ERROR, escribe un número superior a 2");
			}
		} while (!(tamaño > 2));
		scanner.close();

	}
}