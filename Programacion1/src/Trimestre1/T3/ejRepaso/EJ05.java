package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 5:
		Scanner scanner = new Scanner(System.in); 
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 

		for (int i = 0; i< listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				listaNotas[i] = 5;
			}
		}
		for (Integer imprimir : listaNotas) {
			System.out.print(imprimir + " ");
		}
		scanner.close();
	}

}
