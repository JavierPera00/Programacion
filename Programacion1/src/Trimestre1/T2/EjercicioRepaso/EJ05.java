package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int contador = 1;
		for (int i = 1; i <= 19; i++) {
			System.out.print(contador + "_");
			contador++;
		}
		System.out.print(contador);
		scanner.close();
	}

}
