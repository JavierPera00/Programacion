package Trimestre2.Examen2025IgnacioB;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Plantacion {
	
	private String cif;
	private List<Arboles> lista_arboles = new ArrayList<>();
	
	public Plantacion(String cif) {
		super();
		this.cif = cif;
		this.lista_arboles = new ArrayList<>();
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
	public void addArbol(Arboles arbol) {
		lista_arboles.add(arbol);
		
	}
	
	public List<Arboles> getArbolesAnualidad(Integer año) {
		
		List<Arboles> arboles_de_ese_año = new ArrayList<>();
		
		for(Arboles arbolito : lista_arboles) {
			if(arbolito.getFecha_plantacion().getYear() == año) {
				arboles_de_ese_año.add(arbolito);
			}
		}
		return arboles_de_ese_año;
		
	}
	
	public BigDecimal getAlturaTotal() {
		
		BigDecimal total_altura = BigDecimal.ZERO;
		
		for(Arboles arbol_altura : lista_arboles) {
			total_altura = total_altura.add(arbol_altura.getAltura());
		}
		
		return total_altura = total_altura.setScale(2,RoundingMode.HALF_UP);
	}
	
	
		public void exportarArboles() {
			for(Arboles arbol_e : lista_arboles) {
				if(arbol_e.sePuedeExportar() == true) {
					lista_arboles.remove(arbol_e);
					
				}
			}
			
		
	}
		
		public void calcularGananciaExportacion() {
			BigDecimal total_ganado = BigDecimal.ZERO;
			for(Arboles arbolito: lista_arboles) {
				total_ganado = total_ganado.add(arbolito.getPrecioExportacion());
			}
			System.out.println(total_ganado);
		}

		@Override
		public String toString() {
			
			return "PLANTACION " + cif + " - " + lista_arboles.size() + "árboles con : "+getAlturaTotal()+" cm totales";
		}

	
	
}
