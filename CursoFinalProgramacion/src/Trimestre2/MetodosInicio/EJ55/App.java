package Trimestre2.MetodosInicio.EJ55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Evaluacion evaluacion1 = new Evaluacion();
		// 2
		evaluacion1.addNota("12345678H", new BigDecimal(5));
		evaluacion1.addNota("12345678F", new BigDecimal(3));
		evaluacion1.addNota("12345678J", new BigDecimal(8));
		evaluacion1.addNota("12345678O", new BigDecimal(9));
		evaluacion1.addNota("12345678P", new BigDecimal(2));
		System.out.println(evaluacion1.getMapa());
		// 3
		evaluacion1.addNota("12345678F", new BigDecimal(4));
		System.out.println(evaluacion1.getMapa());
		// 4
		Boolean r = evaluacion1.corregirNota("12345678H", new BigDecimal(4));
		Boolean v = evaluacion1.corregirNota("12345678R", new BigDecimal(5));
		if (r == true || v == true) {
			System.err.println("ERROR | Alumno 2 no esta agregado");
		}
		System.out.println(evaluacion1.getMapa());
		// 5
		System.out.println(evaluacion1.obtenerNotaAlumno("12345678O"));
		System.out.println(evaluacion1.obtenerNotaMedia());
		// 6
		System.out.println(evaluacion1.obtenerCantidadAprobados());
		// 7
		System.out.println(evaluacion1.obtenerSuspensos());
		// 8
		evaluacion1.borrarAprobados();
		System.out.println(evaluacion1.getMapa());

	}

}
