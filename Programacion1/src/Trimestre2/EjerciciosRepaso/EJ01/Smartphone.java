package Trimestre2.EjerciciosRepaso.EJ01;

import java.time.LocalDate;
import java.time.Period;

public class Smartphone {

	private String marca;
	private String modelo;
	private String imei;
	private Float precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
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

	public Float getPrecio() {
		return precio;
	}

	public Smartphone() {
		this.activo = true;
		this.fechaFabricacion = LocalDate.now();
		this.imei = "";
		this.marca = "";
		this.modelo = "";
		this.precio = 0.0f;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.marca = "";
		this.modelo = "";
		this.precio = 0.0f;
		this.activo = true;
		this.fechaFabricacion = LocalDate.now();
	}

	public Smartphone(String imei, String marca, String modelo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.activo = true;
		this.fechaFabricacion = LocalDate.now();
		this.precio = 0.0f;
	}

	// MÉTODOS:
	public Float setPrecio(Float precio) {
		this.precio = precio;
		return precio;
	}

	public Boolean activar(Boolean activo) {
		activo = true;
		return activo;
	}

	public Boolean desactivar(Boolean activo) {
		activo = false;
		return activo;
	}

	public Period getEdad(LocalDate fechaFabricacion) {
		LocalDate fechaAnterior = LocalDate.of(2000, 04, 01);
		Period periodo = fechaAnterior.until(fechaFabricacion);
		return periodo;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public LocalDate establecerFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
		return fechaFabricacion;
	}

	public Float getPrecioMasIva(Float precio) {
		Float iva = 0.21f;
		Float conIva = precio * iva;
		return precio + conIva;
	}

	public Boolean isAltaGama(Float precio) {
		Boolean altaBaja;
		// Alta
		if (this.precio > precio) {
			altaBaja = true;
		} else {
			altaBaja = false;
		}
		// Baja gama
		return altaBaja;
	}

	public Boolean isDatosCompletos() {
		Boolean confirmar;
		if (!(this.imei.isBlank() || this.imei.isEmpty() || this.precio == null)) {
			confirmar = true;
		} else {
			confirmar = false;
		}
		return confirmar;
	}

	public Boolean isGratis() {
		Boolean v;
		if (this.precio == 0) {
			v = false;
		} else {
			v = true;
		}
		return v;
	}

	public void rebajar() {
		this.precio = this.precio - 10;
	}

	@Override
	public String toString() {
		if (this.activo == false) {
			return "Smartphone [marca=" + " (" + modelo + ") - INACTIVO]";
		} else {
			return "Smartphone [marca=" + " (" + modelo + ") ";
		}
	}

}
