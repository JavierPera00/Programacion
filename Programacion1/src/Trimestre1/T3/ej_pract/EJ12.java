package Trimestre1.T3.ej_pract;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		Boolean v = true;
		
		while(v){
			System.out.println("Escribe tu dirección");
			String correo = scanner.nextLine();
			
			if (correo.contains("//")) {
				int primer = correo.lastIndexOf("/");
				String primero = correo.substring(0,primer+1);
				System.out.println(primero);
				
				String resto = correo.substring(primer+1, correo.length());
				System.out.println(resto);
				
				String[] separar = resto.split("\\.");//hay que ponerlo si no te va
				
				for (int i = 0; i < separar.length; i++) {
					System.out.println(separar[i]);
				}
				v = false;	
			}	
		}
		
		
		
		scanner.close();	
	}

}
