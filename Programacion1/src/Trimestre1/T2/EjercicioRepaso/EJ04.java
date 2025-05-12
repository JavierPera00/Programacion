package Trimestre1.T2.EjercicioRepaso;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe las unidades de compra");
		int precio = scanner.nextInt();
		System.out.println("Escribe precio de compra");
		int precio1 = scanner.nextInt();
		
		if(precio >= 100) {
			//40%
			int resultado = (precio*precio1);
			int resultado1 = (resultado * 40)/100; 
			int resultado2 = resultado - resultado1;
			
			System.out.println("el descuento sería de "+resultado2);
		}
		if (precio >= 25 && precio < 100) {
			//20%
			int resultado = (precio*precio1);
			int resultado1 = (resultado * 20)/100;
			int resultado2 = resultado - resultado1;
			System.out.println("Su descuento sería de "+resultado2);
		}
		if (precio >= 10 && precio<=25) {
			//10%
			int resultado = (precio*precio1);
			int resultado1 = (resultado * 10)/100;
			int resultado2 = resultado - resultado1;
			System.out.println("Su descuento sería de " + resultado2);
			
		}else if (precio < 10) {
			int resultado = (precio*precio1);
			System.out.println("No tendría descuento" + resultado);
		}
		scanner.close();
	}

}
