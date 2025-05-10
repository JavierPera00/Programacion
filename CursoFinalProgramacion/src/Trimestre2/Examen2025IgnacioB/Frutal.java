package Trimestre2.Examen2025IgnacioB;
public class Frutal extends Arboles{
	
	private String especie;
	
	public Frutal(Integer numero_serie,String especie) {
		super(numero_serie);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	
	public String getTipo() {
		return tipo = "frutal";
	}
}
