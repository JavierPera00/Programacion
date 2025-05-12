package Trimestre1.T1;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuánto te gustaría ganar al año?");
		Integer sueldoAnual = scanner.nextInt();
		Integer sueldoMensual = sueldoAnual/12;
		System.out.println("Tendrías un sueldo mensual de "+ sueldoMensual);
		scanner.close();	
	}

}
