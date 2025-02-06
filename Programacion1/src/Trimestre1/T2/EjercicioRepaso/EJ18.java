package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
	
		System.out.println("Escribe una palabra");
			String palabra1 = scanner.nextLine().trim();
			String [] split = palabra1.split("");
			int split1 = split.length;
				for (int i = split1-1; i >= 0; i--) {
					String palabra = split[i];
						System.out.print(palabra);
				}
		scanner.close();
	}
}
       