package Trimestre2.MetodosInicio.EJ54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros  {

	private String numero;
	private List<Movimiento> lista;

	public List<Movimiento> getLista() {
		return lista;
	}

	public void setLista(List<Movimiento> lista) {
		this.lista = lista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public CuentaAhorros(String numero) {
		if(numero.length() != 20) {
			System.out.println("ERROR | número no tiene 20 dígitos | ");
		}
		this.lista = new ArrayList<>();
		this.numero = numero;
	}
	
	public void añadir (Movimiento movimiento) {
		this.lista.add(movimiento);
	}
	public BigDecimal obtener (Movimiento movimiento) {	
		BigDecimal numero = BigDecimal.ZERO;
		if(movimiento == null) {
			System.out.println("ERROR | Usuario vacío");
			return BigDecimal.ZERO;
		}
		for (Movimiento listaa : this.lista) {
			numero = numero.add(movimiento.getImporte());
		}
		return numero;
	}
	
	public List<String> obtenerMovimiento (){
		List<String> movimientoFacturas = new ArrayList<>();
		for (Movimiento lista : lista) {
			movimientoFacturas.add(lista.toString());
		}
		return movimientoFacturas;
	}
	
	 public List<String> obtenerRetiradas() {
	        List<String> listaRetiradas = new ArrayList<>();
	        for (Movimiento movimiento : this.lista) {
	            if (movimiento.getDescripcion().equals("R")) {
	                listaRetiradas.add(movimiento.toString());
	            }
	        }
	        return listaRetiradas;
	    }

	    public List<String> obtenerIngresos() {
	        List<String> listaIngresos = new ArrayList<>();
	        for (Movimiento movimiento : this.lista) {
	            if (movimiento.getDescripcion().equals("I")) {
	                listaIngresos.add(movimiento.toString());
	            }
	        }
	        return listaIngresos;
	    }

	    public List<String> obtenerCargos() {
	        List<String> listaCargos = new ArrayList<>();
	        for (Movimiento movimiento : this.lista) {
	            if (movimiento.getDescripcion().equals("C")) {
	                listaCargos.add(movimiento.toString());
	            }
	        }
	        return listaCargos;
	    }




	

}
