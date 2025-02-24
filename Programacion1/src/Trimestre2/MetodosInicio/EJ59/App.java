package Trimestre2.MetodosInicio.EJ59;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Geografia paises = new Geografia();
		paises.agregarPais("Egipto", "El Cairo");
		paises.agregarPais("Suiza", "Berna");
		paises.agregarPais("Austria", "Praga");
		paises.agregarPais("Hungría", "Budapest");
		paises.agregarPais("Austria", "Viena");
		paises.agregarPais("Brasil", "Brasilia");
		//1
		System.out.println(paises.getPaises());
		
		//2
		System.out.println(paises.calcularLongitudMediaPaises());
		
		//3
		paises.imprimirNumeroPaisesLetra("B");
		
		//4
		System.out.println();
		System.out.println("4");
		paises.mismaLetra();
		
		//5
		paises.eliminarPaisConCapitalLetra("B");
		System.out.println(paises.getPaises());
		
		//6
		System.out.println();
		System.out.println("5");
		paises.imprimirNumeroPaisesLetra("b");
	}

}
