package Trimestre2.MetodosInicio.EJ58;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = new ArrayList<>();
		words.add("Javier");
		words.add("Juju");
		words.add("pera");
		words.add("micro");
		words.add("television");
		
		Diccionario diccionario = new Diccionario();
		diccionario.cargarDiccionario(words);
		System.out.println(diccionario.getPalabrasMap());
		
		diccionario.imprimirPalabras("J");
		
		System.out.println();
		
		diccionario.borrarDiccionario();
		System.out.println(diccionario.getPalabrasMap());
	}

}
