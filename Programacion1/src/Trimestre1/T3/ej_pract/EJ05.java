package Trimestre1.T3.ej_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in); 
		ArrayList<Integer> lista = new ArrayList<>();
		
		
		System.out.println("¿Cuantos números quieres guardar??");
		int repeticion = scanner.nextInt();
		
		for (int i = 0; i < repeticion ;i++) {
			System.out.print("Escribe el " + i + " número: ");
			int num1= scanner.nextInt();
			lista.add(num1);
		}
		
		
	//lo nuevo	
		int variablemax = lista.get(0); // Para encontrar el máximo
		int variablemin = lista.get(0); // Para encontrar el mínimo

		for (int j = 0; j < lista.size(); j++) {
			
		    int lista2 = lista.get(j);
		    if (lista2 > variablemax) {
		        variablemax = lista2;
		    }
		    if (lista2 < variablemin) {
		        variablemin = lista2;
		    }
		}
		
		System.out.println("El número mayor es: " + variablemax);
		System.out.println("El número menor es: " + variablemin);
		
		
		scanner.close();
	}

}
