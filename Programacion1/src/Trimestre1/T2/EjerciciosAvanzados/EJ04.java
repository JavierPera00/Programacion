package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		String palabra1 = "";
		
		while (v) {
			System.out.println("Escribe un numero");
			String numero = scanner.nextLine();

			String [] split = numero.split("");
			int split1 = split.length;
			
				//reversa
				for (int f = split1-1; f >= 0; f--) {
					palabra1 += split[f];
				}
				if (numero.equals(palabra1)) {
					System.out.println("Es capicúa");
					v = true;
				}
				else {
					System.out.println("No es capicúa");
					v = false;
					}
				}	
		scanner.close();
	}

}
