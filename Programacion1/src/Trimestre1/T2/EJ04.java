package Trimestre1.T2;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		Integer contador =0;
		do {
			System.out.println("Escribe un número");
			numero = scanner.nextInt();
			
			contador= contador+numero;
			
			
		}while(numero!=0);
		
		System.out.println(contador);
		scanner.close();
	}

}
