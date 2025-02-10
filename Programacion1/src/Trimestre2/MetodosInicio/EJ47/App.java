package Trimestre2.MetodosInicio.EJ47;

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
		Ropa articulo1 = new Ropa("Poncho", 20, "XL", "azul");
		// 4
		carrito.addArticulo(articulo1);
		carrito.addArticulo(articulo1);
		System.out.println(carrito);
		// 5
		Libro articulo2 = new Libro("Así habló Zaratustra", 15, "Nietzsche");
		// 6
		carrito.addArticulo(articulo2);
		System.out.println(carrito);
		// 7
		carrito.borrarArticulo(1);
		System.out.println(carrito);
		// 8
		System.out.println(carrito.getPrecioMedio()  + "€");
		// 9
		carrito.vaciarCesta();
		System.out.println(carrito);
		//10
		System.out.println(carrito.getPrecioMedio()  + "€");;

	}
}
