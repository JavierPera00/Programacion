package modelo;

import java.math.BigDecimal;

public class Corrosivo extends Peligroso {

	
	public Corrosivo(String descripcion, BigDecimal peso) {
		super(descripcion, peso);
		
	}

	@Override
	public BigDecimal getSobrecosteDiario() {
		if(getVoluminoso() == true) {
			return new BigDecimal (40);
		}
		return new BigDecimal(20);
	}
}
