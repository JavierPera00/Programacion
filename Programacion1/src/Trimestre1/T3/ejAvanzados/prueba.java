package Trimestre1.T3.ejAvanzados;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tablero = new String[10][10]; // 5minas

		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print("|  ");
				if (j == 9) {
					System.out.print("|  |");
				}

			}
		}
	}
	public static void tablero (String [][]tablero) {
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print("|  ");
				if (j == 9) {
					System.out.print("|  |");
				}
			}
		}
	}
}
