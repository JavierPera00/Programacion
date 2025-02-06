package Trimestre2.CabecerasMetodo;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;

		System.out.println("Escribe una palabra");
		String palabra = scanner.nextLine();
		System.out.println(comprobador(palabra, v));

		scanner.close();
	}

	public static Boolean comprobador(String p, Boolean v) {
		String[] divi = p.split("");
		String pal1 = "";
		String pal2 = "";
		for (int i = 0; i < divi.length; i++) {
			pal1 += divi[i];
		}
		for (int i = divi.length - 1; i <= 0; i--) {
			pal2 += divi[i];
		}

		if (pal1.equals(pal2)) {
			System.out.println("Es una palabra palíndroma");
			v = true;
		} else {
			System.out.println("No es una palabra palíndroma");
			v = false;
		}
		return v;
	}

}
