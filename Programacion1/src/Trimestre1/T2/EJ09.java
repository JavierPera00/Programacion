package Trimestre1.T2;


import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe su nombre completo");
		String nombre = scanner.nextLine();
		String[] nombre1 = nombre.split(" ");//guarada en array por espacios
		if (nombre1.length <3) {
			System.out.println("Pon tu nombre y apellidos correctamente");
		}
		else {
			//saca el interior de los arrays
			String name = nombre1[0];
			String apellido1 = nombre1[1];
			String apellido2 = nombre1[2];
			System.out.println("Tu nombre: "+ name+ ".\nTu apellido: "+ 
					apellido1+ ".\nTu segundo apellido es: "+ apellido2+".");
		}
		scanner.close();
	}

}
	/*Scanner sca = new Scanner(System.in); 
		System.out.println("Indica tu nombre completo (Debe contener apellidos)");
		String nombreCompleto= sca.nextLine();
		Integer primerEspacio = nombreCompleto.indexOf(" "); 
		String primerNombre = nombreCompleto.substring(0, primerEspacio); 
		System.out.println("Nombre: " + primerNombre);
		Integer segundoEspacio = nombreCompleto.indexOf(" ", primerEspacio+1);  
		String primerApellido = nombreCompleto.substring(primerEspacio, segundoEspacio); 
		System.out.println("Primer apellido:" + primerApellido);
		Integer ultimoEspacio = nombreCompleto.length(); 
		String segundoApellido = nombreCompleto.substring(segundoEspacio, ultimoEspacio); 
		System.out.println("Segundo Apellido: " + segundoApellido);
		sca.close();*/

