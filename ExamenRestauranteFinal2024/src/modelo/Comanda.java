package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Comanda {

	private List<Articulo> lista;

	public List<Articulo> getLista() {
		return lista;
	}

	public void setLista(List<Articulo> lista) {
		this.lista = lista;
	}

	public Comanda() {
		this.lista = new ArrayList<>();
	}
	public BigDecimal getTotal() {
		BigDecimal precio = BigDecimal.ZERO;
		for (Articulo articulo : lista) {
			precio = precio.add(articulo.getPrecio());
		}
		return precio.setScale(2,RoundingMode.HALF_DOWN);
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaa = LocalDate.now().format(format);
		return "Fecha: " + fechaa +"\n----------------------------\n" 
				+ lista +"\n----------------------------\nTotal: " + this.getTotal() +" €";
	}
	
	

}
