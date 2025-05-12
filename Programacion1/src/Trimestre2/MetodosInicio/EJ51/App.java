package Trimestre2.MetodosInicio.EJ51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<BigDecimal> lista = new ArrayList<>();
		BigDecimal ultimoNum = null;
		// 1
		while (lista.size() < 5) {
			System.out.println("Escribe un número BigDecimal");
			BigDecimal numero = scanner.nextBigDecimal();

			if (ultimoNum == null || numero.compareTo(ultimoNum) > 0) {
				lista.add(numero);
				ultimoNum = numero; // Actualizamos el último número ingresado
			} else {
				System.out.println("El número debe ser mayor que el anterior. Intenta de nuevo.");
			}
		}
		// 2
		BigDecimal suma = BigDecimal.ZERO;
		System.out.println("Lista de numeros agregados: ");
		for (BigDecimal bigDecimal : lista) {
			suma = suma.add(bigDecimal);
		}
		BigDecimal sumaRedondeada = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println("Suma redondeada: " + sumaRedondeada);
		// 3
		BigDecimal division = lista.get(0).divide(lista.get(lista.size()-1),3,RoundingMode.HALF_UP);
		System.out.println(division);
		scanner.close();

	}
}