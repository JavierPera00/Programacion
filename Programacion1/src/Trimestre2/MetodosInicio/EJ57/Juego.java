package Trimestre2.MetodosInicio.EJ57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Map<String, List<String>> palabrasMap = new HashMap<>();

		// JUEGO
		while (true) {
			System.out.println("Escribe palabras: ");
			String palabras = scanner.nextLine();
			if (palabras.equals("FIN") || palabras.equals("fin")) {
				System.out.println("FIN de programa: ");
				break;
			}
			String letra = palabras.substring(0, 1).toUpperCase();
			if (!palabrasMap.containsKey(letra)) {
				palabrasMap.put(letra, new ArrayList<>());
			}
			palabrasMap.get(letra).add(palabras);
		}
		// IMPRIMIR
		while (true) {
			List<List<String>> contador = new ArrayList<>();
			System.out.print("Dime una letra: ");
			String letra = scanner.nextLine().trim().toUpperCase();

			if (letra.equalsIgnoreCase("FIN") || letra.length() != 1) {
				System.out.println("¡Gracias por jugar! Bye.");
				break;
			}
			Set<Entry<String, List<String>>> palabras = palabrasMap.entrySet();
			for (Entry<String, List<String>> entry : palabras) {
				if (letra.equals(entry.getKey())) {
					contador.add(entry.getValue());
				}
			}
			if (contador.isEmpty()) {
				System.out.println("No hay palabras que empiecen por " + letra + ".");
			} else {

				List<String> pal = contador.get(0);
				System.out.println("Hay " + pal.size() + " palabra(s) que empiezan por " + letra + ":");
				for (String palabra : pal) {
					System.out.println("> " + palabra);
				}

			}
			return;

		}
		scanner.close();
	}

}
