package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int contador = 0;
		
		for (int i = 0; i < 9; i++) {
			num = num + 3;
			System.out.print(num + " + ");
			contador = contador + num;	
		}
		num = num +3;
		contador = contador + num;
		System.out.print(num + " = " + contador);
		scanner.close();
	}
}
