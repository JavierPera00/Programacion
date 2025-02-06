package Trimestre1.T3.ejAvanzados;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[][] tablero = new String[3][3];
		Boolean v = true;
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = " * ";
			}
		}
		System.err.println("JUEGO TRES EN RAYAS!!!");

		for (int i = 0; i < tablero.length; i++) {
			System.out.println();
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print("|" + tablero[i][j] + "|");
			}
			System.out.println();
		}
		// Juego
		while (v) {
			// Jugador 1 (X)
			boolean j1 = true;
			while (j1) {
				System.out.print("J1 | Dime columna(0,1,2): ");
				Integer columna = scanner.nextInt();
				System.out.print("J1 | Dime la fila(0,1,2): ");
				Integer fila = scanner.nextInt();

				if (tablero[fila][columna].equals(" * ")) {
						tablero[fila][columna] = " x ";
						break;
				} 
				else {
					System.err.println("No puedes reescribir en una celda ocupada");
				}
			}
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					System.out.print("|" + tablero[i][j] + "|");
				}
				System.out.println();
			}//Fin de for
			if ((tablero[0][0].equals(" x ") && tablero[0][1].equals(" x ") && tablero[0][2].equals(" x ")) || 
					(tablero[1][0].equals(" x ") && tablero[1][1].equals(" x ") && tablero[1][2].equals(" x ")) ||																												
					(tablero[2][0].equals(" x ") && tablero[2][1].equals(" x ") && tablero[2][2].equals(" x ")) || 																												
					(tablero[0][0].equals(" x ") && tablero[1][0].equals(" x ") && tablero[2][0].equals(" x ")) || 																									
					(tablero[0][1].equals(" x ") && tablero[1][1].equals(" x ") && tablero[2][1].equals(" x ")) || 																												
					(tablero[0][2].equals(" x ") && tablero[1][2].equals(" x ") && tablero[2][2].equals(" x ")) || 																				// 2
					(tablero[0][0].equals(" x ") && tablero[1][1].equals(" x ") && tablero[2][2].equals(" x ")) || // Diagonal
					(tablero[0][2].equals(" x ") && tablero[1][1].equals(" x ") && tablero[2][0].equals(" x "))){// Diagonal
				System.out.println("¡J1 ha ganado!");
				v = false;
				break;
			}
			// Jugador 2 (O)
			boolean j2 = true;
			while (j2) {
				System.out.print("J2 | Dime columna(0,1,2): ");
				Integer columna1 = scanner.nextInt();
				System.out.print("J2 | Dime la fila(0,1,2): ");
				Integer fila1 = scanner.nextInt();
				if (tablero[fila1][columna1].equals(" * ")) {
					tablero[fila1][columna1] = " 0 ";
					break;
				} else {
					System.err.println("No puedes reescribir en una celda ocupada");
				}
			}
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					System.out.print("|" + tablero[i][j] + "|");
				}
				System.out.println();
			}//Fin de for
			if ((tablero[0][0].equals(" 0 ") && tablero[0][1].equals(" 0 ") && tablero[0][2].equals(" 0 ")) || 
					(tablero[1][0].equals(" 0 ") && tablero[1][1].equals(" 0 ") && tablero[1][2].equals(" 0 ")) ||																												
					(tablero[2][0].equals(" 0 ") && tablero[2][1].equals(" 0 ") && tablero[2][2].equals(" 0 ")) ||																												
					(tablero[0][0].equals(" 0 ") && tablero[1][0].equals(" 0 ") && tablero[2][0].equals(" 0 ")) ||																												
					(tablero[0][1].equals(" 0 ") && tablero[1][1].equals(" 0 ") && tablero[2][1].equals(" 0 ")) || 																												
					(tablero[0][2].equals(" 0 ") && tablero[1][2].equals(" 0 ") && tablero[2][2].equals(" 0 ")) || 																												
					(tablero[0][0].equals(" 0 ") && tablero[1][1].equals(" 0 ") && tablero[2][2].equals(" 0 ")) ||//Diagonal
					(tablero[0][2].equals(" 0 ") && tablero[1][1].equals(" 0 ") && tablero[2][0].equals(" 0 "))) { //Diagonal 2
				System.out.println("¡J2 ha ganado!");
				v = false;
				break;
			}
		}
		scanner.close();
	}
}
