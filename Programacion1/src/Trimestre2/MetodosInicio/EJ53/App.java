package Trimestre2.MetodosInicio.EJ53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1:
		Hucha hucha1 = new Hucha();
		System.out.println(hucha1);
		// 2
		BigDecimal num1 = new BigDecimal (100);
		hucha1.meterDinero(num1);
		System.out.println(hucha1);
	}

}
