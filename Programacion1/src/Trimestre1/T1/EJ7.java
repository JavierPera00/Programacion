package Trimestre1.T1;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una altura");
		Integer altura = scanner.nextInt();
		System.out.println("Escribe un peso");
		Integer peso=scanner.nextInt();
		
		
		Integer alturaDoble= altura* altura;
		Integer calculoImc = peso / alturaDoble;
		System.out.println("EL resultado es: "+ calculoImc);
		scanner.close();	
	}

}
