package Trimestre1.T2;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		Boolean boleano = true;
		int num = 0;
		int resultado = 0;
		
		do {
			for (int i = 0; i < 10000; i++) {
				num++;
				resultado = resultado + num;
				System.out.print(num + " + ");
				
				if (num == 10000) {
					boleano = false;
				}
			}
		}while (boleano != false);	
		System.out.println(" = "+ resultado);
		scanner.close();
	}

}
