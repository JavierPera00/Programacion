package Trimestre2.MetodosInicio.EJ59;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Geografia {

	private Map<String, String> paises;

	public Map<String, String> getPaises() {
		return paises;
	}

	public void setPaises(Map<String, String> paises) {
		this.paises = paises;
	}

	public Geografia() {
		super();
		this.paises = new HashMap<>();
	}

	public Boolean agregarPais(String pais, String capital) {// key | valor
		String mayuscula = "";
		pais = pais.toUpperCase();
		mayuscula = capital.substring(0, 1).toUpperCase();
		capital = mayuscula + capital.substring(1, capital.length());
		if (this.paises.containsKey(pais)) {
			this.paises.put(pais, capital);
			return true;
		}
		this.paises.put(pais, capital);
		return false;
	}

	public String obtenerCapital(String pais) {
		if (this.paises.containsKey(pais.toUpperCase())) {
			return "";
		}
		return this.paises.get(pais);
	}

	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			System.out.println("PAIS: " + entry.getKey() + " - CAPITAL: " + entry.getValue());
		}
	}

	public void eliminarPais(String pais) {
		Iterator<Map.Entry<String, String>> borrar = paises.entrySet().iterator();
		while (borrar.hasNext()) {
	        Map.Entry<String, String> entry = borrar.next();	    
	        if (entry.getKey().equalsIgnoreCase(pais)) {
	            borrar.remove();
	            break; 
	        }
		}
	}

	public Integer calcularLongitudMediaPaises() {
		Integer numeros = 0;
		if (this.paises.isEmpty() || this.paises.size() <= 0) {
			return numeros;
		}
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			numeros += entry.getKey().length();
		}
		return numeros/this.paises.size();
	}

	public void eliminarPaisConCapitalLetra(String letra) {
		Iterator<Map.Entry<String, String>> borrar = paises.entrySet().iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getValue().substring(0, 1).equalsIgnoreCase(letra)) {
				borrar.remove();
				break;
			}
		}

	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer numeros = 0;
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			if (entry.getValue().substring(0, 2).equalsIgnoreCase(letra)) {
				numeros++;
			}
		}
		return numeros;
	}
	
	public void imprimirNumeroPaisesLetra(String letra) {
		Boolean v = false;
		if(this.paises.isEmpty()) {
			System.out.println("Lista Vacia"); 
		}
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			if(entry.getValue().substring(0,1).equalsIgnoreCase(letra)){
				System.out.print(entry.getKey() + " ");
				v = true;
			}

		}
		if(v == false) {
			System.out.println("“Ninguna capital del mapa comienza por: " + letra);
		}
	}
	public void mismaLetra () {
		Boolean v = false;
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			if(entry.getValue().substring(0,1).equalsIgnoreCase(entry.getKey().substring(0,1))) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
				v = true;
			}	
		}
		
		if (v = false) {
			System.out.println("no hay ningún país y capital que comiencen por la misma letra");
		
		}
	}

}
