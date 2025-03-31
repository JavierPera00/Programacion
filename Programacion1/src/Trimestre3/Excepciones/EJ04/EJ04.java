package Trimestre3.Excepciones.EJ04;

import java.util.ArrayList;
import java.util.List;

public class EJ04 {

	private List<Integer> numeros;
	
	public EJ04() {
	this.numeros = new ArrayList<>();;
	}
		
	public void  addNumero(Integer numero) {
		numeros.add(numero);
	}

	@Override
	public String toString() {
		return "EJ03 [numeros ---> " + numeros +" - ";
	}
	
	public Integer getNumero(Integer posicion) {
		return this.numeros.get(posicion);
	}
}
