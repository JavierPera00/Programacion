package Trimestre1.EjerciciosT1;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe su numero favorito");
		Integer numero = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Cual es tu ciudad favorita");
		String ciudad1 = scanner.nextLine();
		
		System.out.println("Su número favorito es: "+ numero + " "+ ",su ciudad favorita es: "+ ciudad1);
		scanner.close();
		
	}

}
