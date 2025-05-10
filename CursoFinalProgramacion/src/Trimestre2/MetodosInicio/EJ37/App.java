package Trimestre2.MetodosInicio.EJ37;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		List<String> lista = new ArrayList<>();
		ColaCadena cadena = new ColaCadena(lista);
		
		//2
		cadena.añadirCadena("primero");
		cadena.añadirCadena("segundo");
		
		System.out.println(lista);
		
		//3
		cadena.sacarCadena();
		System.out.println(lista);
		
		//4
		cadena.añadirCadena("tercero");
		System.out.println(lista);
		
		//5
		for (int i = 0; i < lista.size(); i++) {
			String cad = lista.get(i);
			lista.remove(i);
			System.out.println("Palabra borrada: " + cad);
		}
		/*
		for (String string : lista) {
			System.out.println("Palabra eliminada: " + string);
		}
		lista.clear();
		System.out.println(lista);*/
		//6
		cadena.añadirCadena("cuarto");
		System.out.println(lista);
	}

}
