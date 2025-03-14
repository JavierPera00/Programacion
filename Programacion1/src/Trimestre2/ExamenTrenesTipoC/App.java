package Trimestre2.ExamenTrenesTipoC;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		Pasajero pasajero1 = new Pasajero();
		pasajero1.setDni("8765432R");
		pasajero1.setNombre("Sofia García Molina");
		pasajero1.setFecha(LocalDate.of(1951,02, 13));
				
		Pasajero pasajero2 = new Pasajero();
		pasajero2.setDni("12345678X");
		pasajero2.setNombre("Laura López Gómez");
		pasajero2.setFecha(LocalDate.of(2001,10, 25));
				
		TrenAltaVelocida alta = new TrenAltaVelocida("Granada",2);
		alta.setSalidaTren(10);
		alta.setFechaConstruccion(LocalDate.of(2017,05, 30));
		alta.setPrecio(new BigDecimal(49.5));
		
		TrenRegional regional = new TrenRegional("Granada",2);
		regional.setSalidaTren(20);
		regional.setElectricos(true);
		regional.setPrecio(new BigDecimal(13.2));
		// 2	
		Scanner scanner = new Scanner(System.in);
		String nombre = "";
		while(nombre.length() <= 10) {
			System.out.println("Nombre de la estacion: ");
			nombre = scanner.nextLine().toUpperCase();
		}
		// 3
		Estacion estacion1 = new Estacion(nombre);
		estacion1.addTren(regional);
		estacion1.addTren(alta);
		alta.getListaPasajero().add(pasajero2);
		alta.getListaPasajero().add(pasajero1);
		
		
		// 4
		System.out.println("a");
		System.out.println(alta.getRecaudacion() + " €");
		
		System.out.println("b");
		System.out.println(estacion1.getProximoTren("Granada",2));
		
		System.out.println("c");
		System.out.println(estacion1.getListaTrenesAsequibles(new BigDecimal (20)));
		
		System.out.println("d");
		System.out.println(estacion1.getTrenDePasajero("12345678X"));
		
		System.out.println("e");
		System.out.println(estacion1.getTrenMasRapido("GRANADA"));
		
		System.out.println("f");
		estacion1.borrarTrenesCompletos();
		System.out.println(estacion1.getListaTren());
		
		System.out.println("g");
		System.out.println(estacion1.getTrenMasRapido("GRANADA"));
		scanner.close();
	}

}
