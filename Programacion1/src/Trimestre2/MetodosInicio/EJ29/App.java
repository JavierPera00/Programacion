package Trimestre2.MetodosInicio.EJ29;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
 
		Curso curso = new Curso("1", "DAM-DAW");
 
		Alumno[] AlumnoArray = new Alumno[] { alumno1, alumno2, alumno3 };
 
		Scanner sca = new Scanner(System.in);
 
		for (int i = 0; i < AlumnoArray.length; i++) {
 
			Integer contador = 1;
			
			System.out.println("Cual es el dni del alumno " + contador);
 
			AlumnoArray[i].setDni(sca.nextLine());
 
			System.out.println("Cual es la nota del alumno " + contador);
 
			AlumnoArray[i].setNota(sca.nextFloat());
 
			AlumnoArray[i].setCurso(curso);
 
			sca.nextLine(); // Limpiamos buffer
 
			System.out.println("Cual es el nombre del alumno " + contador);
 
			AlumnoArray[i].setNombre(sca.nextLine());
 
			System.out.println("Cual es la edad del alumno " + contador);
 
			AlumnoArray[i].setEdad(sca.nextInt());
 
			if (AlumnoArray[i].validar()) {
				System.out.println("El alumno se ha creado correctamente \n");
				contador++;
			} else {
				System.out.println("Faltan campos en la creacion del alumno o los datos no son correctos \n");
				break;
			}
 
			sca.nextLine(); // Limpiamos buffer
 
		}
 
		Boolean encontradoIguales = false;
 
		for (int i = 0; i < AlumnoArray.length; i++) {
 
			if (encontradoIguales) {
				break;
			}
 
			for (int x = i + 1; x < AlumnoArray.length; x++) {
				if (AlumnoArray[i].equals(AlumnoArray[x])) {
					System.err.println("NO PUEDEN HABER DOS ALUMNOS IGUALES");
					encontradoIguales = true;
					break;
				}
			}
 
		}
 
		sca.close();
 
	}

}
