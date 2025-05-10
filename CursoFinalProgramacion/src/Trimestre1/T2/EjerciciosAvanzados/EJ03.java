package Trimestre1.T2.EjerciciosAvanzados;

public class EJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				for (int y = 1; y <= 9; y++) {
					System.out.print(" " + y);	
				}	
				System.out.println();
				}
				else if (i == 1) {
					for (int e = 1; e <= 8; e++) {
						e++;
						System.out.print(" " + e);	
					}
					System.out.println();
					}
					else if (i == 2) {
						for (int p = 0;p <= 8; p++) {
							p+=3;
							System.out.print(" " + p);
							p-=1;
						}
						System.out.println();
						}
						else if (i == 3)  {
							int cont = 4;
							for(int f = 0; f <= 4; f++) {
								if(f == 0 || f == 1) {
									System.out.print(" " + cont);
									cont +=4;
								}
							}
							System.out.println();
							}
							else {
								int num = 5;
								System.out.println(" " + num);
							}
		}	
	}
}
