package Trimestre2.MetodosInicio.EJ43;

import java.util.List;

public class Pelicula {

	private Integer añoEstreno;
	private String titulo;
	private List<Actores> listaActores;
	private Guionistas guionista;
	private Directores director;
	
	public Integer getAñoEstreno() {
		return añoEstreno;
	}
	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Actores> getListaActores() {
		return listaActores;
	}
	public void setListaActores(List<Actores> listaActores) {
		this.listaActores = listaActores;
	}
	public Guionistas getGuionista() {
		return guionista;
	}
	public void setGuionista(Guionistas guionista) {
		this.guionista = guionista;
	}
	public Directores getDirector() {
		return director;
	}
	public void setDirector(Directores director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Pelicula [añoEstreno=" + añoEstreno + ", titulo=" + getTitulo() + ", listaActores=" + getListaActores()
				+ ", guionista=" + getGuionista() + ", director=" + getDirector() + "]";
	}
	
}
