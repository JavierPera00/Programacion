package Trimestre1.T2;

import java.util.Scanner;

public class EJ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un precio sin IVA:");
		Double sinIva= scanner.nextDouble();
	
		scanner.nextLine();	

		System.out.println("Que tipo de IVA? \n -Normal. \n -Reducido. \n -Superreducido. \n -Exento.");
		String conIva = scanner.nextLine().toLowerCase();
		
		switch (conIva) {
		case "normal":
			Double iva =0.21;  
			Double resultado = sinIva * iva;
			System.out.println("Su iva es de: "+ resultado+ ", su precio final es de: "+ (sinIva+resultado));
			break;
		
		case "reducido":
			Double iva1 = 0.10;
			Double resultado1 = sinIva * iva1;
			System.out.println("Su iva es de: "+ resultado1+ ", su precio final es de: "+ (sinIva+resultado1));
			break;
		case "superreducido":
			Double iva2 =  0.04;
			Double resultado2 = sinIva * iva2;
			System.out.println("Su iva es de: "+ resultado2+ ", su precio final es de: "+ (sinIva+resultado2));
			break;
			
		case "exento":
			Double resultado3 = 0D;
			System.out.println("Su iva es de: "+ resultado3 + ", su precio final es de: "+ (sinIva+resultado3));
			break;
		}
		
		scanner.close();
	}

}

