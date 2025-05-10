package Trimestre2.MetodosInicio.EJ18;

import java.util.Scanner;

public class EJ18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno();
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el dni:");
		String dni = sc.nextLine();
		a1.setDni(dni);

		System.out.println("Escribe el nombre: ");
		String nombre = sc.nextLine();
		a1.setNombre(nombre);

		System.out.println("Escribe la edad:");
		Integer edad = sc.nextInt();
		a1.setEdad(edad);

		System.out.println("Escribe la nota:");
		Float nota = sc.nextFloat();
		a1.setNota(nota);

		System.out.println("Tus datos son los siguientes: \n" + a1.getDni() + "\n" + a1.getNombre() + "\n"
				+ a1.getEdad() + " años" + "\n" + a1.getNota());

		sc.close();
	}
}
