package Trimestre2.EjerciciosRepaso.EJ05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha = LocalDate.of(12, 12, 15);
		List<publicacion> biblioteca = new ArrayList<>();
		
		Cd cd = new Cd("codigo12", "Juan", "Juanito", fecha, true);
		Libro libro = new Libro("codigo1", "Javier", "Javielito", fecha, true, true);
		Revista revista = new Revista("codigo", "Jony", "Jonyss", fecha, true);
		// 1
		biblioteca.add(cd);
		biblioteca.add(libro);
		biblioteca.add(revista);
		System.out.println(biblioteca);
		// 2
		System.out.println("2");
		libro.prestar();
		cd.prestar();
		System.out.println(libro.getPrestados());
		System.out.println(cd.getPrestados());
		// 3
		libro.retirarParaConsultar();
		revista.retirarParaConsultar();
		System.out.println(libro);
		System.out.println(revista);
		// 4
		System.out.println("4");
		libro.devolver();
		System.out.println(libro);
		libro.retirarParaConsultar();
		System.out.println(libro);
		// 5
		System.out.println(biblioteca);
		// 6
		System.out.println("6");
		libro.estaPrestado();
		System.out.println(libro);
		// 7
		System.out.println(biblioteca);
		// 8
		cd.devolver();
		System.out.println(cd);
		// 9
		System.out.println(libro.getPrestados());
		

	}

}
