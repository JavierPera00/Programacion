package Trimestre2.MetodosInicio.EJ49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Set <String> lista = new HashSet <>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe una cadena: ");
			String cadena = scanner.nextLine();
			lista.add(cadena);
		}
		//1
		Set <String> lista2 = new HashSet <>();
		System.out.println("Ejercicio 1");		
		for (String string : lista) {
			String cadena = string.toUpperCase();
			lista2.add(cadena);
		}
		lista = lista2;
		System.out.println(lista);
		//2
		/*System.out.println();
		System.out.println("Ejercicio 2");
		for (String string : lista) {
			if(string.isEmpty()) {
				System.out.println("Has puesto cadena vacía");
			}	
		}*/		
		Boolean v = lista.contains("");
		if(v == true) {
			System.out.println("Has puesto cadena vacía");
		}
		//3		
		System.out.println("Ejercicio 3");
		Iterator <String> iterador = lista.iterator();
		while(iterador.hasNext()) {
			String cadena = iterador.next();
				if(cadena.length() <= 6) {
					iterador.remove();
				}
		}
		for (String string : lista) {
			System.out.println(string);
		}
		scanner.close();
	}
}
