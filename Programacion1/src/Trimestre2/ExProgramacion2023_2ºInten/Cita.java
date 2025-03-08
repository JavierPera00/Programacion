package Trimestre2.ExProgramacion2023_2ºInten;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Cita {

	private LocalDate fecha;
	private Integer hora;
	private String nombrePaciente;
	private Boolean seguroMedico;
	private Boolean facturada;
	private CitasRevision revision;

	// Constructores
	public Cita(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
		this.seguroMedico = false;
		this.facturada = false;
	}

	public Cita(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguroMedico) {
		this.facturada = false;
		if (seguroMedico == true) {
			this.fecha = fecha;
			this.hora = hora;
			this.nombrePaciente = nombrePaciente;
			this.seguroMedico = seguroMedico;
		}
	}

	// Get y Set
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

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public Boolean getSeguroMedico() {
		return seguroMedico;
	}

	public void setSeguroMedico(Boolean seguroMedico) {
		this.seguroMedico = seguroMedico;
	}

	public Boolean getFacturada() {
		return facturada;
	}

	public void setFacturada(Boolean facturada) {
		this.facturada = facturada;
	}

	public CitasRevision getRevision() {
		return revision;
	}

	public void setRevision(CitasRevision revision) {
		this.revision = revision;
	}

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
		Cita other = (Cita) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora);
	}

	// Métodos
	public BigDecimal getImporteFactura () {
		if(this.revision.getNumeroRevision() != 0) {
			return new BigDecimal(50).add(new BigDecimal(10));
		}
		if(this.seguroMedico = true) {
			return new BigDecimal(100);
		}
		return new BigDecimal (150);
	}
	
	// To String 
	@Override
	public String toString() {
		String seguro = "";
		if(this.seguroMedico == true) {
			seguro = "CON SEGURO";
		}else{
			seguro = "SIN SEGURO";
		}
		return  this.nombrePaciente + " - " + this.fecha + " - " + this.hora + " horas - " + seguro;
	}
	
	public Integer getDiasHastaCita() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = this.fecha.until(fechaHoy);
		if(this.fecha.isBefore(fechaHoy)) {
			return periodo.getDays();
		}	
		return -1;
	}
	
	
	
	
	
	
}
