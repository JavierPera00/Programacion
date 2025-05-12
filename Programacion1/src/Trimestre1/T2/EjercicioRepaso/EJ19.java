package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while(v) {
			
			System.out.println("\t1 - Pasar Pesetas a Euros");
			System.out.println("\t2 - Pasar Euros a Pesetas");
			System.out.println("\t3 - Salir");
			int num = scanner.nextInt();
			
			if (num == 1) {
				System.out.print("¿Cuanto quieres cambiar?");
				Double cant = scanner.nextDouble();
				Double euros = cant / 166.39;
				System.out.println("Le quedarian con "+ euros + " €");
				
			}else if (num == 2) {
				System.out.print("¿Cuanto quieres cambiar?");
				Double cant = scanner.nextDouble();
				Double pesetas = cant * 166.39;
				System.out.print("Le quedarian con "+ pesetas + " pesetas");
				
			}else if (num == 3) {
				System.out.print("Has salido del programa");
				v = false;
			}else {
				System.out.println("Escribe un número entre 1 y 3");
			}
		}
		scanner.close();
	}
}
