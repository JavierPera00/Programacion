package Trimestre3.Excepciones.EJ07;

import java.math.BigDecimal;

public class Persona {

	private String genero;
	private BigDecimal altura;
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) throws ParametroIncorrectoException {
		if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")){
			throw new ParametroIncorrectoException("El genero tiene que ser H o M");
		}
		this.genero = genero;
	}
	
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura.compareTo(new BigDecimal (0)) <= 0 || altura.compareTo(new BigDecimal(3)) >= 0) {
			throw new ParametroIncorrectoException("Altura entre 0 y 3 sin estar incluidos");
		}
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}
	
	
}
