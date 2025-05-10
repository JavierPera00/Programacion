package Trimestre3.Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EJ02 {

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
 
		}catch (InputMismatchException e) {
			System.out.println("Has escrito una letra | ERROR");
		} finally {
			sc.close();
		}
	}

}
