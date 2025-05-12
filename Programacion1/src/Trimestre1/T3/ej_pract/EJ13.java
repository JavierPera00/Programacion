package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;

		while (v) {
			System.out.println("Escribe una palabra");
			String palabra = scanner.nextLine();
			if (palabra.isBlank() || palabra.isEmpty()) {

			} else {
				String[] posicionamiento = palabra.split("");

				for (int i = posicionamiento.length - 1; i >= 0; i--) {
					System.out.print(posicionamiento[i] + "\t");
				}
				v = false;
			}
		}
		scanner.close();
	}

}
