package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Boolean v = true;
		do {

			System.out.println("Escribe un número");
			int num1 = scanner.nextInt();
			System.out.println("Escribe un segundo número");
			int num2 = scanner.nextInt();

			System.out.println("\t***MENU***");
			System.out.println("\t1.Sumar");
			System.out.println("\t2.Restar");
			System.out.println("\t3.Multiplicar");
			System.out.println("\t4.Dividir");
			System.out.println("\t0.Salir");
			int resultado = scanner.nextInt();

			if (resultado == 1) {
				int result = num1 + num2;
				System.out.println("Has elegido sumar: " + result);
				v = false;

			} else if (resultado == 2) {
				int result = num1 - num2;
				System.out.println("Has elegido restar: " + result);
				v = false;
			} else if (resultado == 3) {
				int result = num1 * num2;
				System.out.println("Has elegido multiplicar: " + result);
				v = false;
			} else if (resultado == 4) {
				
					if (num2 == 0) {
						System.out.println("No se puede dividir");
						v = false;
						
					}else {
						int result = num1 / num2;
						System.out.println("Has elegido Dividir: " + result);
						v = false;
					}
				
				
				
			} else if (resultado == 0) {
				System.out.println("Has elegido Salir: " + "Adios..");
				v = true;
			} else {
				System.out.println("No he entendido");
				v = false;
			}

		} while (!v);

		scanner.close();
	}

}
