package Trimestre2.MetodosInicio.EJ52;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Cliente cliente = new Cliente();
		cliente.setDni("12345678X");
		cliente.setNombre("Blas de los Montes");
		// 2
		Carrito carrito = new Carrito(cliente);
		System.out.println(carrito);
		// 3
		BigDecimal precio1 = new BigDecimal(20);
		Ropa articulo1 = new Ropa("Poncho", precio1, "XL", "azul");
		// 4
		carrito.addArticulo(articulo1);
		carrito.addArticulo(articulo1);
		System.out.println(carrito);
		// 5
		BigDecimal precio2 = new BigDecimal(15);
		Libro articulo2 = new Libro("Así habló Zaratustra", precio2, "Nietzsche");
		// 6
		carrito.addArticulo(articulo2);
		System.out.println(carrito);
		// 7
		carrito.borrarArticulo(1);
		System.out.println(carrito);
		// 8
		System.out.println(carrito.getPrecioMedio()  + " €");
		// 9
		carrito.vaciarCesta();
		System.out.println(carrito);
		//10
		System.out.println(carrito.getPrecioMedio()  + " €");;

	}
}
