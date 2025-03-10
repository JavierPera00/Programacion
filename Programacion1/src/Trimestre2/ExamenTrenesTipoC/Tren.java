package Trimestre2.ExamenTrenesTipoC;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Tren {

	private String destino;
	private Integer capacidad;
	private BigDecimal precio;
	private LocalDate fechaConstruccion;
	private Integer salidaTren;
	private List<Pasajero> listaPasajero;

	public Tren(String ciudad, Integer capacidad) {
		this.destino = ciudad;
		this.capacidad = capacidad;
		this.salidaTren = 0;
		this.precio = BigDecimal.ZERO;
		this.listaPasajero = new ArrayList<>();
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaConstruccion() {
		return fechaConstruccion;
	}

	public void setFechaConstruccion(LocalDate fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}

	public Integer getSalidaTren() {
		return salidaTren;
	}

	public void setSalidaTren(Integer salidaTren) {
		this.salidaTren = salidaTren;
	}

	public List<Pasajero> getListaPasajero() {
		return listaPasajero;
	}

	public void setListaPasajero(List<Pasajero> listaPasajero) {
		this.listaPasajero = listaPasajero;
	}

	public abstract Integer getVelocidad();

	public abstract Integer getCapacidadTotal();

	public Integer getPlazasLibres() {
		return this.capacidad - this.listaPasajero.size();
	}

	public BigDecimal getRecaudacion() {
		BigDecimal zero = BigDecimal.ZERO;
		for (Pasajero pasajero : listaPasajero) {
			if(pasajero.isTerceraEdad() == true) {
				zero = zero.add(precio.multiply(new BigDecimal(0.75)));
			}else {
				zero = zero.add(precio);
			}
		}
		return  zero.setScale(2, RoundingMode.HALF_DOWN);
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00 €");
		return "Salida: " + this.salidaTren + " horas >> " + this.destino + " - " + formato.format(this.precio);
	}
}
