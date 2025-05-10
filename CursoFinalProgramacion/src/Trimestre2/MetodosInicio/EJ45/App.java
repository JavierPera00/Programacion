package Trimestre2.MetodosInicio.EJ45;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		String fecha = "";
		// 1
		while (v) {
			System.out.println("Escribe una fecha");
			fecha = scanner.nextLine();
			v = Autentificador.comprobarFecha(fecha);
		}
		// 2
		Autentificador.bisiesto(fecha);
		// 3
		System.out.println(Autentificador.diaSemana(fecha));
		// 4
		System.out.println(Autentificador.años(fecha));
		// 5
		System.out.println(Autentificador.añosVida(fecha));
		// 6

		Autentificador parteSiete =  new Autentificador();
		System.out.println(parteSiete.toString());
		
		scanner.close();
	}
}
