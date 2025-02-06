package Trimestre1.T3.ejAvanzados;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String[][] tablero = new String[10][10]; // 5minas
		String[][] minas = new String[10][10]; // 5minas
		imprimirTablero(tablero);
		minas (minas);
		scanner.close();
	}

	public static void imprimirTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tablero.length; j++) {
				if (i == 0) {
					tablero[i][j] = " __";
				} else {
					tablero[i][j] = "|__";
					if (j == 9) {
						tablero[i][j] = "|__|";
					}
				}
				System.out.print(tablero[i][j]);
			}
		}
	}
	
	public static void minas (String [][] minas) {
		
	}

}
