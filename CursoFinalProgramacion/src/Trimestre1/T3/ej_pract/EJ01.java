package Trimestre1.T3.ej_pract;

import java.util.ArrayList;

public class EJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				arraylist.add(i);
			}
		}
		for (int y = 0; y < arraylist.size(); y++) {
			System.out.print(arraylist.get(y) + "\t");
		}

		
		
	}

}
