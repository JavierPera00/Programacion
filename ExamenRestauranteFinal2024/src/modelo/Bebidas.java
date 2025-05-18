package modelo;

import java.math.BigDecimal;

public class Bebidas extends Articulo {

	private String marca;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Bebidas(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}

	@Override
	public String toString() {
		return "Descripción: " + this.getDescripcion() + " -  Precio: " + this.getPrecio() + " €";
	}

	@Override
	public BigDecimal getPrecioFinal() {
		return this.getPrecio();
	}

}
