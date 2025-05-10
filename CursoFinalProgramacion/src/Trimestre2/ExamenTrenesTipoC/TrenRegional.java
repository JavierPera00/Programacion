package Trimestre2.ExamenTrenesTipoC;

public class TrenRegional extends Tren{

	private Boolean electricos;
		
	public TrenRegional(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}
	
	public Boolean getElectricos() {
		return electricos;
	}
	public void setElectricos(Boolean electricos) {
		this.electricos = electricos;
	}

	@Override
	public Integer getVelocidad() {
		if(this.electricos == true) {
			return 200;
		}
		return 150;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad();
	}
}
