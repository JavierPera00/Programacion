package Trimestre2.ExProgramacion2023_2ºInten;

import java.time.LocalDate;

public class CitasRevision extends Cita{

	private Integer numeroRevision;

	public Integer getNumeroRevision() {
		return numeroRevision;
	}

	public void setNumeroRevision(Integer numeroRevision) {
		this.numeroRevision = numeroRevision;
	}
	

	public CitasRevision(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguroMedico,Integer numeroRevision) {
		super(fecha, hora, nombrePaciente, seguroMedico);
		this.numeroRevision = numeroRevision;
	}

	
}
