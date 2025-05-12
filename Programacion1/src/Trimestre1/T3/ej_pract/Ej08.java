package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuantos números quieres guardar??");
		int repeticion = scanner.nextInt();

		Integer[] arraylist = new Integer[repeticion];
		for (int i = 0; i < repeticion; i++) {
			System.out.print("Escribe el primer número: ");
			int num = scanner.nextInt();
			arraylist[i] = num;
		}

		for (int i = 0; i < arraylist.length; i++) {
			System.out.print(arraylist[i] + " ");
		}

		System.out.println();

		for (int i = 0, y = arraylist.length - 1; i < y; i++, y--) {
			Integer auxiliar = arraylist[i];
			arraylist[i] = arraylist[y];
			arraylist[y] = auxiliar;

		}

		// Recorrer array imprimir
		for (int i = 0; i < arraylist.length; i++) {
			System.out.print(arraylist[i] + " ");
		}

		scanner.close();
	}
}
