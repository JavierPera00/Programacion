package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import service.EstadoIncorrectoException;

public class Suscripcion {

	private Integer id;
	private LocalDate fechaAlta;
	private Integer cantidadDispo;
	private BigDecimal importe;
	private Boolean cancelada;

	// Get y Set:
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getCantidadDispo() {
		return cantidadDispo;
	}

	public void setCantidadDispo(Integer cantidadDispo) {
		this.cantidadDispo = cantidadDispo;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Boolean getCancelada() {
		return cancelada;
	}

	public void setCancelada(Boolean cancelada) {
		this.cancelada = cancelada;
	}

	// Constructores:
	public Suscripcion(Integer id) {
		super();
		this.id = id;
		this.cancelada = false;
		this.cantidadDispo = 1;
		this.fechaAlta = LocalDate.now();
		this.importe = BigDecimal.ZERO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suscripcion other = (Suscripcion) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Alta: " + this.fechaAlta + " // " + this.cantidadDispo + " dispositivos // Precio: " + this.importe + "€/mes";
	}

	// Métodos:
	public LocalDate getFechaRenovacion() {
		return this.fechaAlta.plusYears(1);
	}

	public BigDecimal getImporteRenovacion() throws EstadoIncorrectoException {
		if (this.cancelada == false) {
			throw new EstadoIncorrectoException();
		}
		if (this.fechaAlta.compareTo(getFechaRenovacion()) < 0) { // Fecha de renovacion no pasada
			return this.importe.multiply(new BigDecimal(11)); // Descuentas un mes
		}
		return this.importe.multiply(new BigDecimal(12));
	}

}
