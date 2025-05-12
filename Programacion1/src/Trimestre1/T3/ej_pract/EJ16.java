package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		int pal = 1;
		Boolean b = true;
		while (b) {
			System.out.print("Escribe una frase, y contaré las 'a' y las palabras:");
			String frase = scanner.nextLine().trim();
			if (frase.isBlank() || frase.isEmpty()) {
				System.out.println("No has escrito nada");
			} else {
				String[] dividir = frase.split("");
				for (int i = 0; i < frase.length(); i++) {
					if (dividir[i].equalsIgnoreCase("a") || dividir[i].equalsIgnoreCase("á")) {
						cont++;
					}
					String palabras = dividir[i];
					if (palabras.isBlank()) {
						pal++;
					}
				}
				System.err.println("Hay: " + cont + " 'a' en el texto escrito, y " + pal + " palabras");
			}
			System.out.println();
		}
		scanner.close();
	}

}
