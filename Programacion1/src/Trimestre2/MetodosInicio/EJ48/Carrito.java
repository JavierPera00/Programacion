package Trimestre2.MetodosInicio.EJ48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Cliente cliente;
	private Set<Articulo> articulos;
	 
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaActualizacion = LocalDate.now();
		this.articulos = new LinkedHashSet<>();
	}

	public Integer getCantidad() {
		if(this.articulos.size() < 0) {
			return 0;
		}
		return articulos.size();
	}

	public Integer getTotal() {
		Integer precio = 0;
		if(this.articulos.size() < 0) {
			return 0;
		}
		for (Articulo articulo : articulos) {
			precio += articulo.getPrecio();
		}
		return precio;
	}
	
	public Integer getPrecioMedio() {
		Integer precio = 0;
		if(this.articulos.size() < 0 || this.articulos.isEmpty() ) {
			return 0;
		}
		for (Articulo articulo : articulos) {
			precio += articulo.getPrecio();
		}
		Integer precioMedio = precio/articulos.size();
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
