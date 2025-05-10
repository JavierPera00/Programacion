package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		int contador = 0;
		int sumar = 0;
		Boolean verificar = true;

		do {
			System.out.println("Escribe un número entre 1 y 10");
			numero = scanner.nextInt();

			if (numero < 0 || numero > 10) {
				System.out.println("Número erróneo");
				verificar = false;

			} else if (numero == 0) {
				System.out.println("Fin de programa");
				verificar = false;
				break;
			} else {
				for (int i = 0; i < 9; i++) {
					contador = contador + numero;
					System.out.print(contador + " + ");
					sumar = sumar + contador;
				}
				numero = contador + numero;
				sumar = sumar + numero;

				System.out.println(numero + " = " + sumar);
				verificar = true;
			}

		} while (verificar != true);
		scanner.close();
	}
}
