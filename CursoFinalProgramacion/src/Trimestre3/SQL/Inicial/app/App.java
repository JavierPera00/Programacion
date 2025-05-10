package Trimestre3.SQL.Inicial.app;

import Trimestre3.SQL.Inicial.modelo.Persona;
import Trimestre3.SQL.Inicial.services.PersonasServive;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PersonasServive p1 = new PersonasServive();
		
		
		
		Persona persona;
		
		persona = p1.consultarPersona("12345678H");
		if(persona == null) {
			System.out.println("No existe el usuario");
		}else {
			System.out.println(persona);
		}
	
		
		
		/*insert into personas values ('12345678H','Javier','Pera', '12/02/2004');
		insert into personas values ('12345678J','Juan','Sanchez', '12/02/2004');
		insert into personas values ('12345678P','Jony','Guzman', '12/02/2004');*/
	}

}
