package Trimestre1.T2;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		Boolean verdadero = true;
		do{
			System.out.println("Escriba su correo electrónico");
			String correo = scanner.nextLine();
			if(correo.contains("@")) {//a
				if(!correo.endsWith(".")) {//c
					if (!correo.contains("@.")) {
						System.out.println("Correo validado");
						verdadero = true;
					}else {
						System.out.println("Error");
						verdadero = false;
					}
				}else {
					System.out.println("Error");
					verdadero = false;
				}
			}else {
				System.out.println("Error");
				verdadero = false;
			}	
		}while(verdadero != true);
		scanner.close();
	}
}
