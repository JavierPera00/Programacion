package Trimestre1.T2;


public class EJ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		for(int i = 1;i <= 9;i++) {
			System.out.println();
			for (int y = 1;y <= i;y++)  {
		/*Se y es mas chico o igual que i, imprime y con un espacio.
		Iguala "y" a "i" para que si "y" es mas grande que "i" se sale, y comienza de nuevo */
				System.out.print(y + " ");	
			}
			System.out.println();
		}

		//Agrego nuevo
		for(int i = 8;i >= 1;i--) {
			System.out.println();
			for (int y = i;y >= 1;y--)  {
				System.out.print(y + " ");	
			}
			System.out.println();
		}
		
		
		
		
	}

}
