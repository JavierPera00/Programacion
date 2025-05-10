package Trimestre2.ExamenProgAviones;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Asiento {

	private Integer fila;
	private String letra;
	private Boolean ocupado;
	private BigDecimal precio;

	public Asiento(Integer fila, String letra) {
		super();
		this.fila = fila;
		this.letra = letra;
		this.ocupado = false;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public abstract BigDecimal getPrecioVenta();

	public String toString() {
		String ocupado = "";
		if (getOcupado() == true) {
			ocupado = "OCUPADO";
		} else {
			ocupado = "LIBRE";
		}
		return "FILA / ASIENTO: " + getFila() + " / " + getLetra().toUpperCase() + " PVP: " + getPrecio() + " € " + ocupado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fila, letra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return Objects.equals(fila, other.fila) && Objects.equals(letra, other.letra);
	}
		
	
	
	

}
