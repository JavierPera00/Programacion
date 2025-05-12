package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int jugador = 0;
		int ordenador = 0;
		int tableroJugador = 0;
		int tableroOrdenador = 0;

		// TRUE PARA REPETIR
		Boolean r = true;
		do {
			Boolean v = true;
			while (v) {
				System.out.println();
				System.out.println("Saca el dado");
				scanner.nextLine();
				jugador = random.nextInt(6) + 1;

				tableroJugador += jugador;
				if (tableroJugador == 60) {
					System.out.println("Has ganado a la máquina");
					r = false;
				} 
				else {

					if (tableroJugador > 60) {
						tableroJugador = 60 - (tableroJugador + jugador - 60);
						System.out.println("Te has pasado.... Vuelves al: " + tableroJugador);
						v = true;

					}

					else if (jugador == 6) {
						System.out.println("Has sacado un seis, vuelves a tirar");
						v = true;
					}

					if (tableroJugador % 5 == 0) {
						tableroJugador += 5;
						System.out.println("De Oca en Oca y tiro porque me toca: " + tableroJugador);
						v = true;
					}

					else {
						System.out.println("Tu dado a resultado: " + jugador + ". Su posicion es: " + tableroJugador);
						v = false;
					}
				}
			}
			System.out.println();
			System.out.println("Turno Ordenador:");
			System.out.println();
			System.out.println("El Ordenador saca dado...");
			System.out.println();

			Boolean f = true;
			while (f) {
				ordenador = random.nextInt(6) + 1;
				tableroOrdenador += ordenador;
				if (tableroOrdenador == 60) {
					System.out.println("Ha ganado la máquina");
					r = false;
				}

				else {
					if (tableroOrdenador > 60) {
						tableroOrdenador = 60 - (tableroOrdenador + ordenador - 60);
						System.out.println("Te has pasado.... Vuelves al: " + tableroOrdenador);
						f = false;
					}

					else if (ordenador == 6) {
						System.out.println("Ha sacado un seis, vuelve a tirar");
						f = true;
					}

					if (tableroOrdenador % 5 == 0) {
						tableroOrdenador += 5;
						System.out.println("De Oca en Oca y tiro porque me toca: " + tableroJugador);
						f = true;

					} else {
						System.out.println("El dado dió: " + ordenador + ". Posicion del tablero del ordenador: "
								+ tableroOrdenador);
						f = false;
					}

				}
				System.out.println();
				System.out.println("Tu turno:");
			}
		} while (r);

		scanner.close();
	}
}
