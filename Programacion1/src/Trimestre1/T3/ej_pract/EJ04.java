package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		ArrayList<Integer> lista = new ArrayList<>();
		
		
		System.out.println("¿Cuantos números quieres guardar??");
		int repeticion = scanner.nextInt();
		
		for (int i = 0; i < repeticion ;i++) {
			System.out.print("Escribe el primer número:");
			int num1= scanner.nextInt();
			lista.add(num1);
		}
		
		for(int y = lista.size()-1; y >= 0; y--) {
			System.out.print(lista.get(y)+ " ");
		}
		scanner.close();
		
	}

}
