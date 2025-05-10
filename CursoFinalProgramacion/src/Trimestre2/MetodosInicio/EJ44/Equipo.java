package Trimestre2.MetodosInicio.EJ44;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private List<Personaje> personajes;
	private int puntosVidaTotal;
	
	public Equipo () {
		this.personajes= new ArrayList<>();
	}
	public List<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	public int getPuntosVidaTotal() {
		return puntosVidaTotal;
	}

	public void setPuntosVidaTotal(int puntosVidaTotal) {
		this.puntosVidaTotal = puntosVidaTotal;
	}	
	public void agregarLista(Personaje personaje) {
	    if (personajes.contains(personaje)) { 
	        System.out.println("El personaje está repetido");
	    } else if (personajes.size() >= 5) { 
	        System.out.println("Solo se pueden tener como máximo 5 personajes.");
	        System.out.println("No es posible agregar " + personaje.getNombre() + " porque ya hay " + personajes.size());
	    } else {
	        personajes.add(personaje);
	    }
	}

	public Integer puntosEquipo(List<Personaje> personajes) {
		Integer sumaPuntos = 0;
		for (Personaje personaj : personajes) {
	        sumaPuntos += personaj.getPuntosVida();
	    }
		return sumaPuntos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(personajes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(personajes, other.personajes);
	}
	@Override
	public String toString() {
		return "Equipo [personajes=" + personajes + ", puntosVidaTotal=" + puntosVidaTotal + "]";
	}
}
