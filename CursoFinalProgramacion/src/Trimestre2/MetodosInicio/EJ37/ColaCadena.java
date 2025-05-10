package Trimestre2.MetodosInicio.EJ37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadena {

	private List <String> lista = new ArrayList<>();

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	public ColaCadena(List<String>lista) {
		this.lista = lista;
	}
	
	public void añadirCadena(String cadena) {
		lista.add(cadena);
	}
	
	public String sacarCadena() {
		String cadena = lista.get(0);
		lista.remove(0);
		return cadena;
	}
	
	public Integer getTamaño () {
		Integer numero = lista.size();
		return numero;
	}

	@Override
	public String toString() {
		return "ColaCadena [lista=" + lista + "]";
	}
	
	
}
