package Trimestre1.T2;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int resultado = 0;
		
		System.out.println("Escribe un número para ver la tabla multiplicación");
		Integer numero = scanner.nextInt();
		
		for(int i = 0;i <=10; i++) {
			
			resultado = numero * i;
			System.out.println(numero + " x "+ i + " = " + resultado);
		}
		scanner.close();
	}
}
