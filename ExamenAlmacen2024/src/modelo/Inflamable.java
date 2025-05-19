package modelo;

import java.math.BigDecimal;

public class Inflamable extends Peligroso {



	
	public Inflamable(String descripcion, BigDecimal peso) {
		super(descripcion, peso);
		
	}

	@Override
	public BigDecimal getSobrecosteDiario() {
		if(getVoluminoso() == true) {
			return new BigDecimal(60);
		}
		return new BigDecimal(30);
	}
}
