package Trimestre3.Excepciones.EJ05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {

	private List<Integer> numeros;
	
	public SacoNumeros() {
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
	public BigDecimal division() {
		for (int i = 0; i < numeros.size(); i++) {
			for (int y = 1; i < numeros.size(); y++) {
				
			}
		}
	}
}
