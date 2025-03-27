package Trimestre2.MetodosInicio.EJ56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> conteoNumeros = new HashMap<>();
		int totalNumeros = 0;

		while (true) {
			System.out.println("Introduce números enteros (0 para finalizar):");
			Integer num = scanner.nextInt();
			if(num == 0) {
				System.out.println("Cerrando Programa");
				break;
			}
			if (conteoNumeros.containsKey(num)) { //Contiene
				conteoNumeros.put(num, conteoNumeros.get(num) + 1);
			} else {
				conteoNumeros.put(num, 1);
			}
			totalNumeros++;
		}
		System.out.println("Distribución:");
		System.out.println("Total números indicados: " + totalNumeros);
		for (Map.Entry<Integer, Integer> entry : conteoNumeros.entrySet()) {
			System.out.println("Número: " + entry.getKey() + " --> " + entry.getValue());
		}
		scanner.close();
	} 
}