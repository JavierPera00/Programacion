package Trimestre2.Examen2025JavierB.ExBJavierPera;

import java.math.BigDecimal;

public class Frutal extends Arbol {

	private String especie;

	public Frutal(Integer numeroSerie) {
		super(numeroSerie);
		// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public BigDecimal getAlturaMinimaExport() {
		return new BigDecimal(150);
	}

	@Override
	public BigDecimal getPrecioExportCm() {
		return new BigDecimal(0.5);
	}

	@Override
	public Boolean sePuedeExportar() {
		if (this.getAltura().compareTo(getPrecioExportCm()) >= 0) {
			return true;
		}
		return false;
	}

	
}
