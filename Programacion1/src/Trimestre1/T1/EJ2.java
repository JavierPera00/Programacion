package Trimestre1.T1;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Escrine su nombre");
		String nombre = scanner.nextLine();
		
		System.out.println("Bienvenido "+ nombre);
		
		System.out.println("¿De donde eres?");
		String lugar = scanner.nextLine();
		
		System.out.println("Que tal se vive en "+ lugar);	
		
		System.out.println("Gracias.Un saludo" );
		
		
		scanner.close();
		
		
	}

}
