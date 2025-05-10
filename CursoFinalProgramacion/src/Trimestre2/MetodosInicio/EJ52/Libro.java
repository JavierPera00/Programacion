package Trimestre2.MetodosInicio.EJ52;

import java.math.BigDecimal;

public class Libro extends Articulo{

	private String autor;
	
	public Libro(String descripcion, BigDecimal precio , String autor) {
		super(descripcion, precio);
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
