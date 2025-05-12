package Trimestre1.T2;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra1;
		String palabra2;
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Escribe una palabra");
		 palabra1=scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Escribe una segunda palabra");
		 palabra2=scanner.nextLine().trim().toLowerCase();
		
			if (palabra1.equals(palabra2)) {
				System.out.println("Fin del programa");				
				break;
			}else{
				System.out.println("Repitelo de nuevo");
			}
		
		}while(!palabra1.equals(palabra2));
					
		scanner.close();
	}

}
