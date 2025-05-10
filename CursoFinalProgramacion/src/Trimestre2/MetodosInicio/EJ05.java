package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		Integer numero1 = scanner.nextInt();
		System.out.print("Escribe un segundo número: ");
		Integer numero2 = scanner.nextInt();
		System.out.println("El resultado es: " + sumar(numero1,numero2));
		scanner.close();
	}
	
	public static Integer sumar (Integer numero, Integer numero2) {
		Integer respuesta = numero + numero2;
		return respuesta;
	}

}
