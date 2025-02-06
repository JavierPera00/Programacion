package Trimestre2.MetodosInicio.EJ38;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {

	private List<String> lista;
	
	public PilaCadenas() {
		this.lista = new ArrayList<>();
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	public void añadirCadena (String cadena) {
		lista.add(cadena);
	}
	
	public String sacarCadena () {
		System.out.println(lista.get(lista.size()-1));
		return lista.remove(lista.size()-1);
	}
	public Integer getTamaño () {
		return lista.size();
	}

	@Override
	public String toString() {
		return "PilaCadenas [lista=" + lista + "]";
	}
	
	
	
}
