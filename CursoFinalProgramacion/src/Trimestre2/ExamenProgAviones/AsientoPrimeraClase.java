package Trimestre2.ExamenProgAviones;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AsientoPrimeraClase extends Asiento{

	public AsientoPrimeraClase(Integer fila, String letra) {
		super(fila, letra);
	}
	@Override
	public BigDecimal getPrecioVenta() {
		BigDecimal precio = getPrecio().multiply(new BigDecimal (0.2));
		return getPrecio().add(precio).setScale(2,RoundingMode.HALF_UP);
		
	}
}
