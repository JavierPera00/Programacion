package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		int numero;
		do {
			System.out.println("Escribe N");
			numero = scanner.nextInt();
			
				for(int i = 0; i < numero; i++) {
					System.out.println();
					for (int y = 0; y < numero; y++) {
						if (y == i || i+y == numero-1) { //<----Esto es lo que influye
							System.out.print(" * ");
						}else {
							System.out.print(" - ");
						}	
					}
				}
		}while(numero <= 0);

		scanner.close();
	}

}
