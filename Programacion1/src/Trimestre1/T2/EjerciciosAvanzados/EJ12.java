package Trimestre1.T2.EjerciciosAvanzados;


public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 1;

		switch (numero) {

		case 1:
			for (int i = 1; i <= 9; i++) {
				System.out.print(" " + i + " ");
			}
		case 2:
			System.out.println();
			for (int i = 2; i <= 8; i = i + 2) {
				System.out.print(" " + i + " ");
			}
		case 3:
			System.out.println();
			for (int i = 3; i <= 9; i = i + 3) {
				System.out.print(" " + i + " ");
			}
		case 4:
			System.out.println();
			for (int i = 4; i <= 8; i = i + 4) {
				System.out.print(" " + i + " ");
			}
		case 5:
			System.out.println();
			for (int i = 5; i <= 5; i = i + 2) {
				System.out.print(" " + i + " ");
			}
		case 6:
			break;
		}
	}

}
