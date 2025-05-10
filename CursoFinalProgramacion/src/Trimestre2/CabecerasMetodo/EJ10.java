package Trimestre2.CabecerasMetodo;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		System.out.println(media (listaNotas));
	}
	public static Integer media (Integer[] media) {
		Integer m = 0;
		for (int i = 0; i < media.length; i++) {
			m += media[i];
		}	
		return m/media.length;
	}
}
