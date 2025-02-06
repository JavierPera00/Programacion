package Trimestre2.MetodosInicio.EJ39;

import java.util.ArrayList;
import java.util.List;

public class PilaColaCadena {
	private List<String> lista;
	private String pal;

	public PilaColaCadena() {
		this.lista = new ArrayList<>();
	}

	public List<String> getLista() {
		return lista;
	}

	public String getPal() {
		return pal;
	}

	public void setPal(String pal) {
		this.pal = pal;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public void añadirCadena(String cadena) {
		lista.add(cadena);
	}

	public String sacarCadena() {
		if (pal.equals("pila")) {
			String v = lista.get(lista.size() - 1);
			lista.remove(lista.get(lista.size() - 1));
			return v;
		} 
		else if (pal.equals("cola")) {
			String v = lista.get(lista.size() - 1);
			lista.remove(lista.get(lista.size() - 1));
			return v;
		}
		return "ERROR";
	}

	public Integer getTamaño() {
		return lista.size();
	}

	@Override
	public String toString() {
		return "PilaCadenas [lista=" + lista + "]";
	}

	public void setModoPila() {
		this.pal = "pila";
	}

	public void setModoCola() {
		this.pal = "cola";
	}

}
