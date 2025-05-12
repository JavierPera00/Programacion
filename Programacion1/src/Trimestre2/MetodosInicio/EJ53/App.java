package Trimestre2.MetodosInicio.EJ53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1:
		Hucha hucha1 = new Hucha();
		System.out.println(hucha1);
		// 2
		BigDecimal num1 = new BigDecimal(100);
		hucha1.meterDinero(num1);
		System.out.println(hucha1);

		// 3
		BigDecimal num2 = new BigDecimal(50.501);
		hucha1.meterDinero(num2);
		System.out.println(hucha1);

		// 4
		BigDecimal num3 = new BigDecimal(20.5);
		hucha1.sacarDinero(num3);
		System.out.println(hucha1);

		// 5
		BigDecimal num4 = new BigDecimal(200);
		hucha1.sacarDinero(num4);
		System.out.println(hucha1);

		// 6
		hucha1.meterDinero(new BigDecimal("130"));
		System.out.println(hucha1);

		// 7
		hucha1.meterDinero(hucha1.contarDinero());
		System.out.println(hucha1);
		// 8
		hucha1.meterDinero(hucha1.romperHucha());
		System.out.println(hucha1); 
	}

}
