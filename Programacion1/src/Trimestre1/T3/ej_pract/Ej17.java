package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double sumar = 0d;
		Double[] lista = new Double[] {5.4, 3.1, 9.0, 4.7 };

		for (Double double1 : lista) {
			System.out.print(double1 + "\t");
		}
		System.out.println();
		for (Double double2 : lista) {
			sumar += double2;
		}

		System.out.println("En total suma: " + sumar);
		scanner.close();
	}
}
