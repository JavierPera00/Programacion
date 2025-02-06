package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while (v) {
			System.out.print("Escribe tu HTML: ");
			String html = scanner.nextLine();
			if (html.isBlank() || html.isEmpty()) {
				System.err.println("ERROR | No escribiste nada, intentalo de nuevo");
			} else {
				String[] separar = html.split("");
				Boolean confirmar = false;
				String extraer = "";
				for (String caracter : separar) {
					if (caracter.equals("<")) {
						confirmar = true;
					} else if (caracter.equals(">")) {
						confirmar = false;
					} else if (confirmar == false) {
						extraer += caracter;
					}
				}
				System.out.println("Testo extraido: " + extraer.trim());
				v = false;
			}
		}
		scanner.close();
	}
}
