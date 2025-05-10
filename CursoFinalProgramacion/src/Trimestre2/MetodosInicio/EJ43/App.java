package Trimestre2.MetodosInicio.EJ43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1
		Actores actor1 = new Actores("Blas Blau", 1983, "España");
		Actores actor2 = new Actores("Laura Pozo", 1981, "Italia");
		Actores actor3 = new Actores("Marcel Cade", 2001, "Suiza");
		Actores actor4 = new Actores("Violeta Volo", 1999, "Rusia");
		// 2
		Directores director1 = new Directores("Sara Marea", 1994, "Portugal");
		// 3
		Guionistas guionista1 = new Guionistas("Marco Smith", 1988, "Reino Unido");
		Guionistas guionista2 = new Guionistas("Cheng Shu", 1977, "China");
		// 4
		List<Actores> lista1 = new ArrayList<>();
		List<Actores> lista2 = new ArrayList<>();
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setAñoEstreno(2027);
		pelicula1.setDirector(director1);
		pelicula1.setGuionista(guionista1);
		lista1.add(actor1);
		lista1.add(actor2);
		pelicula1.setListaActores(lista1);
		pelicula1.setTitulo("Do you know Joe Blas?");
		System.out.println(pelicula1);
		System.out.println("5");
		// 5
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setAñoEstreno(2027);
		pelicula2.setDirector(director1);
		pelicula2.setGuionista(guionista2);
		pelicula2.setTitulo("Muerte en la sombra");
		lista2.add(actor1);
		lista2.add(actor2);
		lista2.add(actor3);
		lista2.add(actor4);
		pelicula2.setListaActores(lista2);
		System.out.println(pelicula2);
		// 6
		System.out.println(lista1);
		// 7
		System.out.println(pelicula1.getGuionista().getSueldo());
		// 8
		System.out.println("8");
		Iterator<Actores> iterador = lista2.iterator();
		while (iterador.hasNext()) {
			Actores cadena = iterador.next();
			if (cadena.getNacionalidad().equals("Suiza")) {
				lista1.add(cadena);
				iterador.remove();
			}
		}
		// 9
		System.out.println(lista2);
		System.out.println(lista1);
		sc.close();
	}
}
