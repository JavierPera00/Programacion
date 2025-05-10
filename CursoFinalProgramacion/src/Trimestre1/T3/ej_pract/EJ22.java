package Trimestre1.T3.ej_pract;

public class EJ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] lista = new Integer[11][11];
		for (int i = 0; i <= 10; i++) {
			System.out.println();
			for (int y = 0; y <= 10; y++) {
				lista[i][y] = i * y;            
			}
		}
		// imprimir
		for (int i = 0; i <= 10; i++) {
			System.out.println();
			for (int y = 0; y <= 10; y++) {
				System.out.print(lista[i][y] + "\t");
			}
		}

	}
}
