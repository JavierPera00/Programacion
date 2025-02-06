package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una plabra para dividirla");
		String palabra = scanner.nextLine();
		int longitud = palabra.length();
	
		for (int i = 0; i <= longitud-1; i++) {
			String letra = palabra.substring(i,i+1);
			System.out.println(letra);	
		}	
		scanner.close();	
	}
}
