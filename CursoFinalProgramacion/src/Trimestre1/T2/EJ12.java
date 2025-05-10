package Trimestre1.T2;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String login;
		Boolean validar = true;
	do {
		System.out.println("Escribe su login");
		login = scanner.nextLine().trim().toUpperCase();
		if(login.length() < 10) {
			System.out.println("Error");
			validar = false;
		}
		else if(login.contains(" ") || login.isBlank()){
			System.out.println("Error");
			validar = false;
		}else {
			System.out.println("Correcto: Bienvenido "+ login);
			validar = true;
		}
	} while(validar != true);
		scanner.close();
	}

}
