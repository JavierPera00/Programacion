package Trimestre3.SQL.EJ06.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import Trimestre3.SQL.EJ06.modelo.Persona;
import Trimestre3.SQL.EJ06.service.PersonasServive;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonasServive service = new PersonasServive();
		Scanner sc = new Scanner(System.in);
		Integer n;

		while (true) {
			System.out.println("Elige una de estas opciones:\n");
			System.out.println("\t 1 Buscar persona por DNI");
			System.out.println("\t 2 Buscar personas por nombre/apellidos");
			System.out.println("\t 3 Insertar personas");
			System.out.println("\t 4 Actualizar personas");
			System.out.println("\t 5 Borrar personas");
			System.out.println("\t 0 Salir");
			n = sc.nextInt();
			if (n == 1 || n == 2 || n == 3 || n == 0 || n == 4 || n == 5) {
				break;
			} else {
				System.out.println("Número incorrecto");
			}
		}

		try {
			while (true) {
				// Por DNI
				// consultarPersona(service, scanner);
				if (n == 1) {
					sc.nextLine();
					System.out.println("Indica el DNI de la persona");
					String vDNI = sc.nextLine();
					Persona p = service.consultarPersona(vDNI);

					if (p == null) {
						System.out.println("No existe persona con los datos introducidos");
					} else {
						System.out.println(p);
					}
				}
				if (n == 2) {
					sc.nextLine();
					System.out.println("Indica nombre o apellidos a buscar:");
					String filtro = "";
					do {
						filtro = sc.nextLine();
					} while (filtro.isEmpty());

					List<Persona> lista = service.buscarPersona(filtro);
					if (lista.isEmpty())
						System.out.println("No hay ninguna persona con ese filtro");
					for (Persona persona : lista) {
						System.out.println(persona);
					}
				}
				if (n == 3) {
					sc.nextLine();
					Persona agregar = new Persona();
					System.out.println("Escribe un Dni");
					String dni = sc.nextLine();
					System.out.println("Escribe un Nombre");
					String nombre = sc.nextLine();
					System.out.println("Escribe un Apellidos");
					String apellido = sc.nextLine();
					System.out.println("Escribe una Fecha de Nacimiento");
					String fecha = sc.nextLine();
					agregar.setApellidos(apellido);
					agregar.setDni(dni);
					agregar.setNombre(nombre);
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					try {
						LocalDate fecha1 = LocalDate.parse(fecha, format);
						agregar.setFechaNac(fecha1);
					} catch (DateTimeParseException e) {
						System.out.println("La fecha indicada no es la correcta");
					}
					service.insertarPersona(agregar);
				}
				if (n == 4) {
					sc.nextLine();
					Persona agregar = new Persona();
					System.out.println("Escribe un Dni");
					String dni = sc.nextLine();
					System.out.println("Escribe un Nombre");
					String nombre = sc.nextLine();
					System.out.println("Escribe un Apellidos");
					String apellido = sc.nextLine();
					System.out.println("Escribe una Fecha de Nacimiento");
					String fecha = sc.nextLine();
					agregar.setApellidos(apellido);
					agregar.setDni(dni);
					agregar.setNombre(nombre);
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					try {
						LocalDate fecha1 = LocalDate.parse(fecha, format);
						agregar.setFechaNac(fecha1);
					} catch (DateTimeParseException e) {
						System.out.println("La fecha indicada no es la correcta");
					}
					service.ActualizarPersona(agregar);
				}
				if(n == 5) {
					System.out.println("Que dni quieres borrar:");
					String dni = sc.nextLine();
					sc.nextLine();
					service.borrarPersona(dni);
				}
				if (n == 0) {
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			sc.close();
		}
	}
}
