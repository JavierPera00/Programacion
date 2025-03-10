package Trimestre2.Examen2025JavierB.ExBJavierPera;
import java.math.BigDecimal;

public class Pino extends Arbol {

	public Pino(Integer numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public BigDecimal getAlturaMinimaExport() {
		return new BigDecimal(100);
	}

	@Override
	public BigDecimal getPrecioExportCm() {
		return new BigDecimal(0.2);
	}

	@Override
	public Boolean sePuedeExportar() {
		if (this.getAltura().compareTo(getPrecioExportCm()) >= 0) {
			return true;
		}
		return false;
	}

}
