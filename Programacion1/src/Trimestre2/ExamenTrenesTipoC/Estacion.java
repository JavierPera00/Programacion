package Trimestre2.ExamenTrenesTipoC;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Estacion {

	private String nombre;
	private List<Tren> listaTren;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tren> getListaTren() {
		return listaTren;
	}

	public void setListaTren(List<Tren> listaTren) {
		this.listaTren = listaTren;
	}

	public Estacion(String nombre) {
		super();
		this.nombre = nombre;
		this.listaTren = new ArrayList<>();
	}

	public void addTren(Tren tren) {
		this.listaTren.add(tren);
	}

	public void borrarTrenesCompletos() {
		Iterator<Tren> iterador = this.listaTren.iterator();
		while (iterador.hasNext()) {
			if (iterador.next().getPlazasLibres() <= 0) {
				iterador.remove();
			}
		}
	}

	public Tren getProximoTren(String ciudad, Integer hora) {
		for (Tren tren : listaTren) {
			if (tren.getPlazasLibres() > 0) {
				if (tren.getSalidaTren() > hora && tren.getDestino().equals(ciudad)) {
					return tren;
				}
			}
		}
		return null;
	}

	public Tren getTrenMasRapido(String ciudad) {
		Tren trenRapido = null;
		for (Tren tren : listaTren) {
			if (tren.getDestino().equalsIgnoreCase(ciudad)) {
				if (trenRapido == null || tren.getVelocidad() > trenRapido.getVelocidad()) {
					trenRapido = tren;
				}
			}
		}
		return trenRapido;
	}

	public List<Tren> getListaTrenesAsequibles(BigDecimal precio) {
		List<Tren> asequible = new ArrayList<>();
		for (Tren tren : listaTren) {
			if (tren.getPrecio().compareTo(precio) <= 0) {
				asequible.add(tren);
			}
		}
		return asequible;
	}

	public Tren getTrenDePasajero(String dni) {
		for (Tren tren : listaTren) {
			for (Pasajero pasajero : tren.getListaPasajero()) {
				if (pasajero.getDni().equalsIgnoreCase(dni)) {
					return tren;
				}
			}
		}
		return null;
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
		Estacion other = (Estacion) obj;
		return Objects.equals(nombre, other.nombre);
	}
}
