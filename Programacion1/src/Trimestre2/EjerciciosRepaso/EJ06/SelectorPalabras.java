package Trimestre2.EjerciciosRepaso.EJ06;

import java.util.List;
import java.util.Random;

public class SelectorPalabras {
	
	private String[] palabra;
	private String juego;

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public String[] getPalabra() {
		return palabra;
	}

	public void setPalabra(String[] palabra) {
		this.palabra = palabra;
	}

	public SelectorPalabras() {
		this.palabra = new String [] {"Ahorcado","Abeja","Ordenador","Teclado","Raton"};
	}	
	public SelectorPalabras(List<String> palabra, String juego) {
		if (palabra.isEmpty() || juego.isBlank() || juego.isEmpty()) {
			this.palabra = new String [0];
		}else {
			this.palabra = new String [] {"Ahorcado","Abeja","Ordenador","Teclado","Raton"};
		}
		this.juego = juego;
	}	
	public String palabras () {
		Random random = new Random();
		int randon = random.nextInt(palabra.length);
		String pal = palabra[randon];
		return this.juego = pal;
	}
	
	
}
