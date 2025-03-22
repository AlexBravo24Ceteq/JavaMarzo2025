package com;

//Recuerdenn que en este paradigma de la POO, nueestras clases serian
//como "plantillas" para poder crear objetos
public class Computadora {
	
	//ABSTRACCION - PILAR DE LA POO
	
	//Atributos - caracteristicas que puede tener mi objeto
	
	//tarjeta grafica, pantalla, tasa de refreso,, fuente de poder, disipador
	//almacenamiento, ram
	
	
	//ENCAPSULACION O ENCAPPSULAMIENTO-PILAR POOO
	//Consiste en proteger el nivel de acceso a la informacion
	//Modificadores de acceso -private, protected, defaul, public
	
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private double ram;
	private double almacenamiento;;
	private double procesador;
	
	//METODOS CONSTRUCTORES
	//Son metodos que nos van a permitir crear/iniciar a nuestros objetos 
	//ya sea con o sin atributos iniciados
	
	//Metodo constructor vacio - me permite iniciar un objeto vacio 
	//paara poder asignarle posteriormente valor a sus atributos
	public Computadora() {
		
		
	}
	
	//METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
	//Nos va a permitir crear un objeto pero que al momento de crearlo
	//nos va a solicitar todos los atributos para iniciarlo

	public Computadora(String marca, String modelo, String color, String tipo, double precio, double ram,
			double almacenamiento, double procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		
		
	}
	//Podemos generar tantos constructores como necesitemos   solo con los atributos
	//que necesitemos
	//pero generalmente con el constructor vacio y el de todos los parametros es mas que
	//suficiente

	public Computadora(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
		
	}
	
	//METODOS GETTERS Y SETTERS
	//Metodos Get- nos devuelven o proporcionan acceso de lectura de un atributo privado
	//Metodos Set - Nos permiten establecer o asignar unn valor a un atributo privado

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

	public double getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(double almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public double getProcesador() {
		return procesador;
	}

	public void setProcesador(double procesador) {
		this.procesador = procesador;
	}
	
	//METODO TO STRING
	//Nos muestra todos los valores en formato String 
	//Util para mandarlo a imprimir en consola y podr ver como se forma o compone
	//nuestro objeto como si de una "radiografia" se tratara

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", precio=" + precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", procesador="
				+ procesador + "]";
	}
	
	
	
	
	
	

}
