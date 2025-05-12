package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No esta terminado
		Scanner scanner = new Scanner(System.in); 
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		System.out.println("¿Cuantos números quieres guardar??");
		int repeticion = scanner.nextInt();
		
		for (int i = 0; i< repeticion;i++) {
			System.out.print("Escribe el primer número: ");
			int num = scanner.nextInt();
			arraylist.add(num);
		}
		System.out.println(arraylist);
		
		//Ordenar de menor a mayor;
		int numero = 0;
		for (int i = 0; i < arraylist.size(); i++) {
		int num = arraylist.get(i);
		
		if (numero <= num) {
			System.out.println(num);
		}
			
		
		}
		
		scanner.close();
		
		
	}

}

