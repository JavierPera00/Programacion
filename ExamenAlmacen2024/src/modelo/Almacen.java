package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import service.TrasteroEstadoException;

public class Almacen {

	private String direccion;
	private List<Trastero> lista;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	public Almacen(String direccion) {
		super();
		this.direccion = direccion;
	}

	public Integer actualizarTrasterosFinAlquiler() {
		Integer cont = 0;
		Iterator<Trastero> it = this.lista.iterator();
		while (it.hasNext()) {
			Trastero trastero1 = it.next();
			if (trastero1.getAlquilado() == true && trastero1.getF_fin().isBefore(LocalDate.now())) {
				trastero1.setAlquilado(false);
				trastero1.getListaBulto().clear();
				cont++;
			}
		}
		return cont;
	}

	public Map<String, Integer> getMapaClientes() {
		Map<String, Integer> mapa = new HashMap<>();
		for (int i = 0; i < this.lista.size(); i++) {
			if (mapa.containsKey(this.lista.get(i).getDni())) {
				mapa.put(this.lista.get(i).getDni(), mapa.get(lista.get(i).getDni()));
			} else {
				mapa.put(this.lista.get(i).getDni(), 1);
			}
		}
		return mapa;
	}

	public Trastero getTrasteroMayorBulto() throws TrasteroEstadoException {
		if (lista.isEmpty()) {
			throw new TrasteroEstadoException("No hay trasteros libres");
		}
		Trastero trastBulto = null;
		BigDecimal mayPeso = BigDecimal.ZERO;

		for (Trastero trastero : lista) {
			if (!trastero.getListaBulto().isEmpty()) {// si no esta vacio busca
				for (Bulto bulto : trastero.getListaBulto()) {
					if (bulto.getPeso().compareTo(mayPeso) > 0) { // si getPeso es may q maypeso
						mayPeso = bulto.getPeso(); // Guardo el peso
					}
				}
			}
			if (trastBulto == null) {
				throw new TrasteroEstadoException("No hay trasteros libres");
			}
		}
		return trastBulto;
	}

	public Trastero getTrasteroLibre(Integer num) throws TrasteroEstadoException {
		for (Trastero trastero : lista) {
			if (trastero.getAlquilado() == false && trastero.getMetro() > num) {
				return trastero;
			}
		}
		throw new TrasteroEstadoException();
	}

}
