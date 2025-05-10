package Trimestre2.MetodosInicio.EJ36;

import java.util.List;

public class Curso {

	private String id;
	private String descripcion;
	private List<Alumno> alumnos;
	private Integer maxAlumno = 0;

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getMaxAlumno() {
		return maxAlumno;
	}

	public void setMaxAlumno(Integer maxAlumno) {
		this.maxAlumno = maxAlumno;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Curso(Integer numero,String id, String descripcion) {
		this.maxAlumno = numero;
		this.descripcion= descripcion;
		this.id=id;

	}

	public void addAlumno(Alumno alumno) {
		if (this.alumnos.size() < this.maxAlumno) {
			alumnos.add(alumno);
		}else {
			System.out.println("CURSO COMPLETO");
		}
	}

}
