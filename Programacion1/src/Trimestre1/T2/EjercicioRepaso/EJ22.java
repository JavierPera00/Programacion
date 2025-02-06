package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
			for (int i = 1; i <= 10; i++) {
				System.out.println("Dale al enter");
					scanner.nextLine();
						System.out.println(i);
							if(i ==10) {
							System.out.println("Fin de programa 🌟🚀");
							}
				}
		scanner.close();
	}
}
