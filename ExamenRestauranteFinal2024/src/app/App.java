package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import modelo.Restaurante;

public class App {

	public static void main(String[] args) {
		//1
		Restaurante re = new Restaurante ();
		re.setNombre("BlasGourmet");
		re.setAforo(100);

		//2
		Scanner scanner = new Scanner(System.in);
		while(true) {
			  try {
			        System.out.println("Escribe una fecha de reserva (dd/MM/yyyy): ");
			        String fecha = scanner.nextLine();
			        
			        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			        LocalDate fecha1 = LocalDate.parse(fecha, forma);
			        break; // Si llega aquí, la fecha es válida y salimos del bucle
			    } catch (DateTimeParseException e) {  // Cambiado a la excepción correcta
			        System.out.println("ERROR | Formato de fecha incorrecto. Use dd/MM/yyyy");
			    }
			
		}
		
		
		// 3
		while(true) {
			Restaurante re = new Restaurante ();
			
			
			
		}
	}

}
