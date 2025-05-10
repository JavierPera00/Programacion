package Trimestre1.T2;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un texto:");
		String texto = scanner.nextLine();
		int longitud = texto.length();
		
		for (int i=0; i< longitud; i= i+5) {
			 if (i + 5 > longitud) {
				 
				 System.out.println(texto.substring(i, longitud));
			 }else {
	                System.out.println(texto.substring(i, i + 5));
	           } 
		}
		scanner.close();
	}
}
//Segundo ejemplo
/*
 	ini = 0;
 	longT = text.length();
  	do{
 	if (ini + 5 > long T){
 	syso(text.substring(ini)));
 	}
 	else syso(text.substring(ini, ini+5)){
 	}
 	ini =+ 5;
 	}while(ini < longT);
*/














