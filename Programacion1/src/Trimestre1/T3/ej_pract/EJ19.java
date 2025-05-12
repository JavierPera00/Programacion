package Trimestre1.T3.ej_pract;

import java.util.Random;
import java.util.Scanner;

public class EJ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int fallo = 0;
		int vidas = 10;

		Random random = new Random();
		String[] ahorcado = { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado", "terremoto",
				"culinario", "teclado", "primavera" };
		int randon = random.nextInt(ahorcado.length);
		String pal = ahorcado[randon];

		String[] juego = new String[pal.length()];
		juego[0] = pal.substring(0, 1);
		for (int i = 1; i < pal.length(); i++) {
			juego[i] = "_";
		}
		/* Juego */
		boolean juego1 = true;
		while (juego1) {
			System.out.print("Palabra: ");
			for (String letras : juego) {
				System.out.print(letras + " ");
			}
			System.out.println();
			System.out.print("Escribe una letra:");
			String caracter = scanner.nextLine();

			int letrasAcertadas = 0;
			for (int i = 1; i < pal.length(); i++) {
				if (pal.substring(i, i + 1).equals(caracter)) {
					juego[i] = caracter;
					letrasAcertadas++;
				}
			}

			if (letrasAcertadas == 0) {
				fallo++;
				System.err.println("Letra incorrecta | Fallos: " + fallo);
			}
			if (fallo >= vidas) {
				System.err.println("Fin del JUEGO (Se acabaron las vidas), la palabra es...\t" + pal);
				break;
			}

			Boolean f = true;
			for (String pall : juego) {
				if (pall.equals("_")) {
					f = false;
					break;
				}
			}
			if (f) {
				System.out.println("¡Felicidades! Has adivinado la palabra: " + pal);
				break;
			}
		}
		scanner.close();
	}
}
