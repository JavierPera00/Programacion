package Trimestre2.MetodosInicio.EJ34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List <String> lista = new ArrayList <>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe una cadena: ");
			String cadena = scanner.nextLine();
			lista.add(cadena);
		}
		//1
		System.out.println("Ejercicio 1");		
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		for (String string : lista) {
			System.out.print(string + " | ");
		}	
		//2
		/*System.out.println();
		System.out.println("Ejercicio 2");
		for (String string : lista) {
			if(string.isEmpty()) {
				System.out.println("Has puesto cadena vacía");
			}	
		}*/		
		Boolean v = lista.contains("");
		if(v = true) {
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
