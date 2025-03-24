package com;

public class Estudiante {
  
	//Atributos
    private String nombre;
    private int edad;
    private String matricula;
    private String curso;
    private double calificaciones;
    
    //Constructor Vacio
    public Estudiante(){
    	
    }

    
    //Constructor Con todos los parametros clic derecho sourece 
	public Estudiante(String nombre, int edad, String matricula, String curso, double calificaciones) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
		this.curso = curso;
		this.calificaciones = calificaciones;
	}

	//Etodos Getters y setters clic derecho source 
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(double calificaciones) {
		this.calificaciones = calificaciones;
	}

	//Metodo toString clic derecho sourece
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + ", curso=" + curso
				+ ", calificaciones=" + calificaciones + "]";
	}
    
    //
    
    
    
    
}
