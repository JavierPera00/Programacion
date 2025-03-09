package Trimestre2.ExProgramacion2023_2ºInten;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 1
		String nombreEspecialista = "";
		while (nombreEspecialista.length() < 10) {
			System.out.println("Escribe el nombre del especialista: ");
			nombreEspecialista = scanner.nextLine().trim().toUpperCase();
		}
		// 2.1
		Agenda agenda1 = new Agenda (nombreEspecialista);
		// 2.2
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse("10/05/2024",formato1);
		Cita citaNormal = new Cita (fecha1,16,"Blas de los Montes", false);
		// 2.3
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha2 = LocalDate.parse("18/10/2024",formato2);
		CitasRevision citaRevision = new CitasRevision(fecha2,17,"Laura Aguilar", true,3);
		// 2.4
		agenda1.addCita(citaNormal);
		agenda1.addCita(citaRevision);
		// 3
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		System.out.println(formato.format(agenda1.getImportePedienteFacturar()));
		// 4
		
		scanner.close();
	}

}
