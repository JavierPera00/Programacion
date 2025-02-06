package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		do {
		System.out.println("Escribe un numero");
		int numero = scanner.nextInt();		
		System.out.println();
			if (numero <= 0) {
				System.out.println("0 no se puede");
				v = true;
			} 
			else {

				for (int i = 0; i < 1; i++) {
					System.out.print(" ");
					for (int y = 0; y < numero; y++) {
						if (y == numero-1) {
							System.out.print("______");
						}else {
							System.out.print("_______");
						}
					}
				}
					for(int i = 0; i < numero; i++) {
						System.out.println();
						System.out.print("|");
						for(int y = 0; y < numero; y ++) {
							System.out.print(" ____ |");
						}	
					}	
					v = false;
			}
			
		}while(v);
		
		scanner.close();
	}
}
