package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import service.EstadoIncorrectoException;

public class Premiums extends Suscripcion {

	// Constructor:
	public Premiums(Integer id) {
		super(id);
	}

	// Métodos:
	@Override
	public LocalDate getFechaRenovacion() {
		return getFechaAlta().plusYears(2);
	}

	@Override
	public BigDecimal getImporteRenovacion() throws EstadoIncorrectoException {
		if (getCancelada() == false) {
			throw new EstadoIncorrectoException();
		}
		if (getFechaAlta().compareTo(getFechaRenovacion()) < 0) { // fecha de renovación no pasada
			return getImporte().multiply(new BigDecimal(23)); // Se le descuenta un mes
		}
		return getImporte().multiply(new BigDecimal(24));
	}
}
