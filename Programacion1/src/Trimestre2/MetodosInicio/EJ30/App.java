package Trimestre2.MetodosInicio.EJ30;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuantos alumnos vas a crear?");
		Integer numero = scanner.nextInt();
		Curso curso = new Curso("12", "DAM-DAW", numero);

		Alumno alumno1 = new Alumno("12345678J", 23, curso, "Javier", 10f);
		Alumno alumno2 = new Alumno("12345678H", 21, curso, "Juan", 10f);
		Alumno alumno3 = new Alumno("12345678A", 20, curso, "Carlos", 9f);

		curso.addAlumno(alumno1);
		curso.addAlumno(alumno2);
		curso.addAlumno(alumno3);

		System.out.println("Datos Curso: " + curso.getId() + " | " + curso.getDescripcion());
		System.out.println("Alumnos inscritos: " + numero);
		Alumno[] alumnos = curso.getAlumnos();
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = alumnos[i];
			System.out.println("Nombre: " + alumno.getNombre() + " | Dni: " + alumno.getDni() + " | Nota:"
					+ alumno.getNota() + " | Edad: " + alumno.getEdad());

		}
		scanner.close();
	}
}
