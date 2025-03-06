package Trimestre2.EjerciciosRepaso.EJ06;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		SelectorPalabras pal = new SelectorPalabras();
		
		Tablero tablero = new Tablero ();

		//Palabra randon
		String pa = pal.palabras(); 
		tablero.crearTablero(pa);
		tablero.imprimirTablero();
	
		//Partida
		Partida juego = new Partida ();
		juego.Partida("r");
		
	}

}
