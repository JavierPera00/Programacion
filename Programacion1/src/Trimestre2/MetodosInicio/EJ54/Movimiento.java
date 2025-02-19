package Trimestre2.MetodosInicio.EJ54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Movimiento {

	private LocalDate fecha;
	private BigDecimal importe;
	private String descripcion;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Movimiento(LocalDate fecha, BigDecimal importe, String descripcion) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("###,###,###.## €");
		switch (descripcion) {
		case "C":
			return " C - " + this.getFecha() + " - " + formato.format(this.getImporte()) + " - " + this.getDescripcion();
		case "I":
			return  " I - " + this.getFecha() + " - " + formato.format(this.getImporte()) + " - " + this.getDescripcion();
		case "R":
			return " R - " + this.getFecha() + " - " + formato.format(this.getImporte()) + " - " + this.getDescripcion();
		default:
			return "";

		}

	}

}
