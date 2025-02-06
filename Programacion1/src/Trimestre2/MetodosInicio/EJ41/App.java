package Trimestre2.MetodosInicio.EJ41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1
		List<Jugador> listaEquipo1 = new ArrayList <>();
		List <Jugador> listaEquipo2 = new ArrayList <>();
		Equipo equipo1 = new Equipo("Sevilla");
		Jugador jugador1 = new Jugador ("Vinicius", 7);
		Jugador jugador2 = new Jugador ("Jhony", 5);
		Jugador jugador3 = new Jugador ("Juan",1);
		
		Equipo equipo2 = new Equipo("Betis");
		Jugador jugador4 = new Jugador ("Juanma", 8);
		Jugador jugador5 = new Jugador ("David", 9);
		Jugador jugador6 = new Jugador ("Gabriel",6);
		
		equipo1.setCapitan(jugador1); 
		equipo2.setCapitan(jugador4);
		
		listaEquipo1.add(jugador1);
		listaEquipo1.add(jugador2);
		listaEquipo1.add(jugador3);
		
		listaEquipo2.add(jugador4);
		listaEquipo2.add(jugador5);
		listaEquipo2.add(jugador6);
		
		equipo1.setListaJugador(listaEquipo1);
		equipo2.setListaJugador(listaEquipo2);
		
		System.out.println(equipo1);
		System.out.println(equipo2);
		//2
		Resultado resultado = new Resultado();
		resultado.setGolesLocales(0);
		resultado.setGolesVisitantes(0);
		Partido partido = new Partido (equipo1,equipo2,resultado);
		System.out.println(partido);
		//3
		System.out.println("Cual es el resultado del equipo Local");
		Integer eq1 = sc.nextInt();
		System.out.println("Cual es el resultado del equipo Visitante");
		Integer eq2 = sc.nextInt();
		resultado.setGolesLocales(eq1);
		resultado.setGolesVisitantes(eq2);
		System.out.println(partido);
		//4
		System.out.println();
		System.out.println("Equipo ganador: " + partido.getEquipoGanador());
		//5
		System.out.println("Nuevo juagdor: ");
		Jugador nuevoJugador = new Jugador("Blas Infiltrado",99);
		listaEquipo2.add(nuevoJugador);
		System.out.println(equipo2);
		//6
		System.out.println("Cambiar Capitan equipo local");
		equipo1.setCapitan(listaEquipo1.get(1));
		System.out.println(equipo1);
		sc.close();
	}

}
