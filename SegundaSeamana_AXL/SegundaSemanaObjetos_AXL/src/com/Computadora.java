package com;

//18/03/2025
/*En este paradigma de la POO, nuestras clases serian como
 * plantillas para crear objetos
 */


public class Computadora {

	//ABSTRACCION - Pilar de la POO
	//Atributos-caracteristicas que puede tener mi objeto
	
	/*tarjeta grafica, pantalla, fuente de poder
	 * disipador, almacenamiento, ram, etc.
	 */
	
	//ENCAPSULACION - Pilar POO 
	//consiste en proteger el nivel de acceso de la infromacion
	
	//Modificadores de acceso- private, protected, default, public
	
	
	//Estos son los atributos
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private double ram;
	private double alamacenamiento;
	private double procesador;
	
	//METODOS CONSTRUCTOTES
	/*Son metodos que nos permiten crear/iniciar a nuestros objetos
	 * ya sea con o sin atributos iniciados
	 * 
	 *///METODO CONSTUCTOR VACIO - 
	/*Me permite iniciar un objeto vacio para poder
	 * asignarle posteriormente valores a sus atributos
	 */
	public Computadora() {
		
	}
	
	
	//Metodo constuctor con todos los parametros
	/*Nos va permitir crear un objeto, pero que al momento de crearlo 
	 * nos va a solicitar todos los atributos para iniciarla
	 */
	public Computadora(String marca, String modelo, String color, String tipo, double precio, double ram,
			double alamacenamiento, double procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
		this.ram = ram;
		this.alamacenamiento = alamacenamiento;
		this.procesador = procesador;
	}
	
	//Podemos generar tantos constructores como necesitemos y solo con los atributos
		//pero generalmente vacio y el de todos los parametros 
		//es mas que suficiente
	
	public Computadora(String marca, double precio) {
		super();
		this.marca=marca;
		this.precio=precio;
	}
	
	//Metodos Geters y Setters
	//Get- nos devuelven o proporcionan acceso de lectura de un atributo privado
	//Set- nos permiten establecer o asignar un valor a un atributo privado
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getRam() {
		return ram;
	}


	public void setRam(double ram) {
		this.ram = ram;
	}


	public double getAlamacenamiento() {
		return alamacenamiento;
	}


	public void setAlamacenamiento(double alamacenamiento) {
		this.alamacenamiento = alamacenamiento;
	}


	public double getProcesador() {
		return procesador;
	}


	public void setProcesador(double procesador) {
		this.procesador = procesador;
	}


	//METODO TO STRING
	/*Nos muestra todos los valores de nuestro objeto en formato String
	 * util para manadrlo a imprimir  en consola y poder ver como se  forma o compone
	 * nuestro objeto como si de una radiografia se tratara
	 */
	
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", precio=" + precio + ", ram=" + ram + ", alamacenamiento=" + alamacenamiento + ", procesador="
				+ procesador + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
