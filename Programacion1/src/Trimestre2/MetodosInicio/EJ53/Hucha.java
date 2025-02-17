package Trimestre2.MetodosInicio.EJ53;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal importe;
	

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	public Hucha() {
		this.importe =  BigDecimal.ZERO;
	}
	
	public BigDecimal meterDinero(BigDecimal dinero) {
		this.importe.add(dinero);
		return importe;
	}
	
	public BigDecimal sacarDinero (BigDecimal dinero) {
		if(this.importe == null || this.importe == BigDecimal.ZERO) {
			return BigDecimal.ZERO;
		}if(importe.max(dinero) == dinero) {
			return importe;
		}
		this.importe.subtract(dinero);
		return importe;
	}
	
	public BigDecimal contarDinero() {
		if(importe == null) {
			return BigDecimal.ZERO;
		}
		return importe;
	}
	
	public BigDecimal romperHucha () {
		BigDecimal retirado = importe;
		importe.subtract(importe);
		return retirado;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.#€");
		
		return "Hucha [importe = " + formato.format(importe) + "]";
	}
	
	
	
	
}
