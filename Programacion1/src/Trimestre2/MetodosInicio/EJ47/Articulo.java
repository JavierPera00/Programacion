package Trimestre2.MetodosInicio.EJ47;

public class Articulo {

	private String descripcion;
	private Integer precio;
	
	public Articulo(String descripcion, Integer precio) {
		this.precio=precio;
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}
