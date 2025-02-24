package Trimestre2.MetodosInicio.EJ52;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Cliente cliente;
	private List<Articulo> articulos;
	 
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaActualizacion = LocalDate.now();
		this.articulos = new ArrayList<>();
	}

	public Integer getCantidad() {
		if(this.articulos.size() < 0) {
			return 0;
		}
		return articulos.size();
	}

	public BigDecimal getTotal() {
		BigDecimal precio = BigDecimal.ZERO;
		if(this.articulos.size() < 0) {
			return BigDecimal.ZERO;
		}
		for (int i = 0; i < articulos.size(); i++) {
			precio = precio.add(articulos.get(i).getPrecio());
		}
		return precio;
	}
	public BigDecimal getPrecioMedio() {
		BigDecimal precio = BigDecimal.ZERO;
		if(this.articulos.size() < 0 || this.articulos.isEmpty() ) {
			return BigDecimal.ZERO;
		}
		for (int i = 0; i < articulos.size(); i++) {
			precio.add(articulos.get(i).getPrecio());
		}
		BigDecimal precioMedio = precio.divide(BigDecimal.valueOf(articulos.size()),RoundingMode.HALF_UP);
		return precioMedio;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = this.fechaActualizacion.format(formato);
		return "Cliente --> Nombre: " + this.cliente.getNombre() + " | DNI:" + this.cliente.getDni() + " Carrito --> [Número de Articulos = " + this.articulos.size() + ", Total a pagar: " + getTotal() + "€ , Última Actualizacion : "
				+ fecha + "]";
	}
	public void addArticulo(Articulo articulos) {
		this.articulos.add(articulos);
		this.fechaActualizacion= LocalDate.now();
	}
	
	public void borrarArticulo(Integer entero) {
		this.articulos.remove(entero);	
		this.fechaActualizacion= LocalDate.now();
	}
	
	public void vaciarCesta () {
		this.articulos.clear();
		this.fechaActualizacion= LocalDate.now();
	}
	
	
}
