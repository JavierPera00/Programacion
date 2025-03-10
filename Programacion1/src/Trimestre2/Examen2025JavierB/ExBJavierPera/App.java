package ExBJavierPera;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	// 1
		System.out.println(">> Apartado 1: ");
		Plantacion plantacion1 = new Plantacion("98765432X");
		System.out.println(plantacion1);

	// 2
		System.out.println(">> Apartado 2: ");
		Pino pino1 = new Pino(10);
		Pino pino2 = new Pino(11);
		Pino pino3 = new Pino(12);
		Frutal fruta1 = new Frutal(20);
		fruta1.setEspecie("Naranjo");
		Frutal fruta2 = new Frutal(21);
		fruta2.setEspecie("Limonero");
		// Agregar árboles
		plantacion1.addArbol(pino1);
		plantacion1.addArbol(pino2);
		plantacion1.addArbol(pino3);
		plantacion1.addArbol(fruta1);
		plantacion1.addArbol(fruta2);
		System.out.println(plantacion1);
		// 3
		System.out.println(">> Apartado 3: ");
		fruta1.setAltura(new BigDecimal(181.4));
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = "15/01/2021";
		fruta1.setFecha(LocalDate.parse(fecha, formato));
		fruta2.setAltura(new BigDecimal(84));

		LocalDate fechaSumar = fruta1.getFecha().plusMonths(3);
		pino1.setFecha(fechaSumar);
		pino2.setFecha(fechaSumar);
		pino3.setFecha(fechaSumar);
		
		pino1.setAltura(new BigDecimal(80));
		pino2.setAltura(new BigDecimal(80));
		pino3.setAltura(new BigDecimal(110));
		System.out.println(plantacion1);
		
		// 4
		System.out.println(">> Apartado 4: ");
		DateTimeFormatter apartado4 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate hoy = LocalDate.now();	
		
		Period periodo = pino1.getFecha().until(hoy);
		System.out.println(pino1.getFecha().format(apartado4));			
		System.out.println(periodo.getMonths() + " meses");		
		
		// 5
		System.out.println(">> Apartado 5: ");
		DecimalFormat apartado5 = new DecimalFormat("#,###.00€");
		System.out.println(apartado5.format(plantacion1.calcularGanaciaExportacion()));
	
		// 6 
		System.out.println(">> Apartado 6:");
		plantacion1.exportarArboles();
		System.out.println(plantacion1);
		
		sc.close();
	}

}
