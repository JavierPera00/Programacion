package Trimestre2.MetodosInicio.EJ35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<Alumno> lista = new ArrayList<>();
		Curso curso = new Curso("1", "DAM-DAW");
		for (int i = 0; i < 3; i++) {
			Alumno alumno = new Alumno();
			System.out.println("Escribe el dni del Alumno ");
 
			String dni = sc.nextLine();
			alumno.setDni(dni);
 
			System.out.println("Escribe nota del Alumno ");
			Float nota = sc.nextFloat();
			alumno.setNota(nota);
 
			alumno.setCurso(curso);
 
			//lista[i] = alumno;
			lista.add(i, alumno);
			sc.nextLine();
		}
 

		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}

		for (int i = 0; i < lista.size(); i++) {
			if (i == 2) {
				if (lista.get(i).equals(lista.get(i - 2))) {
					System.out.println("Error " + "Alumno " + lista.get(i).getDni());
				}
			} else if (i < 2) {
				if (lista.get(i).equals(lista.get(i + 1))) {
					System.out.println("Error " + "Alumno " + lista.get(i).getDni());
				}
			}
		}
		sc.close();
	}
}
