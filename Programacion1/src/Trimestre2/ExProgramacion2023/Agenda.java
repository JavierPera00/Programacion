package Trimestre2.ExProgramacion2023;

import java.time.LocalDate;
import java.util.List;

public class Agenda {
	//Atributos
	private String medico;
	private List<Citas>citas;
	// Get y Set
	public String getMedico() {
		return medico;
	}
	/*public void setMedico(String medico) { Dice Solo Get del Especialista
		this.medico = medico;
	}
	public List<Citas> getCitas() {
		return citas;
	}
	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}*/
	// Constructores
	
	public Agenda(String medico) {
		super();
		this.medico = medico;
	}
	
	// Metodos
	public void addCita (Citas cita) {		
		if(!this.citas.contains(cita)) {
			citas.add(cita);
		}
	}
	public List<Citas> getCitasDias (LocalDate fecha){
		
		return this.citas;
	}
	
	
	
	
	
}
