package Trimestre1.T1;

import java.math.BigDecimal;
import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal iva = new BigDecimal (0.21);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Que precio tiene el artículo sin IVA?");
		
		BigDecimal noIva= scanner.nextBigDecimal();
		BigDecimal resultado = noIva.multiply(iva);
		
		System.out.println("El precio sin Iva es de: "+ noIva + " "+ ","+
		" el precio con Iva es: "+ resultado+ " "+ ", y en total es: "+ noIva.add(resultado));
		scanner.close();
	}

}
