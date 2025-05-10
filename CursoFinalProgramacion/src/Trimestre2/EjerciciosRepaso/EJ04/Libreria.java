package Trimestre2.EjerciciosRepaso.EJ04;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private String direccion;
	private Integer telefono;
	private List <Libros> listaLibro;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public List<Libros> libreria1() {
		return listaLibro;
	}
	public void setListaLibro(List<Libros> listaLibro) {
		this.listaLibro = listaLibro;
	}
	
	public Libreria (String direccion, Integer telefono) {
		this.direccion=direccion;
		this.listaLibro = new ArrayList<>(); //Se inicializa el arrayList
		this.telefono = telefono;
	}
	
	public String obtenerLibroMasAntiguo(List<Libros> lista){
		if (lista.isEmpty()) {
			return null;
		}
		Libros libroAntiguo = lista.get(0);
		for (Libros libros : lista) {
			 String [] fechas = libroAntiguo.getFechaEdicion().split(" ");
			 
			
			if (libros.getFechaEdicion().compareTo(libroAntiguo.getFechaEdicion()) < 0) {
				libroAntiguo = libros; 
			}
		}
	return libroAntiguo.getTitulo();
	}
	
	public int obtenerPesoTotalLibros(List<Libros> lista) {
		int sumaPeso = 0;
		
		for (Libros libros : lista) {
			sumaPeso += libros.obtenerPeso();
		}
		return sumaPeso;
	}
	
	public void obtenerNumPaginasMedio(List<Libros> listaLibros) {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros en la lista.");
            return;
        }

        int totalPaginas = 0;
        for (Libros libro : listaLibros) {
            totalPaginas += libro.getPaginas();
        }

        double paginasMedias = (double) totalPaginas / listaLibros.size();
        System.out.println("El número medio de páginas es: " + paginasMedias);
    }
	
	
	
	
}
