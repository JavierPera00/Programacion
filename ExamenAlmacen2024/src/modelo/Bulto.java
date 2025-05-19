package modelo;

import java.math.BigDecimal;

public class Bulto {

	private String descripcion;
	private BigDecimal peso;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Bulto(String descripcion, BigDecimal peso) {
		super();
		this.descripcion = descripcion;
		this.peso = peso;
	}

	public BigDecimal getSobrecosteDiario() {
		if (this.peso.compareTo(new BigDecimal(50)) > 0) {
			return new BigDecimal(10);
		}
		return BigDecimal.ZERO;
	}

}
