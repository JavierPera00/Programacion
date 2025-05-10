package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculadora
		Scanner scanner = new Scanner(System.in);
		Integer numero1 = 2;
		Integer numero2 = 3;
		System.out.println("Su resultado es: " + sumar(numero1,numero2));

		scanner.close();
	}
	public static Integer sumar (Integer numero, Integer numero2) {
		Integer respuesta = numero + numero2;
		return respuesta;
	}

}
