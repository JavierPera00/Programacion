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
		Libro libro = new Libro("codigo1", "Javier", "Javielito", fecha, true ,true);
		Revista revista = new Revista ("codigo", "Jony", "Jonyss", fecha, true);
		
		biblioteca.add(cd);
		biblioteca.add(libro);
		biblioteca.add(revista);
		System.out.println(biblioteca);
		libro.prestar();
		cd.prestar();
		System.out.println(biblioteca);
		
		libro.devolver();
		libro.retirarParaConsultar();
		
		libro.estaPrestado();
		System.out.println(libro);
		
		
	}

}
