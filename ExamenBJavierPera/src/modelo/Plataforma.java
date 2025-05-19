package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Plataforma {

	private String nombre;
	private Map<String, Usuario> mapa;

	// Get y Set:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Usuario> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Usuario> mapa) {
		this.mapa = mapa;
	}

	// Constructor:
	public Plataforma(String nombre) {
		this.nombre = nombre;
		this.mapa = new HashMap<>();
	}

	// Métodos:
	public Integer getCantidadSuscripciones() {
		Integer suma = 0;
		for (Map.Entry<String, Usuario> entry : mapa.entrySet()) {
			suma = suma + entry.getValue().getLista().size();
		}
		return suma;
	}

	public void borrarUsuariosInactivos() {
		for (Map.Entry<String, Usuario> entry : mapa.entrySet()) {
			List<Suscripcion> lista = entry.getValue().getLista();
			for (Suscripcion sus : lista) {
				Iterator<Suscripcion> it = lista.iterator();
				Suscripcion borrar = it.next();
				if (borrar.getCancelada() == false) {
					mapa.remove(entry.getKey());
					it.remove();
				}
			}
		}
	}
}
