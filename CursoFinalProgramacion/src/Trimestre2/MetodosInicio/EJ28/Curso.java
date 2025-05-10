package Trimestre2.MetodosInicio.EJ28;

public class Curso {

	private String id;
	private String descripcion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Curso (String id, String descripcion) {
		this.descripcion=descripcion;
		this.id= id;
	}
	
}
