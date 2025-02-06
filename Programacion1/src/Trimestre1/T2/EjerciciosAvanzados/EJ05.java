package Trimestre1.T2.EjerciciosAvanzados;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sumar = 0;
		int espacios = 0;
			System.out.println("Escribe un texto");
			String texto = scanner.nextLine().toLowerCase().trim();
			int cont = texto.length();
				for (int i = 0; i < cont; i++) {
					char letras = texto.charAt(i);
					if (letras == 'a') {
						sumar++;
					}
				}
				//espacios
				for (int j = 0; j < cont; j++) {
					char letras = texto.charAt(j);
					if (letras == 'a') {
						espacios++;
					}
				}
			System.out.println("Has dicho 'a': " + sumar + ".\nHas puesto un espacio: " + espacios);		
		scanner.close();
	}
}
