package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int s = 0;
		
			while(num == 0) {
				System.out.println("Escribe un número");
					num = scanner.nextInt(); 
						if (num > 0) {
							for ( int i =1; i < num; i+=2) {
								
								if(i ==num) {
									System.out.print(" " + i + " + ");
									s += i;
								}else {
									System.out.print(" " + i + " + ");
									s += i;
								
								}
							
							}	
						}
						System.out.println(" = " + s);
				}
		scanner.close();
	}
}
