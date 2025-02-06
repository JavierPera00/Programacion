package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		Integer numero = scanner.nextInt();
		System.out.println(factorial(numero));
		scanner.close();
	}
	public static Integer factorial (Integer numero) {
		Integer multiplicar = 1;
		for (int i = 1; i <= numero; i++) {
			multiplicar = multiplicar * i;
		}	
		return multiplicar;
		
	}
}
