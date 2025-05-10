package Trimestre1.T2;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer contador=0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cual es tu nombre?");
		String nombre = scanner.nextLine();
		for(int i=0;i<=4;i++) {
			  contador= contador+1;
			System.out.println("Mi nombre es: " + nombre + ". Línea: "+ contador);
		}
	    scanner.close();
	}

}

