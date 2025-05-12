package Trimestre1.T3.ejRepaso;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Boolean v = true;
		while (v) {
			System.out.println("¿Cuántos alumnos hay en clase?");
			Integer repeticion = scanner.nextInt();
			scanner.nextLine();

			Double notaMediaCompleta = 0d;

			if (repeticion < 0 || repeticion == null ) {
				System.err.println("Numero incorrecto");
			} else {
				Double[] notas = new Double[repeticion];
				String[] nombres = new String[repeticion];
				for (int i = 0; i < repeticion; i++) {
					if (i > 0) {
						System.out.println();
					}
					System.out.print("¿Cuál es el nombre del alumno " + (i + 1) + "?: ");
					String nombre = scanner.nextLine();
					nombres[i] = nombre;
					Double notaMedia = 0d; // Se crea dentro para reiniciar a 0 cada alumno
					for (int j = 1; j <= 3; j++) {
						System.out.print("¿Cuál es la nota de " + nombre + " para el examen " + j + "?:");
						Integer nota = scanner.nextInt();
						notaMedia += nota;
					}
					notas[i] = notaMedia / 3.0;
					notaMediaCompleta += notas[i];
					scanner.nextLine();
				}
				Double media = notaMediaCompleta / repeticion; // Media todos alumnos

				System.err.println("LISTADO DE NOTAS: ");
				for (int i = 0; i < repeticion; i++) {
					System.out.println("Alumno: " + nombres[i] + " - Nota Media: " + notas[i]);
				}
				System.out.println("Media de los alumnos: " + media);
				v = false;
			}

		}

		scanner.close();
	}
}
