package Trimestre2.MetodosInicio.EJ31;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantas fechas quieres agregar: ");
		Integer numeroFechas = scanner.nextInt();
		
		
		
		
		for (int i = 0; i < numeroFechas; i++) {
			System.out.println("Escribe el dia");
			String dia = scanner.nextLine();
			System.out.println("Escribir el mes");
			String mes = scanner.nextLine();
		}
		
		
		
		scanner.close();
	}


}
