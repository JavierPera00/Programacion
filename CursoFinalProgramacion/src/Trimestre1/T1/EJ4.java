package Trimestre1.T1;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer fechaActual = 2024;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba su año de nacimiento");
		Integer edad = scanner.nextInt();
		Integer fecha =fechaActual - edad;
		System.out.println("Tu edad es: "+ fecha);
		scanner.close();
		
		
	}

}
