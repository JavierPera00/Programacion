package Trimestre2.MetodosInicio.EJ31;

import java.util.Arrays;

public class Fecha {

	private String dia;
	private String mes;
	private String año;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public Fecha(String dia, String mes, String año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}	
}
