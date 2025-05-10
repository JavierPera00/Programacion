package Trimestre2.MetodosInicio.EJ44;

public class Parasito extends Personaje {

	public Parasito(String nombre, String codigo) {
		super(nombre, codigo, 200);
	}

	public Integer quitarVida() {
		return 2;
	}
	public  Integer segundoDaño() {
		return 1;
	}

	@Override
	public String toString() {
		return "Parasito [Nombre = " + getNombre() + " |Codigo = " + getCodigo() + " | PuntosVida = "
				+ getPuntosVida() + "]";
	}

}
