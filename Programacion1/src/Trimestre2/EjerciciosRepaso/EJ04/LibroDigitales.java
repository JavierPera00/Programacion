package Trimestre2.EjerciciosRepaso.EJ04;



public class LibroDigitales extends Libros{

	
	public LibroDigitales(String autor,String titulo, String fechaEdicion, Integer paginas) {
		super(autor,titulo,paginas,fechaEdicion, fechaEdicion, paginas);
	}

	

	@Override
    public int obtenerPeso() {
        return 0;
    }
}
