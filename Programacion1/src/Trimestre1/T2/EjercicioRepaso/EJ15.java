package Trimestre1.T2.EjercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(0,9);
		Boolean v = true;
		int intentos = 0;
		// System.out.println(numeroAleatorio); Comprobar número aleatorio

		do {
			System.out.println("Intenta adivinar el número");
			int numero = scanner.nextInt();

			intentos++;

			System.out.println(numeroAleatorio);
			if (numero == numeroAleatorio) {
				System.out.println("Felicidades, acertaste el número");
				v = false;
			} else {
				System.out.println("Número incorrecto, intentelo de nuevo");
				v = true;
			}
		} while (v);
		int resultado = 10 - intentos;
		System.out.println("Su puntuación es de: " + resultado);
		scanner.close();
	}
}
