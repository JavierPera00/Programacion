package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Boolean booleano = true;
	do {	
		System.out.println("\t ***Menu*** ");
		System.out.println("\t 1. Abrir ");
		System.out.println("\t 2. Guardar ");
		System.out.println("\t 3. Modificar  ");
		System.out.println("\t 4. Salir   ");
		 int seleccion = scanner.nextInt();
		
		if (seleccion == 1) {
			System.out.println("Has seleccionado Abrir");
			booleano = true;
		}
		if (seleccion == 2) {
			System.out.println("Has seleccionado Guardar");
			booleano = true;
		}
		if (seleccion == 3) {
			System.out.println("Has seleccionado Modificar");
			booleano = true;
		}
		if (seleccion == 4) {
			System.out.println("Bye Bye");
			booleano = false;
		}else {
			System.out.println("La opción no es correcta");
			booleano = true;
		}
	}
	while(booleano);	
	scanner.close();
	}

}
