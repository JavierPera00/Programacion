package Trimestre3.SQL.EJ07.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Trimestre3.SQL.EJ07.modelo.Persona;
import Trimestre3.SQL.EJ07.service.PersonasServive;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonasServive service = new PersonasServive();
		Scanner sc = new Scanner(System.in);

		List<Persona> persona = new ArrayList<>();
		//p1
		Persona p1 = new Persona();
		p1.setApellidos("Vidal");
		p1.setNombre("Javier");
		p1.setDni("12345678Q");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.parse("12/04/2000", format);
		p1.setFechaNac(fecha1);
		//p2
		Persona p2 = new Persona();
		p2.setApellidos("Sanchez");
		p2.setNombre("Manuel");
		p2.setDni("12345678V");
		LocalDate fecha2 = LocalDate.parse("12/04/2001", format);
		p2.setFechaNac(fecha2);
		
		persona.add(p1);
		persona.add(p2);
		
		service.insertarPersonas(persona);

	}
}
