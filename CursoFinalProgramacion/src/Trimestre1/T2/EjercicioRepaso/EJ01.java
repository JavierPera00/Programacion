package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe su nombre");
		String nombre = scanner.nextLine();
		
		System.out.println("Escribe tu fecha de nacimiento");
		Integer fecha = scanner.nextInt();
		
		int resultado = 2030 - fecha;
		
		
		System.out.println("Hola tu nombre es: "+ nombre+ " en el 2030 tendras: "+ resultado);
		
		scanner.close();
	}

}
