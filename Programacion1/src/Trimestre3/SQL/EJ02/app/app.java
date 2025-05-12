package Trimestre3.SQL.EJ02.app;

import java.util.ArrayList;
import java.util.List;

import Trimestre3.SQL.EJ02.modelo.Persona;
import Trimestre3.SQL.EJ02.service.PersonasServive;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona ();
		PersonasServive ps = new PersonasServive();
		List<Persona> lista = new ArrayList<>();
		
		System.out.println(ps.consultarPersona("12345678H"));
		System.out.println(ps.buscarPersona("e"));
		
		
	}

	

}
