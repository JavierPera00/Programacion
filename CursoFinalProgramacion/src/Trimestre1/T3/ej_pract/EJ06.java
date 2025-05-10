package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in); 
		ArrayList<String> lista1 = new ArrayList<>();
		
		System.out.println("Escribe una palabra");
		String palabra1 = scanner.nextLine().trim();
		lista1.add(palabra1);
		
		System.out.println("Escribe una segunda palabra");
		String palabra2 = scanner.nextLine().trim();
		lista1.add(palabra2);
		
		System.out.println("Escribe una tercera palabra");
		String palabra3 = scanner.nextLine().trim();
		lista1.add(palabra3);
		
		for (int i = 0; i < lista1.size(); i++) {
			System.out.print(lista1.get(i));
		}
		
		scanner.close();
	}

}
