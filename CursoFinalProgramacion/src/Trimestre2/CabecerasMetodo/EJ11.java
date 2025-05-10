package Trimestre2.CabecerasMetodo;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String pal = scanner.nextLine();
		System.out.println(contar(pal));
		scanner.close();
	}
	public static Integer contar(String pal) {
		Integer cont = 0;
		String[] p = pal.split("");
		for (int i = 0; i < p.length; i++) {
			String digito = p[i];
			if (digito.equalsIgnoreCase("a") || digito.equalsIgnoreCase("e") || digito.equalsIgnoreCase("i")
					|| digito.equalsIgnoreCase("o") || digito.equalsIgnoreCase("u")) {
				cont++;
			}
		}
		return cont;
	}
}
