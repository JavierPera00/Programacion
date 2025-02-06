package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int jugador = 0;
		int ordenador = 0;
		int tableroJugador = 0;
		int tableroOrdenador = 0;

		// TRUE PARA REPETIR
		Boolean v = true;
		while (v) {
			System.out.println();
			System.out.println("Saca el dado");
			scanner.nextLine();
			jugador = random.nextInt(6) + 1;

			tableroJugador += jugador;
			if (tableroJugador == 60) {
				System.out.println("Has ganado a la máquina");
				v = false;
			} else {
				if (tableroJugador > 60) {
					tableroJugador = 60 - (tableroJugador + jugador - 60);
					System.out.println("Te has pasado.... Vuelves al: " + tableroJugador);
				} else {
					System.out.println("Tu dado a resultado: " + jugador + ". Su posicion es: " + tableroJugador);
				}
			}

			System.out.println();
			System.out.println("Turno Ordenador:");
			System.out.println();
			System.out.println("El Ordenador saca dado...");
			System.out.println();

			ordenador = random.nextInt(6) + 1;
			tableroOrdenador += ordenador;
			if (tableroOrdenador == 60) {
				System.out.println("Ha ganado la máquina");
				v = false;
			} else {
				if (tableroOrdenador > 60) {
					tableroOrdenador = 60 - (tableroOrdenador + ordenador - 60);
					System.out.println("Te has pasado.... Vuelves al: " + tableroOrdenador);
				}
				System.out.println(
						"El dado dió: " + ordenador + ". Posicion del tablero del ordenador: " + tableroOrdenador);
			}
			System.out.println();
			System.out.println("Tu turno:");

		}
		scanner.close();
	}
}
