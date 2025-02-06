package Trimestre2.MetodosInicio.EJ36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List <Alumno> alumnos = new ArrayList<>();
		System.out.println("¿Cuantos alumnos vas a crear?");
		Integer numero = scanner.nextInt();
		
		Alumno alumno1 = new Alumno("12345678J", 23,"Javier", 10f);
		Alumno alumno2 = new Alumno("12345678H", 21,"Juan", 10f);
		Alumno alumno3 = new Alumno("12345678A", 20,"Carlos", 9f);
	
		for (int i = 0; i < 3; i++) {
			Alumno alumno = new Alumno (null,null,null,null);
			alumnos.add(alumno);
		}
			alumnos.set(0, alumno1);
			alumnos.set(1, alumno1);
			alumnos.set(2, alumno1);

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		scanner.close();
	}
}
