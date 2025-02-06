package Trimestre2.MetodosInicio.EJ32;

import java.util.Objects;

public class Reloj {

	// 1
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24Horas;

	// 2
	public Reloj() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
		formato24Horas = true;
	}

	public Reloj(Integer hora, Integer minuto, Integer segundo) {
		this.formato24Horas = true;
		this.horas = hora;
		this.minutos = minuto;
		this.segundos = segundo;
	}

	// 3
	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	// 4
	public void ponerenHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerenHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	//5
	public void set(Boolean formato) {
		this.formato24Horas = formato;
	}
	//6
	public Boolean check() {
		Boolean v = true;
		if(this.horas <= 23 || this.horas >= 0) {
			v = true;
		}
		if (this.minutos <= 59 || this.minutos >= 0) {
			v = true;
		}
		if (this.segundos <= 59 || this.segundos >= 0) {
			v = true;
		}
		else {
			v = false;
		}
		return v;
	}
	@Override
	public String toString() {
		String respuesta = "";
		if (this.check() == false) {
			System.err.println("Hora Incorrecta");
		}
		if (this.formato24Horas == true) {
			respuesta =  horas  + ":" + minutos + ":" + segundos;
		}
		else if (this.formato24Horas == false) {
			if (horas > 12) {
				respuesta = horas-12  + ":" + minutos + ":" + segundos + "pm";
			}
			else {
				respuesta = horas  + ":" + minutos + ":" + segundos + "am";
			}
		}
		return respuesta;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
}
