package Trimestre2.EjerciciosRepaso.EJ07;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Curso {

	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer numeroPlazaTotal;
	private Integer numeroPlazaOcupa;
	
	public Curso(String nombre, BigDecimal precio, Integer numeroPlazaTotal) {
		this.nombre = nombre;
		this.precio = precio;
		this.numeroPlazaTotal = numeroPlazaTotal;
		this.numeroPlazaOcupa = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getNumeroPlazaTotal() {
		return numeroPlazaTotal;
	}
	public void setNumeroPlazaTotal(Integer numeroPlazaTotal) {
		this.numeroPlazaTotal = numeroPlazaTotal;
	}
	public Integer getNumeroPlazaOcupa() {
		return numeroPlazaOcupa;
	}
	public void setNumeroPlazaOcupa(Integer numeroPlazaOcupa) {
		this.numeroPlazaOcupa = numeroPlazaOcupa;
	}
	
	
	//Metodo:
	public Integer getDuracionCurso() {
		Period periodo = this.fechaIni.until(fechaFin);
		return periodo.getMonths();
	}
	
	public Boolean isPlazasLibres() {
		if(this.numeroPlazaTotal - this.numeroPlazaOcupa > 0) {
			return true;
		}
		return false;
	}
	
	public BigDecimal getPrecioMes() {
		Period periodo = this.fechaIni.until(fechaFin);
		return this.precio.divide(new BigDecimal(periodo.getMonths()));
	}
	
	
	
	
}
