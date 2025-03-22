package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private double edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, double edad) {
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

	public String getGenero() { //Método con retorno, devuelve el genero en un tipo de dato entero
		return genero;
	}

	public void setGenero(String genero) {//Método sin retorno, establece un nuevo genero sin regresar información
		this.genero = genero;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Métodos propios
	//Nuestros objetos pueden tener comportamientos que nosotros vayamos a definir
	
	//Acciones que nuestros objetos pueden realizar
	
	//Métodos son retorno
	//Son aquellos que nos van a permitir ejecutar algo, pero no necesita regresar
	//o devolver un tipo de dato. LLevan la palabra reservada "void"
	
	public void comer() {
		System.out.println("Soy " + nombre + " Estoy comiendo.... ");
	}
	
	//Método con retorno
	//Son aquellos que ejecutan algo pero ademas son obligados a
	//devolver un tipo de dato. El tipo de dato que declaran
	
	/**
	 * Este metodo devuelve un String con un saludo
	 * @return Devuelve el saludo y el nombre del objeto
	 */
	public String saludar() {
		String saludo = "Holas buen día mi nombre es " + nombre;
		//Si yo quiero que este metodo imprima en consola el saludo
		System.out.println(saludo);
		return saludo; //Este método va a devolver el String saludo
		}
	//Polimorfismo
		//Método polimorfico
		//Son métodos que se llaman igual, pero se ejecutan de distintaforma
		//gracias a la sobrecarga de argumentos
		
	/**
	 * Este metodo envia un mensaje impreso en consola que dice "Estoy comiendo algo"
	 * @param comida
	 */
	public void comer(String comida) {
			System.out.println("Soy " + nombre + " .Estoy comiendo " + comida);
		}
		//El tener varios metodos se da gracias a la sobre carga de metodos
		public void comer(String comida, int raciones) { //Mientras mas parametros pida se le llama sobre carga de argumentos
			System.out.println("Soy " + nombre + " .Estoy comiendo " + raciones + " raciones de " + comida);
		}
		
		//Creando un metodo sumar abstracto
		//Un método abstracto es aquel que nos dice que hacer pero no coo hacerlo
		//es un método sin cuerpo
		
		public abstract int sumar(int a, int b);
}
