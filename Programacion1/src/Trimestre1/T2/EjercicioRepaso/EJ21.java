package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while(v) {	
			System.out.println("Escribe un número para tabla N:N");
			int n = scanner.nextInt();	
				if (n > 0) {
					for (int i = 1; i <= n; i++) {
						System.out.println();
						for (int y = 0; y < n; y++) {
							if(y == i-1) {
								System.out.print(" * ");
							} else {
								System.out.print(" - ");
								}
							}
						}
					System.out.println("Gracias un placer...😃");
					v = false;
			}else {
				v = true;
			}	
	}
		scanner.close();
	}
}
