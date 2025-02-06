package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int y = 0; y < 5; y++) {
				if (y == i - 1) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
		}
		System.out.println("Gracias un placer...😃");
		scanner.close();
	}
}
