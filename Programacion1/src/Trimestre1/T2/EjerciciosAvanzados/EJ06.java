package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//Entre 0 y 4
		int numeroAleatorio = random.nextInt(4);
		
		
		Boolean v = true;
		int numero = 0;
		while (v) {
			System.out.println("Indique la apuesta |Entre 0 y 6|");
				numero = scanner.nextInt();
				if (numero < 0 || numero > 6) {
					System.out.println("Apuesta invalida");
					v = true;
				}
				else {
					v = false;
				}
		}
		
		Boolean f = true;
		int apuesta = 0;
		while(f) {
			apuesta = random.nextInt(7);
				//Apuesta diferente
				if (apuesta != numero) {
					f = false;
				}
		}
		
		System.out.println("El ordenador ha hecho su apuesta de : " + apuesta);
		
		Boolean r = true;
		int chinasMano = 0;
		while (r) {
			System.out.println("¿Cuántas chinas escoondes |Entre 0 y 3|?");
				chinasMano = scanner.nextInt();
					if (chinasMano < 0 || chinasMano > 3) {
						System.out.println("Números inválidos");
						r = true;
					}
					else {
						r = false;		
					}
		}	
		int total = chinasMano + numeroAleatorio;
		System.out.println("Número de chinas totales es de: " + total);
		if (numero == total) {
			System.out.println("Has ganado");
		}
		else if (apuesta == total) {
			System.out.println("Has perdido");
		}
		else {
			System.out.println("No ha ganado nadie");
		}
	scanner.close();
	}

}
