package com;

public class Persona {

	private String nombre;
	private String genero;
	private int edad;

	public Persona() {
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

	// METODOS PROPIOS
	// Nuestros objetos pueden tener comportamientos que nosotros les vayamos a
	// definir

	// acciones que nuestros objetos pueden realizar

	// METODOS SIN RETORNO
	// Son aquellos que nos van a permitir ejecutar algo, pero no necesitan
	// regresar o devolver un tipo de dato. Llevan la palabra reservada "void"

	public String comer() {
		return "Soy " + nombre + ". Estoy comiendo.....";
	}

	// METODO CON RETORNO
	// Son aquellos que ejecutan algo, pero ademas se ven obligados a devolver
	// un tipo de dato. El tipo de dato que declaran

	public String saludar() {
		String saludo = "Hola buen dia mi nombre es " + nombre;
		return saludo;
	}

}

// BUENOS DÌAS