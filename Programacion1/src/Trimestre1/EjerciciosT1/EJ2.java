package Trimestre1.EjerciciosT1;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		Long numero = scanner.nextLong();
		
		System.out.println("Escribe un segundo número");
		Long numero2 = scanner.nextLong();
		
		
		Long multiplicar = numero*numero2;
		System.out.println("La multiplicación de ambos números, da: "+ multiplicar);
		scanner.close();
	}

}
