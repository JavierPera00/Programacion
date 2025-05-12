package Trimestre2.MetodosInicio.EJ33;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		Semaforo semaforo = new Semaforo();
		
		//2
		semaforo.setColor("BLANCO");
		System.out.println(semaforo.getColor());
		
		//3
		semaforo.setColor("VERDE");
		System.out.println(semaforo.getColor());
		
		//4
		semaforo.setParpadeando(true);
		System.out.println(semaforo.getParpadeando());
		
		//5
		semaforo.setColor("AMBAR");
		System.out.println(semaforo.getColor());
		
		//6
		semaforo.setParpadeando(true);
		System.out.println(semaforo.getParpadeando());
		
		//7
		for(int i = 0; i <5 ; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo.toString());
		}
		
		//8
		System.out.println(" ");
		Semaforo semaforo1 = semaforo;
		System.out.println(semaforo1);
		
		Semaforo copia = new Semaforo();
		copia.setColor(semaforo.getColor());
		copia.setParpadeando(semaforo.getParpadeando());
		System.out.println(copia);
	}

}
