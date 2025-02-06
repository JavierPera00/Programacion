package Trimestre2.MetodosInicio.EJ30;


public class Curso {

	private String id;
	private String descripcion;
	private Alumno[] alumnos;
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public  Curso (String id, String descripcion, Integer numero) {
		this.id = id;
        this.descripcion = descripcion;
		this.alumnos = new Alumno [numero];
	}
	
	public void addAlumno (Alumno alumno) {
		for (int i = 0; i < this.alumnos.length;i++) {
			if (this.alumnos[i] == null) {
				this.alumnos[i]= alumno;
				break;
			}
		}
	}

}
