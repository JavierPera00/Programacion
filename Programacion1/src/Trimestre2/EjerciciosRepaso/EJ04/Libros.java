package Trimestre2.EjerciciosRepaso.EJ04;

public class Libros extends Libreria {

	private String titulo;
	private String fechaEdicion;
	private Integer paginas;
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void getAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(String fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Libros(String titulo, String fechaEdicion, Integer paginas, String autor, String direccion, Integer telefono) {
		 super(direccion, telefono);
		this.titulo = titulo;
		this.fechaEdicion = fechaEdicion;
		this.autor = autor;
		this.paginas = paginas;
	}
	public int obtenerPeso() {
        return 0;
    }


}
