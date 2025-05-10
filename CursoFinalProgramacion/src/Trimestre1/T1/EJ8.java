package Trimestre1.T1;

import java.util.Scanner;

public class EJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// --> \n espacio.
		
		Scanner scanner = new Scanner(System.in);

		Long valor;
		String valor2;
		Integer valor3;
		Float valor4;
		
		System.out.println("Escribe una variable String");
		String a = scanner.nextLine();
		
		System.out.println("Escribe una variable tipo Double");
		Double b = scanner.nextDouble();
		
		System.out.println("Escribe una variable de tipo Float");
		Float c = scanner.nextFloat();
		
		//a ---> Long
		valor = Long.parseLong(a);
		System.out.println(valor);
		
		//b ---> String
		valor2 = String.valueOf(b);
		System.out.println(valor2);
        
		//b ---> Integer
		valor3 = b.intValue();
		System.out.println(valor3);
		
		//c ---> Long 
		valor4 = Float.valueOf(c);
		System.out.println(valor4);
		
		
		
		
		
		
		
		scanner.close();
	}

}
