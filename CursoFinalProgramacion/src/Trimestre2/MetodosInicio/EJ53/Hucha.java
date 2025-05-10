package Trimestre2.MetodosInicio.EJ53;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {

	private BigDecimal importe = BigDecimal.ZERO;

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Hucha() {

	}

	public Hucha(BigDecimal importe) {
		this.importe = importe;
	}

	public BigDecimal meterDinero(BigDecimal dinero) {
		this.importe = this.importe.add(dinero);
		return importe;
	}

	public BigDecimal sacarDinero(BigDecimal dinero) {
	    if (dinero == null || dinero.compareTo(BigDecimal.ZERO) <= 0) {//  retirar negativo
	        return BigDecimal.ZERO; 
	    }
	    if (dinero.compareTo(this.importe) > 0) {
	        BigDecimal retirado = this.importe;
	        this.importe = BigDecimal.ZERO;
	        return retirado;
	    }
	    this.importe = this.importe.subtract(dinero);
	    return dinero; 
	}

	public BigDecimal contarDinero() {
		if (importe == null) {
			return BigDecimal.ZERO;
		}
		return importe;
	}

	public BigDecimal romperHucha() {
		BigDecimal retirado = importe;
		this.importe = this.importe.subtract(importe);
		return retirado;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00#€");
		return "Hucha [ importe = " + formato.format(importe) + " ]";
	}

}
