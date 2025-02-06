package Trimestre1.T2;

import java.util.Scanner;

public class EJ07 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean boleano=  true;
		Scanner scanner = new Scanner(System.in);
	
		do {
		System.out.println("Escribe un número");
		Integer numero1=scanner.nextInt();
		
		System.out.println("Escribe un segundo número");
		Integer numero2=scanner.nextInt();
		
			if (numero1 == numero2) {
				boleano= false;
				System.out.println("Fin del programa");
				break;
			}
			else if(numero1 != numero2) {
				boleano = true;
			}
		
		}while(boleano==true);
			
			
		scanner.close();
	}

}
