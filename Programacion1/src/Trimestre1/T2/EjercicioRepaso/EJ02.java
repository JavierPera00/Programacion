package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una ciudad");
		String ciudad1 = scanner.nextLine();
		
		System.out.println("Escribe una segunda ciudad");
		String ciudad2 = scanner.nextLine();
		
		System.out.println("Escribe una tercera ciudad");
		String ciudad3 = scanner.nextLine();
	
		
		 if (ciudad1.length() > ciudad2.length() && ciudad2.length() > ciudad3.length()) {
			
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			
		}else if (ciudad1.length() > ciudad3.length() && ciudad3.length() > ciudad2.length()) {
		
			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
		
		}else if (ciudad2.length() > ciudad1.length() && ciudad1.length() > ciudad3.length()) {
			
			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			
		}else if (ciudad2.length() > ciudad3.length() && ciudad3.length() > ciudad1.length()) {	
			
			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			
		}else if (ciudad3.length() > ciudad2.length() && ciudad2.length() > ciudad1.length()) {	
			
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);
			
		}else if (ciudad3.length() > ciudad1.length() && ciudad1.length() > ciudad2.length()) {
			
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		}
			scanner.close();
	}

}
