package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ08 {

	public static final String ADD = "ADD";
	public static final String SUB = "SUB";
	public static final String MUL = "MUL";
	public static final String DIV = "DIV";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculadora
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime un número: ");
		Integer numero1 = scanner.nextInt();
		System.out.print("Dime un segundo número: ");
		Integer numero2 = scanner.nextInt();

		scanner.nextLine();
		System.out
				.println("Calculadora: \n 1. Sumar(ADD):\n 2. Restar(SUB):\n 3. Multiplicar(MUL):\n 4. Dividir(DIV):");
		String respuesta = scanner.nextLine().toUpperCase();

		System.out.println("Su solución es: " + calcular(respuesta, numero1, numero2));
		scanner.close();
	}

	public static Integer calcular(String respuesta, Integer numero1, Integer numero2) {
		Integer respuesta1 = 0;
		if (respuesta.equals(ADD)) {
			respuesta1 = numero1 + numero2;
		} else if (respuesta.equals(SUB)) {
			respuesta1 = numero1 - numero2;
		} else if (respuesta.equals(MUL)) {
			respuesta1 = numero1 * numero2;
		} else if (respuesta.equals(DIV)) {
			respuesta1 = numero1 / numero2;
		}
		return respuesta1;
	}
}