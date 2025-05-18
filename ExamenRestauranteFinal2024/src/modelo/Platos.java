package modelo;

import java.math.BigDecimal;

public class Platos extends Articulo{

	private String descripcionA;
	
	
	public String getDescripcion() {
		return descripcionA;
	}

	public void setDescripcion(String descripcion) {
		this.descripcionA = descripcion;
	}

	public Platos(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}

	@Override
	public String toString() {
		return "Descripción: " + this.getDescripcion() + " -  Precio: " + this.getPrecio() + " €";
	}

	@Override
	public BigDecimal getPrecioFinal() {
		return getPrecio();
	}
	
}
