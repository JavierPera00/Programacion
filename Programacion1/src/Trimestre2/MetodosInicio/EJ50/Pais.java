package Trimestre2.MetodosInicio.EJ50;

import java.util.Objects;
import java.util.Set;

public class Pais {
	// Atributos
	private String codigo;
	private String descripcion;

	// Get y Set
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// String
	@Override
	public String toString() {
		return "Pais [ codigo = " + codigo + ", descripcion = " + descripcion + " ]";
	}

	// Constructor
	public Pais(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	// Equals
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
	}
	
	//Metodo para Mayusculas
	public static Set<Pais> agregarLista (Set<Pais> lista, Pais pais){
		pais.setCodigo(pais.getCodigo().toUpperCase());	
		if(!(lista.contains(pais))) {
			lista.add(pais);
		}
		return lista;
	}
}
