package ExBJavierPera;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Plantacion {

	private String cif;
	private List<Arbol> listaArbol;

	// Constructor
	public Plantacion(String cif) {
		super();
		this.cif = cif;
		this.listaArbol = new ArrayList<>();
		;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	// Metodos
	public void addArbol(Arbol arbol) {
		this.listaArbol.add(arbol);
	}

	public List<Arbol> getArbolesAnualidad(Integer año) {
		List<Arbol> listaNueva = new ArrayList<>();
		for (Arbol arbol : listaArbol) {
			if (arbol.getFecha().getYear() == año) {
				listaArbol.add(arbol);
			}
		}
		return listaNueva;
	}

	public BigDecimal getAlturaTotal() {
		BigDecimal sumar = BigDecimal.ZERO;
		for (Arbol arbol : listaArbol) {
			sumar = sumar.add(arbol.getAltura());
		}
		return sumar.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal calcularGanaciaExportacion() {
		BigDecimal importe = BigDecimal.ZERO;
		for (Arbol arbol : listaArbol) {
			if (arbol.getAltura().compareTo(arbol.getAlturaMinimaExport()) >= 0) {
				importe = importe.add(arbol.getAltura().multiply(arbol.getPrecioExportCm()));
			}
		}
		return importe.setScale(2, RoundingMode.HALF_UP);
	}

	/*public void exportarArboles() {
		Iterator<Arbol> borrar = this.listaArbol.iterator();
		while (borrar.hasNext()) {
			if (borrar.next().getAltura().compareTo(borrar.next().getAlturaMinimaExport()) >= 0) {
				borrar.remove();
			}
		}
	}*/
	public void exportarArboles() {
		Iterator<Arbol> borrar = this.listaArbol.iterator();
		while (borrar.hasNext()) {
			Arbol arbol = borrar.next();
			if(arbol.getAltura().compareTo(getAlturaTotal()) < 0) {
				borrar.remove();
			}
		}
		
	}

	// String	
	@Override
	public String toString() {
		return "PLANTACION: " + this.cif + " - " + this.listaArbol.size() + " árboles con " + this.getAlturaTotal() + " cm totales" ;
	}
	
	

}
