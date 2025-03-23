package com;

public abstract class Persona {

	
	private String nombre;
	private String genero;
	private int edad;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
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


	public int getEdad() { //Ej. metodo con retorno, nos devuelve la edad en un tipo de dato entero.
		return edad;
	}


	public void setEdad(int edad) { //Ej. metodo sin retorno
		this.edad = edad;			//
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	//METODOS PROPIOS
	//Nuestros objetos pueden tener comportamientos que definamos nosotros.
	
	//Acciones que nuestros objetos puedan realizar
	
	
	//METODOS SIN RETORNO - Aquellos que nos permiten ejecutar algo pero no necesitan regresar algun tipo de dato o valor.
	//Llevan la palabra reservada "void"
	
	/**
	 * Este metodo envia un mensaje impreso en consola que dice "Estoy comiendo..."
	 */
	
	public void comer() {
		System.out.println("Soy "+ nombre +". Estoy comiendo... ");
		
	}
	
	//METODO CON RETORNO
	//Aquellos que ejecutan algo pero ademas se ven obligador a devolver un tipo de dato.
	//El tipo de dato que se declara.
	
	/**
	 * Este metodo devuelve un String con un saludo.
	 * @return Devuelve el saludo y el nombre del objeto.
	 */
	public String saludar() {
		String saludo = "Hola buen dia mi nombre es " + nombre;
		//Si yo quiero que este metodo imprima en consola el saludo, lo podemos hacer.
		System.out.println(saludo);
		return saludo;//Este metodo devuelve el String saludo.
	}
	
	//METODO POLIMORFICO
	//Metodos que se llaman igual pero que se ejecutan de distinta forma
	//gracias a la sobrecarga de argumentos.
	public void comer(String comida) {
		System.out.println("Soy " + nombre + ". Estoy comiendo " + comida);
	}
	
	//Otro metodo comer
	public void comer(String comida, int raciones) {
		System.out.println("Soy " + nombre + ". Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	//Creando un metodo de suma abstracto
	//Un metodo abstracto es aquel que nos dice que hacer pero no como hacerlo.
	//Es decir, un metodo sin cuerpo.
	public abstract int sumar(int a, int b);
	
}
