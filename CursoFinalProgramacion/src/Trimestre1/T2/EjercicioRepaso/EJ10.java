package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;

		do {
			System.out.println("Escribe su correo electronico");
			String correo = scanner.nextLine();

			if (correo.contains("http://") || correo.contains("https://")) {
				
				
				String primer = correo.substring(0, correo.lastIndexOf("/")+1);
				// Despues del https://
				String resultado = correo.substring(correo.lastIndexOf("/")+1, correo.length());

				int segundo = resultado.indexOf(".");
				String segundo1 = resultado.substring(0, segundo);

				int ultimo = resultado.lastIndexOf(".");
				String ultimo1 = resultado.substring(ultimo + 1, resultado.length());

				String medio = resultado.substring(segundo + 1, ultimo);

				System.out.print(primer);
				System.out.println();
				System.out.print(segundo1);
				System.out.println();
				System.out.print(medio);
				System.out.println();
				System.out.print(ultimo1);
				v = false;
			} else {
				System.out.println("No lo he entendido");
				v = true;
			}
		} while (v);
		scanner.close();
	}

}
