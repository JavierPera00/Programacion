package Trimestre2.MetodosInicio.EJ32;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Reloj reloj = new Reloj();
		// 2
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que hora quieres poner?");
		System.out.println("Horas:");
		Integer hora = sc.nextInt();
		System.out.println("Minutos:");
		Integer minutos = sc.nextInt();
		System.out.println("Segundos:");
		Integer segundos = sc.nextInt();
		reloj.ponerenHora(hora, minutos, segundos);
		System.out.println(reloj);
		System.out.println("EJERCICIO 2");
		// 3
		reloj.setFormato24Horas(false);
		// 4
		System.out.println("EJERCICIO 4");
		reloj.ponerenHora(24, 17);
		System.out.println(reloj);
		// 5
		System.out.println("EJERCICIO 5");
		reloj.ponerenHora(21, 52);
		System.out.println(reloj);
		// 6
		System.out.println("EJERCICIO 6");
		reloj.ponerenHora(17, 16, 15);
		System.out.println(reloj);
		// 7
		Reloj reloj2 = new Reloj(17, 16, 15);
		System.out.println("EJERCICIO 7");
		System.out.println(reloj2);
		// 8
		System.out.println("EJERCICIO 8");
		System.out.println(reloj.equals(reloj2));
		
		sc.close();
	}

}
