package Trimestre2.EjerciciosRepaso.EJ02;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*- Crea un teléfono móvil y otro fijo con los números 654654654 y 954954954 
		respectivamente, y pasa una dirección y una posición GPS según corresponda.*/
		Movil mov = new Movil (654654654,"123456");
		Fijo fij = new Fijo ( 954954954, "Avenida don perita");		
		//- Usa el método consultarNumero() de cada uno para imprimirlo.
		System.out.println(mov.consultarNumero(654654654));
		System.out.println(fij.consultarNumero(954954954));		
		/*- Luego llama a marcar() del móvil pasando como número de
		 *  destino el 654654654*/
		mov.marcar(654654654);
		/*- Luego llama a marcar() de nuevo del móvil pasando como 
		 * número el 610610610*/
		mov.marcar(610610610);
		//- Luego llama a colgar() del móvil.
		mov.colgar();
		//- Vuelve a llamar a colgar() del móvil. 
		mov.colgar();		
	}

}
