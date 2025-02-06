package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Pon un número del 1 al 12");
		int numero = scanner.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Naciste en Enero");
			break;
		case 2:
			System.out.println("Naciste en Febrero");
			break;
		case 3:
			System.out.println("Naciste en Marzo");
			break;
		case 4:
			System.out.println("Naciste en Abril");
			break;
		case 5:
			System.out.println("Naciste en Mayo");
			break;
		case 6:
			System.out.println("Naciste Junio");
			break;
		case 7:
			System.out.println("Naciste en Julio");
			break;
		case 8:
			System.out.println("Naciste en Agosto");
			break;
		case 9:
			System.out.println("Naciste en Septiembre");
			break;
		case 10:
			System.out.println("Naciste en Octubre");
			break;
		case 11:
			System.out.println("Naciste en Noviembre");
			break;
		case 12:
			System.out.println("Naciste en Diciembre");
			break;
		}

		scanner.close();
	}

}
