import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Apartado 1: 
		
		Plantacion plantacion1 = new Plantacion("98765432x");
		System.out.println(plantacion1);
		
		//Apartado 2:
		
		Pino pino10 = new Pino(10);
		Pino pino11 = new Pino(11);
		Pino pino12 = new Pino(12);
		Frutal frutal20 = new Frutal(20,"Naranjo");
		Frutal frutal21 = new Frutal(21,"Limonero");
		
		plantacion1.addArbol(pino10);
		plantacion1.addArbol(pino12);
		plantacion1.addArbol(pino12);
		plantacion1.addArbol(frutal20);
		plantacion1.addArbol(frutal21);
		System.out.println(plantacion1);
		
		//Apartado 3
		LocalDate fecha1 = LocalDate.of(2021, 01, 15);
		
		
		frutal20.setAltura(BigDecimal.valueOf(181,4));
		frutal20.setFecha_plantacion(fecha1);
		
		frutal21.setAltura(BigDecimal.valueOf(84));
		
		pino10.setFecha_plantacion(fecha1.plusMonths(3));
		pino11.setFecha_plantacion(fecha1.plusMonths(3));
		pino12.setFecha_plantacion(fecha1.plusMonths(3));
		
		pino10.setAltura(BigDecimal.valueOf(80));
		pino11.setAltura(BigDecimal.valueOf(80));
		pino12.setAltura(BigDecimal.valueOf(110));
		
		System.out.println(plantacion1);
		
		//Apartado 4
		
		System.out.println(pino10.getFecha_plantacion());
		System.out.println(pino10.getFecha_plantacion().getMonthValue());
		
		//Apartado 5
		plantacion1.calcularGananciaExportacion();
		
		
		
	}

}
