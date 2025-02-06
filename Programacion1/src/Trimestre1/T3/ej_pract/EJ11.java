package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe su nombre completo");
		String nombre = scanner.nextLine();
		String[] nombre1 = nombre.split(" ");//guarada en array por espacios
		if (nombre1.length <3) {
			System.out.println("Pon tu nombre y apellidos correctamente");
		}
		else {
			//saca el interior de los arrays
			String name = nombre1[0];
			String apellido1 = nombre1[1];
			String apellido2 = nombre1[2];
			System.out.println("Tu nombre: "+ name+ ".\nTu apellido: "+ 
					apellido1+ ".\nTu segundo apellido es: "+ apellido2+".");
		}
		scanner.close();
	}

}
