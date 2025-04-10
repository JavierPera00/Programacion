package Trimestre3.Excepciones.EJ05;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
		try {
			BigDecimal resultado = new BigDecimal(numeros.get(0));
			for (int i = 1; i < numeros.size(); i++) {
				BigDecimal siguiente = new BigDecimal(numeros.get(i));
				resultado = resultado.divide(siguiente,2,RoundingMode.HALF_DOWN);
			}
			return resultado;
		}
		catch(ArithmeticException e) {
			return BigDecimal.ZERO;
		}
		catch(IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		}
		finally {
			System.out.println("Division completa");
		}
	}
}
