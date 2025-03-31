package Trimestre3.Excepciones.EJ03;

import java.util.ArrayList;
import java.util.List;

public class EJ03 {

	private List<Integer> numeros;

	public EJ03() {
		this.numeros = new ArrayList<>();
	}

	public void addNumero(Integer numero) {
		numeros.add(numero);
	}

	@Override
	public String toString() {
		return "EJ03 [numeros ---> " + numeros + " - ";
	}

	public Integer getNumero(Integer posicion) {
		try {
			return this.numeros.get(posicion);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
}