package Trimestre2.ExamenProgAviones;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AsientoNormal extends Asiento {

	public AsientoNormal(Integer fila, String letra) {
		super(fila, letra);
	}
	@Override
	public BigDecimal getPrecioVenta() {
		return getPrecio().setScale(2, RoundingMode.HALF_UP);
	}
}
