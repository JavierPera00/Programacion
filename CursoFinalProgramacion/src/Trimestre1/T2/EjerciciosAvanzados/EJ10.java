package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class EJ10 {

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
				} else {

					if (tableroJugador > 60) {
						tableroJugador = 60 - (tableroJugador + jugador - 60);
						System.out.println("Te has pasado.... Vuelves al: " + tableroJugador);
						v = false;

					} else if (tableroJugador == 19) {
						System.out.println("Has caído en la casilla 19, te resta una");
						tableroJugador--;
						r = false;
					} else if (tableroJugador == 31) {
						System.out.println("Has caído en la casilla 31, te resta dos");
						tableroJugador = tableroJugador - 2;
						r = false;
					} else if (tableroJugador == 56) {
						System.out.println("Has caído en la casilla 56, te resta tres");
						tableroJugador = tableroJugador - 3;
						r = false;
					} else if (jugador == 6) {
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
				}//cierre else
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
				} else {
					if (tableroOrdenador > 60) {
						tableroOrdenador = 60 - (tableroOrdenador + ordenador - 60);
						System.out.println("Te has pasado.... Vuelves al: " + tableroOrdenador);
						f = false;
					} else if (tableroOrdenador == 19) {
						System.out.println("Has caído en la casilla 19, te resta una");
						tableroOrdenador--;
						f = false;
					} else if (tableroOrdenador == 31) {
						System.out.println("Has caído en la casilla 31, te resta dos");
						tableroOrdenador = tableroOrdenador - 2;
						f = false;
					} else if (tableroOrdenador == 56) {
						System.out.println("Has caído en la casilla 56, te resta tres");
						tableroOrdenador = tableroOrdenador - 3;
						f = false;
					} else if (ordenador == 6) {
						System.out.println("Ha sacado un seis, vuelve a tirar");
						f = true;
					}

					else if (tableroOrdenador % 5 == 0) {
						tableroOrdenador += 5;
						System.out.println("De Oca en Oca y tiro porque me toca: " + tableroJugador);
						f = true;

					} else {
						System.out.println("El dado dió: " + ordenador + ". Posicion del tablero del ordenador: "
								+ tableroOrdenador);
						f = false;
					}

				}//cierra else
				System.out.println();
				System.out.println("Tu turno:");
			}
		} while (r);

		scanner.close();
	}

}
