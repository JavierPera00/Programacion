package Trimestre2.EjerciciosRepaso.EJ02;

public class Movil extends Telefono {

	private String gps;

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Movil(int numero, String gps) {
		super(numero);
		this.gps = gps;
	}

}
