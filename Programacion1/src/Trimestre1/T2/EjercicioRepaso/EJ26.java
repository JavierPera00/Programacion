package Trimestre1.T2.EjercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class EJ26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] juego = { "piedra", "papel", "papel" };

		int puntuacion = 0;
		Boolean v = true;
		while (v) {

			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			// MENU
			System.out.println("\t Piedra");// 1
			System.out.println("\t Papel");// 2
			System.out.println("\t Tijera");// 3
			String respuesta = scanner.nextLine().toLowerCase().trim();
			int indiceAleatorio = random.nextInt(0,2);
			String palabra = juego[indiceAleatorio].toLowerCase().trim();

			if (respuesta.equals(palabra)) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Empate");

			} else if (respuesta.equals("piedra") && palabra.equals("papel")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				puntuacion++;
				System.out.println("Ganas..!!");

			} else if (respuesta.equals("piedra") && palabra.equals("tijera")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Pierdes..!!");

			} else if (respuesta.equals("papel") && palabra.equals("piedra")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				puntuacion++;
				System.out.println("Ganas..!!");

			} else if (respuesta.equals("papel") && palabra.equals("tijera")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Pierdes..!!");
			} else if (respuesta.equals("tijera") && palabra.equals("piedra")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Pierdes..!!");

			} else if (respuesta.equals("tijera") && palabra.equals("papel")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				puntuacion++;
				System.out.println("Ganas..!!");
			}

			System.out.println("¿Deseas seguir jugando? | Si o No |");
			String seguir = scanner.nextLine().trim().toLowerCase();
			if (seguir.equals("si")) {
				v = true;
			} else if (seguir.equals("no")) {
				System.out.println("Su puntuación es de: " + puntuacion);
				v = false;
			}
		}
		scanner.close();
	}

}
