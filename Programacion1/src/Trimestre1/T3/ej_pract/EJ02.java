package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while (v) {
			System.out.println("Escribe un número");
			int numero = scanner.nextInt();
			if (numero > 0) {
				for (int i = 0; i < 5; i++) {
					int resultado = numero * numero;
					arraylist.add(resultado);
					numero++;
				}
				System.out.println();
				v = false;
			}
			System.out.print(arraylist);
		}
		scanner.close();
	}
}
