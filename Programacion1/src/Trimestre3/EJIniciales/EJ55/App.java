package Trimestre3.EJIniciales.EJ55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		Evaluacion ev1 = new Evaluacion();
		//2
		ev1.addNota("123456789J", new BigDecimal(10));
		ev1.addNota("123456789H", new BigDecimal(6));
		ev1.addNota("123456789A", new BigDecimal(3));
		ev1.addNota("123456789B", new BigDecimal(2));
		ev1.addNota("123456789C", new BigDecimal(8));
		System.out.println(ev1.toString());
		//3
		System.out.println("3: ");
		ev1.addNota("123456789J", new BigDecimal(2));
		System.out.println(ev1.toString());
		//4
		ev1.corregirNota("123456789B", new BigDecimal(3));
		ev1.corregirNota("11111111B", new BigDecimal(3));
		System.out.println(ev1.toString());
		//5
		System.out.println(ev1.obtenerNotaAlumno("123456789J"));
		System.out.println(ev1.obtenerNotaMedia());
		//6
		System.out.println(ev1.obtenerCantidadAprobados());
		//7
		System.out.println(ev1.obtenerSuspensos());
		//8
		ev1.borrarAprobados();
		System.out.println(ev1.toString());
		
	}

}
