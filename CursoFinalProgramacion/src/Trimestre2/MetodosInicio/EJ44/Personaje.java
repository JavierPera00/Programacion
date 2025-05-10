package Trimestre2.MetodosInicio.EJ44;

public abstract class Personaje {
	private String nombre;
	private String codigo;
	private int puntosVida;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	public Personaje(String nombre, String codigo, int puntosVida) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.puntosVida = puntosVida;
	}
	public abstract Integer quitarVida();
	
	public abstract Integer segundoDaño();
	
	
	public Integer quitarVida(Integer daño) {
		return this.puntosVida -= daño;
	}
	
	

	
	
}

