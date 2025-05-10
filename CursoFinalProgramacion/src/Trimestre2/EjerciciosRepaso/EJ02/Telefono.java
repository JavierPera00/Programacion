package Trimestre2.EjerciciosRepaso.EJ02;

public class Telefono {

	private Integer numero;
	private Boolean enLLamada;

	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Boolean getEnLLamada() {
		return enLLamada;
	}
	public void setEnLLamada(Boolean enLLamada) {
		this.enLLamada = enLLamada;
	}
	
	public Telefono(Integer numero) {
		this.numero = numero;
		this.enLLamada = false;
	}

	public Integer consultarNumero(Integer numero) {
		return this.numero= numero;
	}

	public void marcar(Integer n) {
		System.out.println("LLAMANDO A " + n);

		if (this.numero != n) {
			System.out.println("EN COMUNICACIÓN");
			this.enLLamada = true;
		} else if (this.numero == n){
			System.out.println("COMUNICANDO");
			
		}
	}

	public void colgar() {
		if (enLLamada == true) {
			enLLamada = false;
			System.out.println("COMUNICACIÓN TERMINADA");
		}
		else {
			System.out.println("No hace nada");
		}
	}

}
