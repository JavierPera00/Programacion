package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una palabra, para que sea deletreado");
		String palabra = scanner.nextLine();
		String[] deletreo = palabra.split("");
		
		for (String string : deletreo) {
			System.out.print(string + "\t");
		}
		scanner.close();
	}
}
