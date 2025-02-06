package Trimestre2.MetodosInicio;

public class EJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayUtils
		String palabra = "Esto es una prueba";
		String [] array = palabra.split("");
		imprimirArray(array);
		
	}
	public static void imprimirArray (String[]array) {
		if (array == null) {
			System.out.println("La lista esta vacía");
		}
		else {
			for (String lista : array) {
				System.out.print(lista + " ");
			}
		}	
		
	}
}
