package Trimestre2.MetodosInicio.EJ54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		CuentaAhorros cuenta1 = new CuentaAhorros("12358965874589658965".trim());
		System.out.println("Movimientos: " + cuenta1.obtenerMovimiento());

		// 2
		cuenta1.añadir(new Movimiento(LocalDate.now(), new BigDecimal("103.1"), "C"));
		cuenta1.añadir(new Movimiento(LocalDate.now(), new BigDecimal("8.00"), "C"));
		cuenta1.añadir(new Movimiento(LocalDate.now(), new BigDecimal("1.50"), "I"));
		cuenta1.añadir(new Movimiento(LocalDate.now(), new BigDecimal("60.00"), "I"));
		cuenta1.añadir(new Movimiento(LocalDate.now(), new BigDecimal("20.00"), "R"));

		// 3
		System.out.println("Dinero cuenta : " + cuenta1.obtenerMovimiento());

		// 4
		System.out.println("Movimientos:");
		for (String mov : cuenta1.obtenerMovimiento()) {
			System.out.println(mov);
		}

		// 5
		System.out.println("Cargos:");
		for (String cargo : cuenta1.obtenerCargos()) {
			System.out.println(cargo);
		}

		// 6
		System.out.println("Ingresos:");
		for (String ingreso : cuenta1.obtenerIngresos()) {
			System.out.println(ingreso);
		}

		// 7
		System.out.println("Retiradas:");
		for (String retirada : cuenta1.obtenerRetiradas()) {
			System.out.println(retirada);
		}
	}
}
