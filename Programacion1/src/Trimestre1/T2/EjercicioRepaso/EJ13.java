package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		String frase = "";
		String fraseCopia = "";
		do {
			System.out.println("Escribe una palabra");
			String palabra = scanner.nextLine().trim();
			fraseCopia = palabra.toLowerCase();
			
			if (fraseCopia.equals("fin")) {
				System.out.println(frase.trim());
				v = false;
			} else {
				frase = frase + " " + palabra;
			}
		} while (v);	
		scanner.close();
	}
}
