package Trimestre2.EjercicioRepasoSegundo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Smartphone {

	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public String getTexto() {
		return marca;
	}

	public void setTexto(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Smartphone() {
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei, String marca, String modelo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public void activar() {
		this.activo = true;
	}

	public void desactivar() {
		this.activo = false;
	}

	public Integer getEdad() {
		LocalDate fecha = LocalDate.of(1, Month.APRIL, 2000);
		Integer fecha1 = fecha.getYear();
		Integer fecha2 = this.fechaFabricacion.getYear();
		return fecha2 - fecha1;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public LocalDate establecerFabricacion(LocalDate fecha) {
		this.fechaFabricacion = fecha;
		return this.fechaFabricacion;
	}

	public BigDecimal getPrecioMasIva() {
		return this.precio = precio.multiply(new BigDecimal(0.15));
	}

	public Boolean isAltaGama(BigDecimal precio) {
		if (this.precio.compareTo(precio) >= 0) {
			return true;
		}
		return false;
	}

	public Boolean isDatosCompletos() {
		if (this.imei.isBlank() || this.imei.isEmpty() || this.precio == null) {
			return false;
		}
		return true;
	}

	public Boolean isGratis() {
		if (this.precio == new BigDecimal(0)) {
			return true;
		}
		return false;
	}

	public BigDecimal rebajar() {
		BigDecimal resta = precio.subtract(new BigDecimal(10));
		return resta;
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + " - " + this.activo;
	}
	
	

}
