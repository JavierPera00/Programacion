package Trimestre2.MetodosInicio.EJ44;

import java.util.Objects;

public class Jugador {
	private String nombre;
    private Equipo equipo;

    public Jugador(String nombre,Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
      
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getCodigo() {
		return equipo;
	}
	public void setCodigo(Equipo codigo) {
		this.equipo = codigo;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(equipo, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(equipo, other.equipo) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}
	
}
