package Trimestre3.EjercicioRepaso.EJ01.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import Trimestre3.EjercicioRepaso.EJ01.modelo.Producto;
import Trimestre3.EjercicioRepaso.EJ01.service.ProductoNoEncontradoException;
import Trimestre3.EjercicioRepaso.EJ01.service.ProductoService;

public class App {
	public static void main(String[] args) throws ProductoNoEncontradoException, SQLException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		List<Producto> lista = new ArrayList<>();
		ProductoService ps = new ProductoService();
		// 1
		try {
			while (lista.size() < 3) {
				Producto p1 = new Producto();
				System.out.println("Datos Productos");
				System.out.print("Escribe el ID del Producto: ");
				Integer id = scanner.nextInt();
				System.out.println("Escribe el Nombre del Producto: ");
				String nombre = scanner.nextLine();
				scanner.next();
				System.out.println("Escrib el Tipo del Producto: ");
				String tipo = scanner.nextLine();
				scanner.next();
				System.out.println("Escribe un Precio del Producto: ");
				BigDecimal precio = scanner.nextBigDecimal();
				System.out.println("Escribe si es disponible");
				Boolean disp = scanner.nextBoolean();
				p1.setId(id);
				p1.setNombre(nombre);
				p1.setDisponible(disp);
				p1.setPrecio(precio);
				p1.setTipo(tipo);
				lista.add(p1);
			}
			ps.insertarProductos(lista);
		} catch (SQLException e) {
			System.err.println("ERROR | Ingresando los Datos del Producto. ");
		}
		// 2
		try {
			System.out.println("Escribe un Tipo de Producto para Consultar: ");
			String tipo = scanner.nextLine();
			List<Producto> cons = ps.consultarTipoProductos(tipo);
			BigDecimal suma = BigDecimal.ZERO;
			System.out.println("EJEMPLOS DE TIPO " + tipo);
			for (Producto producto : cons) {
				System.out.println(producto.getNombre() + " - " + producto.getTipo() + " - "
						+ producto.getPrecio().setScale(2, RoundingMode.HALF_DOWN) + " €");
				suma = (suma.add(producto.getPrecio()));
			}
			System.out.println("Suma TOTAL de producto " + tipo + ": " + suma);

		} catch (ProductoNoEncontradoException e) {
			System.err.println("ERROR | Ingresando los Datos del Producto. ");
		}
		// 3
		try {
			Map<Integer, Producto> mapa = ps.consultarProductosDisponibles();
			Producto pd = null;
			for (Entry<Integer, Producto> entry : mapa.entrySet()) {
				if (pd == null || pd.getPrecio().compareTo(entry.getValue().getPrecio()) <= 0) {
					pd = entry.getValue();
				}
			}
			System.out.println("Producto mas Caro: " + pd);
		} catch (SQLException e) {
			System.err.println("ERROR | Buscando Producto");
		}
		// 4
		try {
			Map<Integer, Producto> mapa = ps.consultarProductosDisponibles();
			Integer cont = 0;
			for (Entry<Integer, Producto> entry : mapa.entrySet()) {
				if (entry.getKey() == 5) {
					cont++;
					System.out.println("Producto con ID : 5 = " + entry.getValue());
					break;
				}
			}
			if (cont == 0) {
				System.out.println("No existe ningún producto con ese ID");
			}
		} finally {
			System.out.println("Fin programa");
		}
		// 5
		try {
			System.out.println("Escribe un ID para Borrar: ");
			Integer id = scanner.nextInt();
			ps.eliminaProducto(id);
		} catch (ProductoNoEncontradoException e) {
			System.err.println("ERROR | Producto no encontrado");
		} catch (SQLException a) {
			System.err.println("ERROR | Error no controlado");
		}
		scanner.close();
	}
}
