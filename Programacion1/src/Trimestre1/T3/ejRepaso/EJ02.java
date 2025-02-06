package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		// Ejercicio 2:
		int media = 0;
		int contador = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] >= 5) {
				media = media + listaNotas[i];
				contador++;
			}
		}
		System.out.println(media);
		int calcularMedia = media / contador;
		System.out.println("Nota media de aprobados: " + calcularMedia);
		scanner.close();
	}

}
