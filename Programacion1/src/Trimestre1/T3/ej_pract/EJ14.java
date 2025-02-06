package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while (v) {
			System.out.print("Escribe un texto:");
			String texto = scanner.nextLine().trim();
			String[] division = texto.split(" ");

			if (texto.isBlank() || texto.isEmpty()) {
				System.err.println("Error al ingresar numero");
				v = true;
			} else {
				for (int i = 0; i < division.length; i++) {
					String palabra = division[i];
					if (i == 0) {
						String primera = palabra.toLowerCase();
						System.out.print(primera);
					} else if (i > 0) {
						String resto = division[i];
						String[] mayus = resto.split("");

						for (int y = 0; y <= mayus.length - 1; y++) {
							String ma = mayus[y];

							if (y == 0) {
								System.out.print(ma.toUpperCase());
							} else {
								System.out.print(ma);
								v = false;
							}
						}
					}

				}
			}

		}
		scanner.close();
	}

}
