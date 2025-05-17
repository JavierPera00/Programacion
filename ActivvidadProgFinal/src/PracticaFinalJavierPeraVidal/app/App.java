package PracticaFinalJavierPeraVidal.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import PracticaFinalJavierPeraVidal.modelo.Equipo;
import PracticaFinalJavierPeraVidal.modelo.Jugador;
import PracticaFinalJavierPeraVidal.service.EquipoServiceException;
import PracticaFinalJavierPeraVidal.service.EquiposService;
import PracticaFinalJavierPeraVidal.service.NotFoundException;

public class App {

	public static Integer tablaEquipo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige una de estas opciones para el equipo:"
				+ "\n\t(1) Ver plantilla del equipo\n\t(2) Borrar equipo\n\t(3) Añadir un jugador"
				+ "\n\t(4) Calcular edad media de plantilla\n\t (5) Exportar plantilla del equipo a fichero\n\t(0) Volver a menú principal");
		Integer res = scanner.nextInt();
		scanner.close();
		return res;
	}

	public static void main(String[] args) throws SQLException, EquipoServiceException, NotFoundException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			EquiposService equipoSer = new EquiposService();
			System.out.println("Elige una de estas opciones:\n\t(1) Ver todos los equipos registrados"
					+ "\n\t(2) Crear nuevo equipo\n\t(3) Consultar un equipo por su código\n\t(0) Salir");
			Integer respuesta = scanner.nextInt();
			if (respuesta == 0) {
				System.out.println("Cerrando Programa");
				break;
			}
			if (respuesta == 1) {
				try {
					List<Equipo> eq = equipoSer.consultarEquipos();
					for (Equipo equipo : eq) {
						System.out.println("EQUIPO: " + equipo.getCodigo() + " / " + equipo.getNombre());
					}
				} catch (SQLException e) {
					System.out.println("ERROR | Fallo al consultar Equipos");
				}
			}
			if (respuesta == 2) {
				System.out.println("Indica Código equipo:");
				String codEq = scanner.nextLine();
				System.out.println("Indica Nombre equipo:");
				String nombEq = scanner.nextLine();
				while (true) {
					System.out.println("Indica Nombre Jugador: ");
					String nombre = scanner.nextLine();
					System.out.println("Indica Fecha nacimiento Jugador (dd/MM/yyyy):");
					String fechaJug = scanner.nextLine();
					DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate fecha1 = LocalDate.parse(fechaJug, formato1);
					System.out.println("¿Deseas añadir otro juagdor? (S/N)");
					String fin = scanner.nextLine();

					if (fin.equalsIgnoreCase("n")) {
						System.out.println("Equipo Guardado !!");
						break;
					}
					try {
						Jugador ju = new Jugador();
						ju.setNombre(nombre);
						ju.setFechaNacimiento(fecha1);
						Equipo eq = new Equipo();
						eq.setCodigo(codEq);
						equipoSer.crearEquipo(eq);
						equipoSer.añadirJugadorAEquipo(eq, ju);
					} catch (EquipoServiceException e) {
						System.out.println("ERROR | Fallo al crear Equipo");
					}
				}
			}

			if (respuesta == 3) {
				System.out.println("Indica Código Equipo: ");
				String cod = scanner.nextLine();
				try {
					Equipo nuevo = equipoSer.consultarEquipoCompleto(cod);
					while (true) {
						Integer resultado = tablaEquipo();
						if (resultado == 0) {
							break;
						}
						if (resultado == 1) {
							System.out.println("EQUIPO: " + nuevo.getCodigo() + " / " + nuevo.getNombre());
							System.out.println(">>>> PLANTILLA:");
							List<Jugador> lista = equipoSer.consultarJugadoresEquipo(nuevo.getCodigo());
							for (Jugador jugador : lista) {
								System.out.println("- " + jugador.getNombre() + " - " + jugador.getFechaNacimiento());
							}
						}
						if (resultado == 2) {
							equipoSer.borrarEquipoCompleto(nuevo.getCodigo());
							System.out.println("Equipo Eliminado !!");
							break;
						}
						if (resultado == 3) {
							try {
								System.out.println("Indica Nombre Jugador");
								String nombre = scanner.nextLine();
								System.out.println("Indica Fecha nacimiento Jugador (dd/MM/yyyy");
								String fecha = scanner.nextLine();
								Jugador jug = new Jugador();
								jug.setNombre(nombre);
								DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
								LocalDate fecha1 = LocalDate.parse(fecha, formato1);
								jug.setFechaNacimiento(fecha1);
								equipoSer.añadirJugadorAEquipo(nuevo, jug);
								System.out.println("Jugador guardado !!!");
							} catch (SQLException e) {
								System.out.println("ERROR | Al agregar al juagdor");
							}

						}
						if (resultado == 4) {
							Equipo eq = new Equipo();
							System.out.println("Edad Media: " + eq.getEdadMedia());
						}
						if(resultado == 5) {
							System.out.println("Indica Ruta de fichero:");
							String ruta = scanner.nextLine();
						}

					}
				} catch (SQLException e) {
					System.out.println("ERROR | Al consultar el Equipo Completo");
				}

			}

		}
		scanner.close();
	}

}
