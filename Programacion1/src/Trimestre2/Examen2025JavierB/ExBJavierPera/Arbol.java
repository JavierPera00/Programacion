package Trimestre2.Examen2025JavierB.ExBJavierPera;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Arbol {

	private Integer numeroSerie;
	private LocalDate fecha;
	private BigDecimal altura;

	// Constructor
	public Arbol(Integer numeroSerie) {
		super();
		this.numeroSerie = numeroSerie;
		this.fecha = LocalDate.now();
		this.altura = BigDecimal.ZERO;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Integer getNumeroSerie() {
		return this.numeroSerie;
	}

	// Metodos
	public abstract BigDecimal getAlturaMinimaExport();

	public abstract BigDecimal getPrecioExportCm();

	public Integer getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = this.fecha.until(hoy);
		return periodo.getMonths();
	}

	public abstract Boolean sePuedeExportar();

	// Equals
	@Override
	public int hashCode() {
		return Objects.hash(numeroSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arbol other = (Arbol) obj;
		return Objects.equals(numeroSerie, other.numeroSerie);
	}

}
