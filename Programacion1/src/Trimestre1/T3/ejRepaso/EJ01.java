package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 

		//Ejercicio 1:
		int suspensos = 0;
		for (int i = 0; i < listaNotas.length;i++) {
			if (listaNotas[i] > 5) {
				suspensos++;
			}	
		}
		System.out.println("Total de alumnos suspensos: " + suspensos);	
		scanner.close();
	}	

}
