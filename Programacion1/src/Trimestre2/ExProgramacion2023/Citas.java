package Trimestre2.ExProgramacion2023;

import java.math.BigDecimal;
import java.time.*;
import java.util.Objects;

public class Citas {
	// Atributos
	private LocalDate fecha;
	private Integer hora;
	private String nombre;
	private Boolean seguroMedico;
	private Boolean citaFacturada;
	private CitasRevision revision;

	// Constructores
	public Citas(String nombre) {
		this.nombre = nombre;
		this.seguroMedico = false;
		this.citaFacturada = false;
	}

	public Citas(LocalDate fecha, Integer hora, String nombre, Boolean seguro, CitasRevision revision) {
		if (seguro == true) {
			this.fecha = fecha;
			this.hora = hora;
			this.nombre = nombre;
			this.revision = revision;
			// this.seguroMedico=seguro;
		}
		this.citaFacturada = false;
	}

	// Get y Set
	public CitasRevision getRevision() {
		return revision;
	}

	public void setRevision(CitasRevision revision) {
		this.revision = revision;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getSeguroMedico() {
		return seguroMedico;
	}

	public void setSeguroMedico(Boolean seguroMedico) {
		this.seguroMedico = seguroMedico;
	}

	public Boolean getCitaFacturada() {
		return citaFacturada;
	}

	public void setCitaFacturada(Boolean citaFacturada) {
		this.citaFacturada = citaFacturada;
	}

	// Equals
	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citas other = (Citas) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora);
	}

	// Metodos
	public BigDecimal getImporteFactura() {
		if (this.revision.getNumeroRevision() == null) { // Cita Normal
			if (this.seguroMedico == true) {
				BigDecimal seguro = BigDecimal.valueOf(100);
				return seguro;
			}
			BigDecimal normal = BigDecimal.valueOf(100);
			return normal;
		} else if (this.revision.getNumeroRevision() != null) { // Cita Revision
			BigDecimal revision = BigDecimal.valueOf(50);
			Integer plus = this.revision.getNumeroRevision();
			BigDecimal plusSumar = BigDecimal.valueOf(plus);
			return revision.add(plusSumar);
		}
		return BigDecimal.ZERO;
	}

	public Integer getDiasCita() {
		LocalDate hoy = LocalDate.now();
		if(this.fecha.isBefore(hoy) == false) {
			Period periodo = this.fecha.until(hoy);
			return periodo.getDays();
		}
		return -1;
	}
	
	// To String
	@Override
	public String toString() {
		return this.nombre  + " -|- " + this.fecha + " -|- " + this.hora + " horas -|- " + seguroMedico;
	}

}
