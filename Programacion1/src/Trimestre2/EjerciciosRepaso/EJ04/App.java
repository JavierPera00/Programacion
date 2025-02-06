package Trimestre2.EjerciciosRepaso.EJ04;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Una Librería en la dirección “Avda. de los sueños perdidos, 89” y con el
		 * tlfno 954696954.*/
		Libreria libreria1 = new Libreria("Avda. de los sueños perdidos, 89", 954954954);
		//Dos libros físicos con los datos que quieras 
		LibroNormales normal = new LibroNormales("Javier", "Aventuras", "11/12/2020", 100,23,21,12);		
		LibroNormales normal1 = new LibroNormales("Juanito", "Aventuras espacio", "10/12/2004", 150,23,21,12);
		//Dos libros digitales con los datos que quieras 
		LibroDigitales digital = new LibroDigitales("Daniel","JuanMedio","11/08/1999",100);
		LibroDigitales digital1 = new LibroDigitales("Javielito","JuanitoJuan","10/11/1998",200);
		//Añade los 4 libros a la librería 		
		List <Libros> listaLibro = new ArrayList<>();
		listaLibro.add(normal);
		listaLibro.add(normal1);
		listaLibro.add(digital);
		listaLibro.add(digital1);
		/*Llama a los métodos creados en la librería e imprime los resultados para comprobar
		que funcionan correctamenteobtenerLibroMasAntiguo*/
		System.out.println("El libro más antiguo es : " + libreria1.obtenerLibroMasAntiguo(listaLibro));
		libreria1.obtenerNumPaginasMedio(listaLibro);
		System.out.println("El Peso total de libros es de : " + libreria1.obtenerPesoTotalLibros(listaLibro));		
		
	}

}
