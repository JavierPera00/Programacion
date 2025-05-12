package Trimestre1.T3.ejAvanzados;

import java.util.Random;
import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Random randon = new Random();

		System.out.print("Cuantos dados quieres tirar: ");
		Integer repeticion = scanner.nextInt();
		Integer[] lista1 = new Integer[repeticion];
		Integer[] estadisticas = new Integer[13];

		for (int i = 0; i < lista1.length; i++) {
			Integer dado1 = randon.nextInt(1, 7);// cuenta uno menos
			Integer dado2 = randon.nextInt(1, 7);// cuenta uno menos
			lista1[i] = dado1 + dado2;
		}

		for (int i = 0; i < repeticion; i++) {
			for (int j = 2; j <= 12; j++) {
				if (estadisticas[j] == null) { //Inicializa a 0
					estadisticas[j] = 0;
				}
				if (lista1[i] == j) { //Si en la lista hay una posición que es = a j entra
					estadisticas[j] += 1; //En la posición de estadisticas incrementa si se repite a 1
				}
			}
		}
		
		for (int i = 2; i <= 12; i++) {
			System.out.println("La suma de dados " + (i) + " se ha repetido " + estadisticas[i] + " veces");
			}
		
		

		scanner.close();
	}

}
