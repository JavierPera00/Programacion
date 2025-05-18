package modelo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import service.ReservasException;



public class Restaurante {

	private String nombre;
	private Integer aforo;
	private Map<String, Reserva> mapaRe;
	private Map<Integer, Comanda> mapaCo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAforo() {
		return aforo;
	}

	public void setAforo(Integer aforo) {
		this.aforo = aforo;
	}

	public Map<String, Reserva> getMapaRe() {
		return mapaRe;
	}

	public void setMapaRe(Map<String, Reserva> mapaRe) {
		this.mapaRe = mapaRe;
	}

	public Map<Integer, Comanda> getMapaCo() {
		return mapaCo;
	}

	public void setMapaCo(Map<Integer, Comanda> mapaCo) {
		this.mapaCo = mapaCo;
	}

	public Restaurante() {
		this.mapaCo = new HashMap<>();
		this.mapaRe = new HashMap<>();
	}

	public Integer getDisponibilidad(LocalDate fecha) {
		Integer total = 0;
		for (Map.Entry<String, Reserva> entry : mapaRe.entrySet()) {
			if (entry.getValue().getFecha().equals(fecha)) {
				total = total += entry.getValue().getNumero();
			}
		}
		return aforo - total;
	}

	public void actualizarReservas() {
		LocalDate fecha = LocalDate.now();
		Iterator<Map.Entry<String, Reserva>> borrar = mapaRe.entrySet().iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getValue().getFecha().isBefore(fecha)
					&& borrar.next().getValue().getConfirmada() == false) {
				borrar.remove();
			}
		}
	}

	public void addReserva(String nombre, LocalDate fecha, Integer numero) throws ReservasException {
		if (this.nombre.equalsIgnoreCase(nombre)) {
			throw new ReservasException("Reserva no guardada");
		}
		if (getDisponibilidad(fecha) < numero) {
			throw new ReservasException("No hay plazas");
		} else {
			Reserva re = new Reserva(fecha, numero);
			mapaRe.put(nombre, re);
		}
	}

	public void confirmarReserva(String nombre) throws ReservasException {
		for (Map.Entry<String, Reserva> entry : mapaRe.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(nombre)) {
				System.out.println("Reserva confirmada");
			} else {
				throw new ReservasException("No hay reserva a ese nombre");
			}
		}
	}

	public Reserva getTopReservaProxima(Integer numeroMinimo) throws ReservasException {
		Reserva reservaTop = null;
		int maxPersonas = -1;
		for (Map.Entry<String, Reserva> entry : mapaRe.entrySet()) {
			Reserva reservaActual = entry.getValue();
			if (reservaActual.isProxima() && reservaActual.getNumero() >= numeroMinimo) {// Verificamos si es próxima y
																							// cumple con el mínimo de
																							// personas
				if (reservaActual.getNumero() > maxPersonas) { // Comprobamos si es la reserva con más personas
					maxPersonas = reservaActual.getNumero();
					reservaTop = reservaActual;
				}
			}
		}
		// Si no encontramos ninguna reserva que cumpla los criterios
		if (reservaTop == null) {
			throw new ReservasException("ERROR");
		}
		return reservaTop;
	}

	public List<Integer> buscarArticulo(String descripcion) {
		List<Integer> ar = new ArrayList<>();
		for (Map.Entry<Integer, Comanda> entry : mapaCo.entrySet()) {
			List<Articulo> articulos = entry.getValue().getLista();
			for (int i = 0; i < articulos.size(); i++) {
				if (articulos.get(i).getDescripcion().equalsIgnoreCase(descripcion)) {
					if (ar.contains(entry.getKey())) {
						ar.add(entry.getKey());
					}
					break;
				}
			}
		}
		return ar;
	}
}
