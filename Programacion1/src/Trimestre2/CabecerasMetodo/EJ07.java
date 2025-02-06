package Trimestre2.CabecerasMetodo;

import java.util.Random;
import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String pala = "";
		
		System.out.println("¿De que tamaño quieres las contraseña?");
		Integer contraseña = scanner.nextInt();
		System.out.println(contraseña1(contraseña));
		scanner.close();
	}
	public static String contraseña1(Integer c) {
		Random random = new Random();
		String pala = "";
		for (int i = 0; i < c ; i++) {
			Integer ordenador = random.nextInt(6);
			pala += ordenador;
		}
		return pala;
		
	}

}
