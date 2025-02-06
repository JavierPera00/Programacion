package Trimestre2.MetodosInicio.EJ31;

import java.util.ArrayList;

public class ListaFecha extends Fecha{

	private ArrayList<Fecha> lista;
	
	
	public ArrayList <Fecha> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Fecha> lista) {
		this.lista = lista;
	}
	
	public ListaFecha(String dia, String mes, String año) {
		super(dia, mes, año);
		this.lista = new ArrayList<>();
	}

	public void agregarFecha(Fecha fecha) {
		this.lista.add(fecha);
	}
	

}
