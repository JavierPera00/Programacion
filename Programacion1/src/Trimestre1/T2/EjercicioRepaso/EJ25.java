package Trimestre1.T2.EjercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class EJ25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] juego = { "piedra", "papel", "tijera" };
		
		int puntacion = 0;
		Boolean v = true;
		while (v) {
			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			// MENU
			System.out.println("\t Piedra");// 1
			System.out.println("\t Papel");// 2
			System.out.println("\t Tijera");// 3
			String respuesta = scanner.nextLine().toLowerCase().trim();

			int indiceAleatorio = random.nextInt(0,3);
			String palabra = juego[indiceAleatorio];
			System.out.println(palabra);

			if (respuesta.equals(palabra)) {
				System.out.println("Tu: " + respuesta + " vs Máquina:" + palabra);
				System.err.println("Empate");
				System.out.println("Puntuación: " + puntacion);

			} else if (respuesta.equals("piedra") && palabra.equals("papel")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Pierdes..!!");
				System.out.println("Puntuación: " + puntacion);

			} else if (respuesta.equals("piedra") && palabra.equals("tijera")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.err.println("Ganas..!!");
				puntacion++;
				System.out.println("Puntuación: " + puntacion);

			} else if (respuesta.equals("papel") && palabra.equals("piedra")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Ganas..!!");
				puntacion++;
				System.out.println("Puntuación: " + puntacion);

			} else if (respuesta.equals("papel") && palabra.equals("tijera")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.err.println("Pierdes..!!");
				System.out.println("Puntuación: " + puntacion);
				
			} else if (respuesta.equals("tijera") && palabra.equals("piedra")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.err.println("Pierdes..!!");
				System.out.println("Puntuación: " + puntacion);
				
			} else if (respuesta.equals("tijera") && palabra.equals("papel")) {
				System.out.println("Tu: " + respuesta + " vs Maquina: " + palabra);
				System.out.println("Ganas..!!");
				puntacion++;
				System.out.println("Puntuación: " + puntacion);
			}
		}
		scanner.close();
	}
}
