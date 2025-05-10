package Trimestre3.Excepciones.EJ06;


import java.math.BigDecimal;
import java.util.Scanner;

public class App {


	public static void main(String[] args) throws ParametroIncorrectoException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona person1 = new Persona();
		
		person1.setGenero("M");
		person1.setGenero("H");
		
		person1.setAltura(new BigDecimal(1));
		person1.setAltura(new BigDecimal(2));
		
		sc.close();
	}

}
