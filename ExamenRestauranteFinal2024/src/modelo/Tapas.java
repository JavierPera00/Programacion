package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tapas extends Articulo {

	private String descripcionA;

	public String getDescripcion() {
		return descripcionA;
	}

	public void setDescripcion(String descripcion) {
		this.descripcionA = descripcion;
	}

	public Tapas(String descripcion, BigDecimal precio) {
		super(descripcion, precio); //  servido = false ya está aquí
	}

	@Override
	public String toString() {
		return "Descripción: " + this.getDescripcion() + " -  Precio: " + this.getPrecio() + " €";
	}

	@Override
	public BigDecimal getPrecioFinal() {
		return getPrecio().multiply(new BigDecimal("0.5")).setScale(2,RoundingMode.HALF_DOWN); //Esta es la tercera Parte
	}
	
	

}
