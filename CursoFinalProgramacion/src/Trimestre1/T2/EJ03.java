package Trimestre1.T2;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un precio sin IVA");
		Double sinIva= scanner.nextDouble();
	
		scanner.nextLine();	

		System.out.println("Que tipo de IVA?");
		String conIva = scanner.nextLine();
		
		if(conIva.equals("Normal") ) {
			Double iva =0.21;  
			Double resultado = sinIva * iva;
			System.out.println("Su iva es de: "+ resultado+ ", su precio final es de: "+ (sinIva+resultado));
		}
		
		else if(conIva.equals("Reducido")) {
			Double iva = 0.10;
			Double resultado1 = sinIva * iva;
			System.out.println("Su iva es de: "+ resultado1+ ", su precio final es de: "+ (sinIva+resultado1));
		}
		
		else if(conIva.equals("Superreducido")) {
			Double iva =  0.04;
			Double resultado2 = sinIva * iva;
			System.out.println("Su iva es de: "+ resultado2+ ", su precio final es de: "+ (sinIva+resultado2));
		}
		
		else if(conIva.equals("Exento")) {
			Double resultado3 = 0D;
			System.out.println("Su iva es de: "+ resultado3 + ", su precio final es de: "+ (sinIva+resultado3));
		
		}
		else {
			System.out.println("error");
		}
		scanner.close();
		
	}
}


