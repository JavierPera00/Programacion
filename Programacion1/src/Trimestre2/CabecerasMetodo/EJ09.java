package Trimestre2.CabecerasMetodo;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		Integer n = scanner.nextInt();
		System.out.println(comprobar (n));
		scanner.close();
	}
	public static Integer comprobar (Integer n) {
		Integer resultado = n*n;		
		return resultado;
	}
}
