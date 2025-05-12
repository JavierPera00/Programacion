package Trimestre2.EjerciciosRepaso.EJ04;

public class LibroNormales extends Libros {

	private int ancho;
	private int alto;
	private int peso;

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public LibroNormales(String autor, String titulo, String fechaEdicion, Integer paginas, int ancho, int alto,
			int peso) {
		super(autor, titulo, paginas, fechaEdicion, fechaEdicion, peso);
		this.ancho = ancho;
		this.alto = alto;
		this.peso = peso;
	}

	@Override
	public int obtenerPeso() {
		return this.peso;
	}

}
