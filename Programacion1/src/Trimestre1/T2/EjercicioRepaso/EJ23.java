package Trimestre1.T2.EjercicioRepaso;

import java.util.Random;
import java.util.Scanner;

public class EJ23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int contador = 0;
		System.out.println("Cuantas veces quieres lanzar el dado");
		int numDado = scanner.nextInt();
		for (int i = 1; i <= numDado; i++) {
			int numeroAleatorio = random.nextInt(6) + 1;
			contador = contador + numeroAleatorio;
			System.out.println("Dado " + i + ": " + numeroAleatorio);
		}
		System.out.println(contador);
		scanner.close();
	}
}
