package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Libreria {

	private String nombre;
	private Map<String, Libro> mapa;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Libro> lista) {
		this.mapa = lista;
	}

	public Libreria() {
		super();
		this.mapa = new HashMap<String, Libro>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}

	// MÉTODOS:
	public BigDecimal getTasacionCompleta() {
		BigDecimal precio = BigDecimal.ZERO;
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {
			precio = precio.add(entry.getValue().getPrecio());
		}
		return precio.setScale(2,RoundingMode.HALF_DOWN);
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal precio = BigDecimal.ZERO;
		Integer cont = 0;
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {
			precio = precio.add(entry.getValue().getPrecio());
			cont++;
		}
		return precio.divide(new BigDecimal(cont)).setScale(2,RoundingMode.HALF_DOWN);
	}

	public List<Libro> getLibrosBaratos() {
		List<Libro> lista = new ArrayList<>();
		for (Map.Entry<String, Libro> entry : mapa.entrySet()) {
			if (entry.getValue().getPrecio().compareTo(new BigDecimal(10)) < 0) {
				lista.add(entry.getValue());
			}
		}
		return lista;
	}
}
