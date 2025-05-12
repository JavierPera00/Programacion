package Trimestre1.EjerciciosT1;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		String numero = scanner.nextLine();
		
		System.out.println("Escribe un segundo número");
		String numero2 = scanner.nextLine();
		
		
		Long num1 = Long.parseLong(numero);
		Long num2 = Long.parseLong(numero2);
		
		Long multiplicar = num1*num2;
		System.out.println("La multiplicación de ambos números, da: "+ multiplicar);
		scanner.close();
	}

}
