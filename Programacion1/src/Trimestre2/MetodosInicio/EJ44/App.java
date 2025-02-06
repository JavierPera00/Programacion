package Trimestre2.MetodosInicio.EJ44;

import java.util.ArrayList;
import java.util.List;

import Trimestre2.MetodosInicio.EJ43.Actores;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		List<Equipo> lista1 = new ArrayList<>();
		Asesino asesino1 = new Asesino ("Juan", "b99");
		Asesino asesino2 = new Asesino ("Jony", "b98");
		Asesino asesino3 = new Asesino ("Javier", "b97");
		Equipo equipo1 = new Equipo();
		Equipo equipo2 = new Equipo();
		equipo1.agregarLista(asesino1);
		equipo1.agregarLista(asesino2);
		equipo1.agregarLista(asesino3);
		System.out.println(equipo1);
		
		//2
		Parasito parasito1 = new Parasito("Blas", "B69");
		System.out.println(parasito1.quitarVida());
		System.out.println(parasito1.segundoDaño());
		
		//3
		equipo1.agregarLista(parasito1);
		
		//4
		System.out.println(equipo1.puntosEquipo(equipo1.getPersonajes()));
		
		//5
		equipo1.agregarLista(parasito1);
		
		//6
		System.out.println(equipo1);
		
		//7
		Parasito parasito2 = new Parasito("Pepe", "B67");
		Parasito parasito3 = new Parasito("Pepito", "B64");
		equipo1.agregarLista(parasito2);
		equipo1.agregarLista(parasito3);
		
		//8
		System.out.println(equipo1);
		
		//9
		System.out.println(equipo1.puntosEquipo(equipo1.getPersonajes()));
	}

}



