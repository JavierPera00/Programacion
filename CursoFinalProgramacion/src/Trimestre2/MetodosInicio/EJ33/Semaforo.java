package Trimestre2.MetodosInicio.EJ33;

public class Semaforo {

	private static final String ROJO = "ROJO";
	private static final String AMBAR = "AMBAR";
	private static final String VERDE = "VERDE";
	
	private String color;
	private Boolean parpadeando;
	
	public Semaforo () {
		this.color = ROJO;
		this.parpadeando=false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {		
		if (color.equals(VERDE) || color.equals(AMBAR) || color.equals(ROJO)) {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if(this.color.equals(AMBAR)) {
			this.parpadeando = parpadeando;
		}
	}

	public static String getRojo() {
		return ROJO;
	}

	public static String getAmbar() {
		return AMBAR;
	}

	public static String getVerde() {
		return VERDE;
	}
	
	@Override
	public String toString() {
		
		if(this.color.equals(ROJO)) {
			return "Semaforo en " + color;
		}
		if(this.color.equals(VERDE)) {
			return "Semaforo en " + color;
		}
		if(this.color.equals(AMBAR) && this.parpadeando == true) {
			return "Semaforo en " + color + " parpadeando";
		}
		if(this.color.equals(AMBAR)) {
			return "Semaforo en " + color;
		}
		return "ERROR";
	}
	
	public void cambiarEstado() {
		if(this.color.equals(VERDE)) {
			this.color = AMBAR;
			this.parpadeando=true;
			return;
		}
		if(this.color.equals(AMBAR) && this.parpadeando == true) {
			this.color = AMBAR;
			this.parpadeando = false;
			return;
		}
		if(this.color.equals(AMBAR) && this.parpadeando == false) {
			this.color = ROJO;
			return;
		}
		if(this.color.equals(ROJO)) {
			this.color = VERDE;
			return;
		}
	}
	
}
