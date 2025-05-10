package Trimestre2.MetodosInicio;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String palabra = scanner.nextLine();
		System.out.println(EJ01.getMayusculas(palabra));
		System.out.println(EJ02.getMinusculas(palabra));
		scanner.close();
	}

}
