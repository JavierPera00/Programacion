package Trimestre2.ExamenTrenesTipoC;

public class TrenCercania extends Tren {

	private Integer plazas;
	
	public TrenCercania(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}
	
	public Integer getPlazas() {
		return plazas;
	}

	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}

	@Override
	public Integer getVelocidad() {		
		return 120;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad() + plazas;
	}
	
	
}
