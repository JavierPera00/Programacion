package Trimestre2.MetodosInicio.EJ22;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Curso c = new Curso ("adgf", "1111");
		Alumno a1 = new Alumno (c);
		a1.setCurso(c);
		System.out.println(a1.toString());
	}

}
