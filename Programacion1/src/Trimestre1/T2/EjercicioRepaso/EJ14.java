package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		String cambiarA = "";
		do {
			System.out.println("Escribe una frase");
			String contraseña = scanner.nextLine().trim().toLowerCase();
			if (contraseña.length() < 8) {
				v = true;

			} 
			else {
				cambiarA = contraseña.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1")
						.replaceAll("o", "0").replaceAll("t", "7");
				v = false;
			}
		} while (v);
		System.out.println(cambiarA);
		scanner.close();
	}
}







