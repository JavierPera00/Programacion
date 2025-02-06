package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe tu telegrama");
		String mensaje = scanner.nextLine().toUpperCase();

		String[] palabras = mensaje.split(" ");

		// Calcular precio
		int contador = 0;
		for (int i = 0; i < palabras.length; i++) {
			if (!palabras[i].contains("STOP")) {
				contador++;
			}
		}
		System.out.println();
		Double precio = contador * 0.24d;
		System.out.println("El precio es de: " + precio);
		scanner.close();
	}

}
