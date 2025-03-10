package Trimestre2.ExamenTrenesTipoC;

import java.time.LocalDate;

public class TrenAltaVelocida extends Tren {

	
	public TrenAltaVelocida(String ciudad, Integer capacidad) {
		super(ciudad, capacidad);
	}

	@Override
	public Integer getVelocidad() {
		LocalDate hoy = LocalDate.of(2010, 01, 30);
		if(this.getFechaConstruccion().isBefore(hoy) == true) {
			return 280;
		}		
		return 360;
	}

	@Override
	public Integer getCapacidadTotal() {
		return this.getCapacidad();
	}
	

}
