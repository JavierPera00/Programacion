package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculadora
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime un número: ");
		Integer numero1 = scanner.nextInt();
		System.out.print("Dime un segundo número: ");
		Integer numero2 = scanner.nextInt();

		System.out.println("Calculadora: \n 1. Sumar:\n 2. Restar:\n 3. Multiplicar:\n 4. Dividir:");
		Integer respuesta = scanner.nextInt();
		if (respuesta == 1){
			System.out.println("La Suma es de: " + sumar(numero1, numero2));
		} else if (respuesta == 2) {
			System.out.println("La Resta es de: " + restar(numero1, numero2));
		} else if (respuesta == 3) {
			System.out.println("La Multiplicación es de: " + multiplicar(numero1, numero2));
		} else if (respuesta == 4) {
			System.out.println("La División es de: " + dividir(numero1, numero2));
		}
		scanner.close();
	}

	public static Integer sumar(Integer numero, Integer numero2) {
		Integer respuesta = numero + numero2;
		return respuesta;
	}

	public static Integer restar(Integer numero, Integer numero2) {
		Integer respuesta = numero - numero2;
		return respuesta;
	}

	public static Integer multiplicar(Integer numero, Integer numero2) {
		Integer respuesta = numero * numero2;
		return respuesta;
	}

	public static Integer dividir(Integer numero, Integer numero2) {
		if (numero2 == 0) {
			return 0;
		}
		Integer respuesta = numero / numero2;
		return respuesta;
	}
}
