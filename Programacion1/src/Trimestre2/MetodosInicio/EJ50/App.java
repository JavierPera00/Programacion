package Trimestre2.MetodosInicio.EJ50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Set <Pais> lista = new HashSet<>();
		System.out.println(lista);
		//2
		Pais pais1 = new Pais("ES","España");
		Pais pais2 = new Pais("CK","Islas Cook");
		Pais pais3 = new Pais("CK","Islas Caiman");
		
		//3
		lista.add(pais1);
		lista.add(pais2);
		lista.add(pais3);
		System.out.println(lista);
		
		//4
		Pais paisNuevo = new Pais ("es","España");
		lista.add(paisNuevo);
		System.out.println(lista);
		
		//5 Metodo Nuevo Creado
		lista = Pais.agregarLista (lista,paisNuevo);
		System.out.println(lista);	
	
		//6
		Iterator<Pais> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (!pais.getCodigo().equals("ES")) {
                iterator.remove();
            }
        }
		System.out.println(lista);	
	}
}

	
