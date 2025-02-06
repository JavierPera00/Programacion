package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		// Ejercicio 3:
		Boolean encontrado = true;
		int cont = 0;

		System.out.print("¿Que nota buscas?");
		Integer nota = scanner.nextInt();
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == nota) {
				cont = i;
				encontrado = true;
				System.out.println("La nota buscada existe y está en la posición: " + cont);
				
			}
		}
		if (!encontrado) {
			System.out.println("La nota buscada no existe ");
		}

		scanner.close();
	}

}
