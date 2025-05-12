package Trimestre3.EjercicioRepaso.EJ01.modelo;

import java.math.BigDecimal;

public class Producto {

	private Integer id;
	private Integer numero;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Boolean disponible;

	public Producto() {

	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Producto [ ID = " + id + ", NÚMERO = " + numero + ", NOMBRE = " + nombre + ", TIPO = " + tipo + ", PRECIO = "
				+ precio + ", DISPONIBLE = " + disponible + " ]";
	}

	

}
