package Trimestre2.MetodosInicio.EJ44;

public class Asesino extends Personaje {

	public Asesino(String nombre, String codigo) {
		super(nombre, codigo, 100);
	}

	public Integer quitarVida() {
		return 10;
	}
	public  Integer segundoDaño() {
		return 5;
	}

	@Override
	public String toString() {
		return "Asesino [Nombre = " + getNombre() + " |Codigo = " + getCodigo() + " | PuntosVida = "
				+ getPuntosVida() + "]";
	}

}
