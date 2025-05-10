package Trimestre2.CabecerasMetodo;

public class EJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1;
		int n1 = 2;
		int n2 = 0;
		System.out.println(comprobar (n,n1,n2));
	}
	public static Integer comprobar (Integer n,Integer n1,Integer n2) {
		int numero1 = 0;
		if (n < n1 && n < n2) {
			numero1 = n;
		}
		else if (n1 < n && n1 < n2) {
			numero1 = n1;
		}
		else if (n2 < n && n2 < n1) {
			numero1 = n2;
		}
		return  numero1;
	}
}
