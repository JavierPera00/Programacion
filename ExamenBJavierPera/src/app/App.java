package app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Scanner;

import modelo.Plataforma;
import modelo.Suscripcion;
import modelo.Usuario;
import service.BaseDatosException;
import service.SuscripcionService;
import service.noExisteException;

public class App {

	public static void main(String[] args) throws noExisteException, BaseDatosException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SuscripcionService ss = new SuscripcionService();

		while (true) {

			try {
				System.out.println("Escribe una fecha");
				String fecha = sc.nextLine();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fecha1 = LocalDate.parse(fecha, formato);
				try {
					Map<Integer, Suscripcion> mapa = ss.consultarSuscripciones(fecha1, "blas@ceu.es");
					if (mapa.isEmpty()) {
						throw new noExisteException();
					} else {
						Usuario user = new Usuario();
						user.setDni("123456");
						user.setEmail("blas@ceu.es");
						break;
					}
				} catch (noExisteException a) {
					System.out.println("ERROR | Cerrando aplicación");
					break;
				}
			} catch (SQLException e) {
				System.out.println("ERROR");
			} catch (DateTimeParseException e) {
				System.out.println("ERROR | al escribir la fecha [dd/MM/yyyy]");
			}
		}
		sc.close();
	}
}
