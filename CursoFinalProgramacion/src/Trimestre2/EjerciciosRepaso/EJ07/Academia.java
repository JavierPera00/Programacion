package Trimestre2.EjerciciosRepaso.EJ07;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Academia {

	private String ciudad;
	private String telefono;
	private List<Curso> lista;

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getLista() {
		return lista;
	}

	public void setLista(List<Curso> lista) {
		this.lista = lista;
	}

	public Academia() {
		this.lista = new ArrayList<>();
	}

	public List<Curso> getCursoDisponible() {
		List<Curso> disponibles = new ArrayList<>();
		for (Curso curso : lista) {
			boolean hayPlazas = curso.getNumeroPlazaTotal() - curso.getNumeroPlazaOcupa() > 0;
			boolean fechaValida = curso.getFechaIni().isBefore(curso.getFechaFin());

			if (hayPlazas && fechaValida) {
				disponibles.add(curso);
			}
		}
		return disponibles;
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal total = BigDecimal.ZERO;
		for (Curso curso : lista) {
			total = total.add(curso.getPrecio());
		}
		return total.divide(new BigDecimal(lista.size()));
	}

	public void borrarCursosPasados() {
		for (Curso curso : lista) {
			if (curso.getNumeroPlazaTotal() - curso.getNumeroPlazaOcupa() <= 0) {
				this.lista.remove(curso);
			}
		}
	}

	public Curso getCursoMasBarato() {
		BigDecimal precioBarato = BigDecimal.ZERO;
		Curso cursoMasBarato = null;
		for (Curso curso : lista) {
			if (curso.getFechaIni().isAfter(curso.getFechaFin())) {
				if (precioBarato == BigDecimal.ZERO || curso.getPrecioMes().compareTo(precioBarato) < 0) {
					cursoMasBarato = curso;
					precioBarato = curso.getPrecioMes();
				}
			}
		}
		return cursoMasBarato;
	}
	
	public Integer getTotalPlazasLibres() {
		Integer contador = 0;
		for (Curso curso : lista) {
			if(curso.getFechaFin().isAfter(curso.getFechaFin())) {
				contador++;
			}
		}
		return contador;
	}
	

}
