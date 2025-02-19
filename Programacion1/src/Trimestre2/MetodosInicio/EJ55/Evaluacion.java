package Trimestre2.MetodosInicio.EJ55;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Evaluacion {

	private Map<String, BigDecimal> mapa;

	public Map<String, BigDecimal> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, BigDecimal> mapa) {
		this.mapa = mapa;
	}

	public Evaluacion() {
		super();
		this.mapa = new HashMap<>();
	}

	// 1
	public Boolean addNota(String dni, BigDecimal nota) {
		if (!mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			return true;
		}
		return false;
	}

	// 2
	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (!mapa.containsKey(dni)) {
			return false;
		}
		mapa.put(dni, nota);
		return true;

	}

	// 3
	public BigDecimal obtenerNotaAlumno(String dni) {
		if (!mapa.containsKey(dni)) {
			return BigDecimal.ZERO;
		}
		return mapa.get(dni);
	}

	// 4
	public BigDecimal obtenerNotaMedia() {
		BigDecimal sumaNotas = BigDecimal.ZERO;
		if (this.mapa.isEmpty()) {
			return BigDecimal.ZERO;
		}
		if (this.mapa.size() < 0) {
			return BigDecimal.ZERO;
		}
		for (BigDecimal nota : mapa.values()) {
			sumaNotas = sumaNotas.add(nota);
		}
		return sumaNotas.divide(new BigDecimal(this.mapa.size()));
	}

	// 5
	public Integer obtenerCantidadAprobados() {
		Integer cont = 0;
		for (BigDecimal nota : mapa.values()) {
			if (nota.compareTo(new BigDecimal(5)) >= 0) {
				cont++;
			}
		}
		return cont;
	}

	// 6
	public List<String> obtenerSuspensos() {
		List<String> suspensos = new ArrayList<>();
		for (Map.Entry<String, BigDecimal> nota : mapa.entrySet()) {
			if (nota.getValue().compareTo(new BigDecimal(5)) < 0) {
				suspensos.add(nota.getKey());
			}
		}
		return suspensos;
	}

	// 7
	public void borrarAprobados() {
		Iterator<Map.Entry<String, BigDecimal>> borrar = mapa.entrySet().iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getValue().compareTo(new BigDecimal(5)) >= 0) {
				borrar.remove();
			}
		}
	}

	// 8
	@Override
	public String toString() {
		String resultado = "";
		System.out.println("Aprobados : ");
		for (Map.Entry<String, BigDecimal> recorrer : mapa.entrySet()) {
			if (recorrer.getValue().compareTo(new BigDecimal("5")) >= 0) {
				resultado += recorrer.getKey() + " ( " + recorrer.getValue() + " )\n";
			}
		}
		System.out.println("Suspensos : ");
		for (Map.Entry<String, BigDecimal> recorrer : mapa.entrySet()) {
			if (recorrer.getValue().compareTo(new BigDecimal("5")) < 0) {
				resultado += recorrer.getKey() + " ( " + recorrer.getValue() + " )\n";
			}
		}
		return resultado;
	}
	
}