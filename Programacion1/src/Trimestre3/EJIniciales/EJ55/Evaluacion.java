package Trimestre3.EJIniciales.EJ55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {

	private Map<String, BigDecimal> mapa;

	public Map<String, BigDecimal> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, BigDecimal> mapa) {
		this.mapa = mapa;
	}

	public Evaluacion() {
		this.mapa = new HashMap<>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		if (!mapa.containsKey(dni)) {
			this.mapa.put(dni, nota);
			return true;
		}
		return false;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getKey().equals(dni)) {
				mapa.put(dni, nota);
				return true;
			}
		}
		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (this.mapa.containsKey(dni)) {
			return this.mapa.get(dni);
		}
		return BigDecimal.ZERO;
	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal notaMedia = BigDecimal.ZERO;
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			notaMedia = notaMedia.add(par.getValue());
		}
		return notaMedia.divide(new BigDecimal(this.mapa.size()),2,RoundingMode.HALF_DOWN);
	}

	public Integer obtenerCantidadAprobados() {
		Integer cont = 0;
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getValue().compareTo(new BigDecimal(5)) >= 0) {
				cont++;
			}
		}
		return cont;
	}

	public List<String> obtenerSuspensos() {
		List<String> dniSuspensos = new ArrayList<>();
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getValue().compareTo(new BigDecimal(5)) < 0) {
				dniSuspensos.add(par.getKey());
			}
		}
		return dniSuspensos;
	}
	
	public void borrarAprobados() {
		Iterator<Map.Entry<String, BigDecimal>> borrar = mapa.entrySet().iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getValue().compareTo(new BigDecimal(5)) >= 0) {
				borrar.remove();
			}
		}
	}

	@Override
	public String toString() {
		String notasAprobados = "";
		String notasSuspensos = "";
		Set<Entry<String, BigDecimal>> pares = mapa.entrySet();
		for (Entry<String, BigDecimal> par : pares) {
			if (par.getValue().compareTo(new BigDecimal(5)) >= 0) {
				notasAprobados += "\t" + par.getKey() + " " + par.getValue() + "\n";
			}
			else {
				notasSuspensos += "\t" + par.getKey() + " " + par.getValue() + "\n";
			}
		}
		return "Aprobados: \n" + notasAprobados + "Suspensos: \n" + notasSuspensos;
	}
}
