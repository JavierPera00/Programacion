package Trimestre2.MetodosInicio.EJ26;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno();
		Alumno a3 = new Alumno();

		Alumno[] lista = new Alumno[] { a1, a2, a3 };

		Curso curso = new Curso("1", "DAM-DAW");

		for (int i = 0; i < lista.length; i++) {
			Integer cont = 1;
			System.out.println("Escribe dni del Alumno " + cont);
			String dni = scanner.nextLine();
			lista[i].setDni(dni);

			System.out.println("Escribe nota del Alumno " + cont);
			Float nota = scanner.nextFloat();
			lista[i].setNota(nota);

			lista[i].setCurso(curso);
			scanner.nextLine();
			cont++;
		}

		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}

		for (int i = 0; i < lista.length; i++) {
			if (i == 2) {
				if (lista[i].equals(lista[i - 2])) {
					System.out.println("Error " + "Alumno " + lista[i].getDni());
				}
			} else if (i < 2) {
				if (lista[i].equals(lista[i + 1])) {
					System.out.println("Error " + "Alumno " + lista[i].getDni());
				}
			}

		}
		
		

		scanner.close();
	}

}
