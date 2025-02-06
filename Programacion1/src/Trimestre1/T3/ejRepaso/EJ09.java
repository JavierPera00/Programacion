package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Boolean v = true;

        while (v) {
            System.out.print("Escribe tu HTML: ");
            String html = scanner.nextLine();
            if (html.isBlank() || html.isEmpty()) {
                System.err.println("ERROR | No escribiste nada, inténtalo de nuevo");
            } else {
                String[] separar = html.split("");
                Boolean confirmarEtiqueta = false; 
                String extraer = "";
                Boolean body = false; //Escribir fuera de etiquetas

                for (String caracter : separar) {
                    if (caracter.equals("<")) {
                    	confirmarEtiqueta = true;
                        if (body == true) {
                            extraer += "\n"; //Salto de línea 
                            body = false; 
                        }
                    } else if (caracter.equals(">")) {
                    	confirmarEtiqueta = false;
                    } else if (confirmarEtiqueta == false) {
                        extraer += caracter; //Agrega cuando no hay etiquetas
                        body = true;
                    }
                }
                System.out.println("Texto extraído:\n" + extraer.trim());
                v = false; 
            }
        }
        scanner.close();
	}
}
