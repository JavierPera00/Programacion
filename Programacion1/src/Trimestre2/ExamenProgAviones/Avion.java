package Trimestre2.ExamenProgAviones;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Avion {

	private String compañia;
	private LocalDate fechaFabricacion;
	private List<Asiento> listaAsiento;

	public Avion(String compañia) {
		this.compañia = compañia;
		this.listaAsiento = new ArrayList<>();
		this.fechaFabricacion = LocalDate.of(2000, Month.JANUARY, 1);
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public List<Asiento> getListaAsiento() {
		return listaAsiento;
	}

	public void setListaAsiento(List<Asiento> listaAsiento) {
		this.listaAsiento = listaAsiento;
	}

	// Metodos
	public Integer getAntiguedad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = this.fechaFabricacion.until(hoy);
		return periodo.getYears();
	}

	public Integer getCantidadAsientosOcupados() {
		Integer contador = 0;
		for (Asiento asiento : listaAsiento) {
			if (asiento.getOcupado() == true) {
				contador++;
			}
		}
		return contador;
	}

	public List<Asiento> getListaAsientosLibres() {
		List<Asiento> libres = new ArrayList<>();
		for (Asiento asiento : listaAsiento) {
			if (asiento.getOcupado() == false) {
				libres.add(asiento);
			}
		}
		return libres;
	}

	public void establecerPrecioBaseAsiento(BigDecimal precio) {
		for (Asiento asiento : listaAsiento) {
			asiento.setPrecio(precio);
		}
	}

	public BigDecimal getPrecioMedioVenta() {
		BigDecimal precio = BigDecimal.ZERO;
		for (Asiento asiento : listaAsiento) {
			precio = precio.add(asiento.getPrecio());
		}
		precio = precio.divide(new BigDecimal(listaAsiento.size()));
		return precio.setScale(2, RoundingMode.HALF_UP);
	}

	public Asiento getAsientoLibreMasBarato() {
		Asiento asientoBarato = null;
		for (Asiento asiento : listaAsiento) {
			if (asiento.getOcupado() == false) {
				if (asientoBarato == null || asiento.getPrecio().compareTo(asientoBarato.getPrecio()) < 0) {
					asientoBarato = asiento;
				}
			}
		}
		return asientoBarato;
	}
	
	public void eliminarAsientoFila(Integer fila) {
		Iterator<Asiento> iterador = listaAsiento.iterator();
		while(iterador.hasNext()) {
			if(iterador.next().getFila() == fila){
				iterador.remove();
			}
		}		
	}

	@Override
	public String toString() {
		return "Compañía: " + this.compañia + ". Fabricación; " + this.fechaFabricacion;
	}
}
