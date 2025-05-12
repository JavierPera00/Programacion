package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		//Ejercicio 4:
		Boolean f = true;
		int cont1 = 0;
		while (f) {
			System.out.print("¿Que nota buscas?");
		    int nota = scanner.nextInt();
		    
		    for (int i = 0; i < listaNotas.length; i++ ) {
		    	if (listaNotas [i] > nota) {
		    		cont1 ++;  
		    	}
		    }
		    System.out.println("Hay " + cont1 +" notas mayores a la indicada");
		    f = false;
		}
		scanner.close();
	}

}
