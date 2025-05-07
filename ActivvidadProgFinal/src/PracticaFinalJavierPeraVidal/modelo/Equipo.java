package PracticaFinalJavierPeraVidal.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private Integer codigo;
	private String nombre;
	private List<Jugador> listaJugador;
	
	
	
	public Equipo() {
		super();
		this.listaJugador = new ArrayList<>();
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Jugador> getListaJugador() {
		return listaJugador;
	}
	public void setListaJugador(List<Jugador> listaJugador) {
		this.listaJugador = listaJugador;
	}
	
	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", listaJugador=" + listaJugador + "]";
	}
	
	public BigDecimal getEdadMedia() {
	    int cont = 0;
	    int suma = 0;
	    LocalDate hoy = LocalDate.now();
	    for (Jugador jugador : listaJugador) {
	        int edad = hoy.getYear() - jugador.getFechaNacimiento().getYear();
	        suma += edad;
	        cont++;
	    }
	    if (cont == 0) {
	        return BigDecimal.ZERO;
	    }
	    return new BigDecimal(suma).divide(new BigDecimal(cont),2,RoundingMode.HALF_DOWN);
	}
	
}
