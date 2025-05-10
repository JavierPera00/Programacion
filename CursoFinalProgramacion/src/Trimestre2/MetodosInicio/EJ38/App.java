package Trimestre2.MetodosInicio.EJ38;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		PilaCadenas cad = new PilaCadenas();
		//2
		cad.añadirCadena("primero");
		cad.añadirCadena("segundo");
		System.out.println(cad.toString());
		//3
		cad.sacarCadena();
		System.out.println(cad.toString());
		//4
		cad.añadirCadena("tercero");
		
		//5
		while(cad.getTamaño()>0) {
			System.out.println("Has eliminado: " + cad.sacarCadena());
		}
		System.out.println(cad.toString());
		
		//6
		cad.añadirCadena("cuarto");
		System.out.println(cad.toString());
	}

}
