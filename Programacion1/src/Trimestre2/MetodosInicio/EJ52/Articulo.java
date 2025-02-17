package Trimestre2.MetodosInicio.EJ52;

import java.math.BigDecimal;

public class Articulo {

	private String descripcion;
	private BigDecimal precio;
	
	public Articulo(String descripcion, BigDecimal precio) {
		this.precio=precio;
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
