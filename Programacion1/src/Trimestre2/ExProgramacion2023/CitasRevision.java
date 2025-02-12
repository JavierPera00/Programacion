package Trimestre2.ExProgramacion2023;

import java.time.LocalDate;

public class CitasRevision extends Citas {

	private Integer numeroRevision;

	public Integer getNumeroRevision() {
		return numeroRevision;
	}

	public void setNumeroRevision(Integer numeroRevision) {
		this.numeroRevision = numeroRevision;
	}
	public CitasRevision(LocalDate fecha, Integer hora, String nombre, Boolean seguro, CitasRevision revision, Integer numero) {
		super(fecha, hora, nombre, seguro, revision);
		this.numeroRevision= numero;
	}
	


	
}
