package Trimestre2.EjerciciosRepaso.EJ06;

import java.util.List;

public class Tablero extends SelectorPalabras {

	private String pal;
	private String[] tablero;
	private String[] palabraTablero;

	public String[] getTablero() {
		return tablero;
	}

	public void setTablero(String[] tablero) {
		this.tablero = tablero;
	}

	public String[] getPalabra() {
		return palabraTablero;
	}

	public void setPalabra(String[] palabra) {
		this.palabraTablero = palabra;
	}

	public String[] getLista() {
		return tablero;
	}

	public void setLista(String[] lista) {
		this.tablero = lista;
	}

	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public Tablero() {
	}

	public Tablero(List<String> palabra, String juego) {
		super(palabra, juego);
		this.pal = juego;

	}

	public String[] crearTablero(String palabra) {
		this.pal = palabra;
        this.tablero = new String[palabra.length()];
        this.palabraTablero = palabra.split(""); 

        for (int i = 0; i < palabra.length(); i++) {
            tablero[i] = " __ "; 
        }
		return tablero;
	}

	public void imprimirTablero() {
		for (int i = 0; i < pal.length(); i++) {
			System.out.print(this.tablero[i]);
		}
	}

	public void Partida(String letra) {
		  if (this.palabraTablero == null) {
	            System.out.println("Error: Debes inicializar el tablero antes de jugar.");
	            return;
	        }
		Boolean v = false;
		this.palabraTablero = pal.split("");
		for (int i = 0; i < tablero.length; i++) {
			if (letra.equalsIgnoreCase(palabraTablero[i])) {
				tablero[i] = letra;
				v = true;
			}
		}
		if(!v) {
			System.out.println("Letra incorrecta");
		}
		imprimirTablero();
	}

}
