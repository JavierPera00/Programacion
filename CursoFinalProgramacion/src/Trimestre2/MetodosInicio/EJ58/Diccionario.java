package Trimestre2.MetodosInicio.EJ58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> palabrasMap;

	public Map<String, List<String>> getPalabrasMap() {
		return palabrasMap;
	}

	public void setPalabrasMap(Map<String, List<String>> palabrasMap) {
		this.palabrasMap = palabrasMap;
	}

	public Diccionario() {
		super();
		this.palabrasMap = new HashMap<>();
		;
	}

	// Metodos
	public void cargarDiccionario(List<String> palabras) {
		for (String palabra : palabras) {
			String letraMayuscula = palabra.substring(0, 1).toUpperCase();
			if (!palabrasMap.containsKey(letraMayuscula)) {
				palabrasMap.put(letraMayuscula, new ArrayList<>());
			}
			palabrasMap.get(letraMayuscula).add(palabra);
		}

	}

	public void borrarDiccionario() {
		palabrasMap.clear();
		System.err.println("BORRADO");
	}

	public void imprimirPalabras(String letra) {
		for (Map.Entry<String, List<String>> entry : palabrasMap.entrySet()) {
			List<String> val = entry.getValue();
			for (int i = 0; i < val.size(); i++) {
				if (val.get(i).substring(0, 1).equals(letra)) {
					System.out.print(val.get(i) + " ");
				}
			}
		}
	}
}
