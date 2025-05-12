package Trimestre1.EjerciciosT1;

import java.util.Scanner;

public class EJ1 {

	public static final Double PI= 3.141592;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un radio de un círculo");
		Double radio = scanner.nextDouble();
		//area
		Double resultado = radio*radio;
		Double area = PI *resultado;
		
		//Circunferencia
		Double circunferencia = 2* PI * radio;
		
		System.out.println("El area sería de: " + area + " "+ "Su circunferencia es de: "+ circunferencia);
		scanner.close();		
	}

}
