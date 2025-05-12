
package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		System.out.println("¿Cuantos números quieres guardar??");
		int repeticion = scanner.nextInt();

		for (int i = 0; i < repeticion; i++) {
			System.out.print("Escribe el primer número: ");
			int num = scanner.nextInt();
			arraylist.add(num);
		}
		System.out.print(arraylist);

		// Orden inverso

		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		arraylist2 = arraylist;
		System.out.println();
		for (int i = arraylist2.size() - 1; i >= 0; i--) {
			System.out.print(arraylist2.get(i) + " ");
		}
		scanner.close();
	}
}
