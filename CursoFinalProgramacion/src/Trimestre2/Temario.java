package Trimestre2;

import java.util.ArrayList;
import java.util.List;

public class Temario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nos saltamos del 13 al 18

		List <Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(1);
		lista.remove(1);
		for (Integer integer : lista) {
			System.out.print(integer);
		}
		
		//Para borrar siempre iterator
	}
}
