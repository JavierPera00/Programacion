package Trimestre2.EjerciciosRepaso.EJ05;

import java.time.LocalDate;
import java.util.Objects;

public class publicacion {

	private String codigo;
	private String autor;
	private String titulo;
	private LocalDate fecha;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public publicacion(String codigo, String autor, String titulo, LocalDate fecha) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "publicacion [codigo = " + codigo + ", autor = " + autor + ", titulo = " + titulo + ", fecha = " + fecha + "]";
	}

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
		publicacion other = (publicacion) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
