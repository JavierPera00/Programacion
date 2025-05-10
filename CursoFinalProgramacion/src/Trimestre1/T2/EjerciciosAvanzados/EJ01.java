package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Escribe un texto");
		String texto = scanner.nextLine();
		Integer longitud = texto.length();
		
		//Primer parrafo
		Integer primerTexto = texto.indexOf(" ");
		String primerParrafo = texto.substring(0, primerTexto).trim().toLowerCase();
		
		//Ultimo parrafo
		Integer ultimoTexto = texto.lastIndexOf(" ");
		String ultimoParrafo = texto.substring(ultimoTexto, ultimoTexto+2).toUpperCase() + texto.substring(ultimoTexto+2, longitud).toLowerCase().trim();
		//int primeraMayus = ultimoParrafo.length();
		
		//Medio
		String desdeADesde = texto.substring(primerTexto, ultimoTexto);
		String [] splitInterior = desdeADesde.split(" ");
		Integer contador = splitInterior.length;
		for (int i = 0; i < contador; i++) {
			String primer = splitInterior[i];
			if (primer.length() > 0) {
				String primeraMayuscula = primer.substring(0,1).toUpperCase() + primer.substring(1);
				splitInterior[i] = primeraMayuscula; 
			}
		}		
		String variablefinal="";
		String variable = "";
		for (String palabra : splitInterior) {
			variable = variable + palabra; 
		}
		
		variablefinal = primerParrafo + variable + ultimoParrafo;
		variablefinal = variablefinal.replaceAll(" " , "");
		System.out.println(variablefinal);
		scanner.close();
	}
}
