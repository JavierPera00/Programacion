package Trimestre2.MetodosInicio.EJ60;

public class Naipe {

	private Integer numero;
	private Integer palo;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPalo() {
		return palo;
	}

	public void setPalo(Integer palo) {
		this.palo = palo;
	}

	public Integer valorMenor() {
		if(numero == 8 || numero == 9 || numero == 10) {	
		}
		return this.numero;
	}
	
	public Integer valorMayor() {
		if(numero < 11) {	
			numero = valorMenor();
		}
		return numero;
	}

	@Override
	public String toString() {
		String palos = "";
		if (this.palo == 1) {
			palos = "OROS";
		}
		else if (this.palo == 2) {
			palos = "COPAS";
		}
		else if (this.palo == 3) {
			palos = "ESPADAS";
		}
		else {
			palos = "BASTOS";
		}
		return "Número de carta = " + numero + " |  palo = " + palo + " --> " + palos;
	}
	
	
	
	
}
