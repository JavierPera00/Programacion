package Trimestre1.T2;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String cadena1;
        String cadena2;

        while (true) {
            System.out.println("Introduce la primera cadena: ");
            cadena1 = scanner.nextLine().trim();
            System.out.println("Introduce la segunda cadena: ");
            cadena2 = scanner.nextLine().trim();
            if (!cadena1.isEmpty() || cadena1 != null || !cadena2.isEmpty() || cadena1 !=null) {
                break; 
            }
        }        
        //Comparar 
        if (cadena1.compareTo(cadena2) < 0) {
        	//cadena 1 es menor que cadena2
            System.out.println("Cadenas en orden alfabético: ");
            System.out.println(cadena1);
            System.out.println(cadena2);
        } else {
            System.out.println("Cadenas en orden alfabético: ");
            System.out.println(cadena2);
            System.out.println(cadena1);
        }           
        scanner.close();
	}
}
