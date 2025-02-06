package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		Integer numero = scanner.nextInt();
		System.out.println(sumarNumero(numero));
		scanner.close();
	}
	public static Integer sumarNumero(Integer numero) {
		Integer sumar = 0;
		if (numero <= 0) {
			System.out.println("Numero menor a 0");
		} else {
			for (int i = 1; i <= numero; i++) {
				sumar += i;
			}
		}
		return sumar;
	}
}
