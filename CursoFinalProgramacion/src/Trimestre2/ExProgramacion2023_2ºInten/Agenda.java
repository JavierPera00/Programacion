package Trimestre2.ExProgramacion2023_2ºInten;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

	private List<Cita> lista;
	private String medico;

	public Agenda(String medico) {
		this.medico = medico;
		this.lista = new ArrayList<>();
	}

	public String getMedico() {
		return medico;
	}

	// Metodos
	public void addCita(Cita cita) {
        if (!lista.contains(cita)) {
            lista.add(cita);
        }
    }

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> citasHoy = new ArrayList<>();
		for (int i = 0; i < this.lista.size(); i++) {
			if (this.lista.get(i).getFecha().equals(fecha)) {
				citasHoy.add(lista.get(i));
			}
		}
		return citasHoy;
	}

	public BigDecimal getImportePedienteFacturar() {
		BigDecimal importe = BigDecimal.ZERO;
		for (int i = 0; i < this.lista.size(); i++) {
			if(!this.lista.get(i).getFacturada()) {
				importe = importe.add(this.lista.get(i).getImporteFactura());
			}
		}
		return importe.setScale(2, RoundingMode.HALF_DOWN);
	}

	public Boolean tieneCitaProxima(String paciente) {
		LocalDate fechaHoy = LocalDate.now();
		for (int i = 0; i < this.lista.size(); i++) {
			if (this.lista.get(i).getNombrePaciente().equalsIgnoreCase(paciente)) {
				if (this.lista.get(i).getFecha().isAfter(fechaHoy)) { // Posterior
					return true;
				}
			}
		}
		return false;
	}

	public void borrarCitasFacturadas(String paciente) {
		Iterator<Cita> listaa = this.lista.iterator();
		while (listaa.hasNext()) {
			if (listaa.next().getFacturada() == true && listaa.next().getNombrePaciente().equalsIgnoreCase(paciente)) {
				listaa.remove();
			}
		}
	}

	public void facturarCitasPendientes(String paciente) {
		LocalDate fechaHoy = LocalDate.now();
		for (Cita cita : lista) {
			if (cita.getNombrePaciente().equals(paciente)) {
				if (cita.getFecha().isBefore(fechaHoy)) {
					cita.setFacturada(true);
				}
			}
		}
	}
}
