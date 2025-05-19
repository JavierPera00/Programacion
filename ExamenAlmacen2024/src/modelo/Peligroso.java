package modelo;

import java.math.BigDecimal;

public class Peligroso extends Bulto {

	private Boolean voluminoso;

	public Boolean getVoluminoso() {
		return voluminoso;
	}

	public void setVoluminoso(Boolean voluminoso) {
		this.voluminoso = voluminoso;
	}
	
	public Peligroso(String descripcion, BigDecimal peso) {
		super(descripcion, peso);
		voluminoso = false;
	}

	


	

}
