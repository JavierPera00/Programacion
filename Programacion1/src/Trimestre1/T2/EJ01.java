package Trimestre1.T2;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Realizar un programa que pregunte por el año de nacimiento del usuario. Según lo que nos
indique, mostrarle por consola a qué generación pertenece según este cuadro
 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Qué año naciste?");
		Integer año = scanner.nextInt();
		scanner.close();
		if( año <= 1900) {
			System.out.println("Eres de la gereración perdida");
			return;
		}
		
		else if (año >=1901 && año <= 1927) {
			System.out.println("Eres de la Generación grandiosa");
			return;
		}
		
		else if(año >= 1928&& año <= 1945){
			System.out.println("Eres dela Generación silenciosa");
			return;
		}
		
		else if(año >= 1946  && año <=1964) {
			System.out.println("Eres de la Generación Boomer");
			return;
		}
		
		else if (año >= 1965 && año <= 1980) {
			System.out.println("Eres de la Generacion X");
			return;
		}
		
		else if(año >= 1981 && año <=1996) {
			System.out.println("Eres de la Generación Milennials o Generación Y");
			return;
		}
	
		else if(año >= 1997 && año <= 2012) {
			System.out.println("Eres de la Generación Z");
			return;
		}
		
		else if (año>= 2013) {
			System.out.println("Eres de la Generación Alfa");
			return;
		}
		else{
			System.out.println("Error");
			return;
		}
		
	}

	
}

		
