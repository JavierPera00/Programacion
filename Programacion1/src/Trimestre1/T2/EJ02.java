package Trimestre1.T2;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una altura");
		Double altura = scanner.nextDouble();
		System.out.println("Escribe un peso");
		Double peso=scanner.nextDouble();
		
		
		Double alturaDoble= altura* altura;
		Double calculoImc = peso / alturaDoble;
		System.out.println("EL resultado es: "+ calculoImc);	
		
		
		if(calculoImc <= 18.5) {
			System.out.println("Peso inferioir al normal");
		} 
		if(calculoImc > 18.5 && calculoImc<25) {
			System.out.println("Peso normal");
		}
		if(calculoImc>=25.0 && calculoImc<=29.9) {
			System.out.println("Peso superior al normal");
		}
		if(calculoImc >= 30.0) {
			System.out.println("Obesidad");
		}
		else {
			System.out.println("Error");
		}
		
		scanner.close();	
	}

}
