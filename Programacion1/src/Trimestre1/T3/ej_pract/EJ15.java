package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		String normal = "";
		String alreves = "";

		while (v) {
			System.err.print("Escribe un número:");
			String numero = scanner.nextLine();
			String[] letras = numero.split("");
			
			if (numero.isBlank() || numero.isEmpty()) {
				System.out.println("No has escrito nada");
				v = true;
			} else {
				// Normal
				for (int i = 0; i < letras.length; i++) {
					normal+= letras[i];;
				}
				// Alrevés
				for (int i = letras.length-1; i >= 0; i--) {
					alreves += letras[i];
				}
				// Comparar
				if (alreves.equals(normal)) {
					System.out.println("Es una palabra capicúa");
					v = true;
				}
				else {
					System.out.println("No es una palabra capicúa");
					v = true;
				}			
				System.out.println();
				v = false;
			}
			
			
			scanner.close();
		}
	}

}
