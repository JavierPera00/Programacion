package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		do {
			System.out.println("Escribe un texto");
			String resultado = scanner.nextLine().toLowerCase().trim();
			
			
			// Primer
			int primerHola = resultado.indexOf(" ");
			String primer = resultado.substring(0, primerHola + 1).toLowerCase().trim();
			
			// Segundo
			int ultimoAdios = resultado.lastIndexOf(" ");
			String ultimo = resultado.substring(ultimoAdios, resultado.length()+1).toLowerCase().trim();
			
			// Medio
			String medio = resultado.substring(primerHola,ultimoAdios);
		
			
				if (primer.equals("hola") && ultimo.equals("hastaluego")) {
					System.out.println("Lo he entendido: " + medio);
					v = true;
				}
				else if (resultado.equals("hastaluego")) {
					v = true;
				}
				else {
					System.out.println("No lo he entendido");
					v = false;
				}
		} 
		while (v);
		scanner.close();
	}
}
