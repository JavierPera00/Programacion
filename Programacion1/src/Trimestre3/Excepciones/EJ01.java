package Trimestre3.Excepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		Integer num = 0;
 
		try {
			do {
				System.out.println("Ingresa números:");
				num = sc.nextInt();
				if (!num.equals(-1)) {
					numeros.add(num);
				}
			} while (!num.equals(-1));
			System.out.println("Lista de números: " + numeros);
 
		} finally {
			sc.close();
		}
	}
}
