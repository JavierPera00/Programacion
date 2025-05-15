package modelo;

import java.math.BigDecimal;

public class LibroSegunda extends Libro {

	private Integer antiguedad;
	
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public BigDecimal getPrecio() {
		return super.getPrecio().subtract(super.getPrecio().multiply(new BigDecimal (0.5)));
	}

} 
