package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        boolean v = true;

        do {
            System.out.println("Escribe un texto");
            String resultado = scanner.nextLine().toLowerCase().trim();

            // Verificar si hay al menos un espacio
            int primerHola = resultado.indexOf(" ");
            int ultimoAdios = resultado.lastIndexOf(" ");

            if (primerHola == -1 || ultimoAdios == -1) {
                if (resultado.equals("hastaluego")) {
                    System.out.println("Adios");
                    break;
                } else {
                    System.out.println("No lo he entendido");
                    continue;
                }
            }

            String primer = resultado.substring(0, primerHola).toLowerCase().trim();
            String ultimo = resultado.substring(ultimoAdios + 1).toLowerCase().trim();

            if (primer.equals("hola") && ultimo.equals("hastaluego")) {
                boolean vv = true;
                do {
                    System.out.println("Lo he entendido. ¿Cómo estás?");
                    String respuesta = scanner.nextLine().toLowerCase().trim();
                    if (respuesta.endsWith("adios")) {
                        System.out.println("hastaluego");
                        vv = false; 
                    }
                } while (vv);
                break;
            } else if (resultado.equals("hastaluego")) {
                System.out.println("Adios");
                v = false;
            } else {
                System.out.println("No lo he entendido");
                v = true; 
            }
        } while (v);

        scanner.close();
    }

}
