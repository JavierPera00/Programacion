package Trimestre1.T3.ej_pract;

public class EJ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[][] lista = new Integer[5][10];
		int cont = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int y = 0; y < 10; y++) {
				cont++;
				lista[i][y] = cont;
			}
		}
		// imprimir
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int y = 0; y < 10; y++) {
				System.out.print(lista[i][y] + "\t");
			}
		}
	}
}
