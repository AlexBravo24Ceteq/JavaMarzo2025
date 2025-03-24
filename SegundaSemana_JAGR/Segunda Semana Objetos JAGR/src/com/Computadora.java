package com;

public class Computadora {
	
	//Recuerden que en este paradiogma de la POO
	
	//Atributos - caracteristicas que puede tener mi objeto
	//tarjeta grafica, pantalla, tasa de refresco, fuente de poder, disipador,
	//almacenamiento, ram,
	
	//Encapsulacion o ENCAPSULAMIENTO - pilar POO
	//Consiste en protegher el nivel de acceso a la informacion
	//Modificadores de acceso - PRIVATE, PROTECTED, DEFAULT, PUBLIC
	
	private String marca; 
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private double ram;
	private double almacenamiento;
	private double procesador;
	
	//METODOS CONSTRUCTORES
	//Son metodos que nos van a permitir crear/ iniciar a nuestros objetos
	//Ya sea con o sin atributos iniciados
	
	//METODO CONSTRUCTOR VACIO - me permite iniciar un objeto vacio
	//para poder asignarle posteriormente valor de atributos
	
	public Computadora () {
		
	}

	//METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
	//nos va a permitir crear un objeto pero que al momento de crearlo
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
	//podemos generar tantos CONTRUCTORES como necesitemos y solo con los atributos
	//QUE NECESITEMOS
	// pero generalmente con el constructor vacio y el de todos los parametros es mas que
	//SUFICIENTE.
	
	public Computadora(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	
	//ESTOS SERIAN LOS METODOS GETTER Y SETTERS
	//CLICK DERECHO, SOURCE Y GENERE GETTERS Y SETTERS
	//METODO GET -nos devuelven o proporcionan un acceso de la lectura de un atributo privado
	//METODO SET - nos permiten establecer o asignar un valor a un atributo privado
	
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

	
	// metodo TO STRING
	//CLICK DERECHYO, SOURCE, GENERATE TO STRING
	//Nos muestra todos los valores de nuestro objeto en formato string
	//util para mandarlo a imprimir en consola y poder ver como se forma o compone
	//nuestro objeto como si de una "Radiografia" se tratara.,
	
	
	@Override  //Sobreescribir
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", precio=" + precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", procesador="
				+ procesador + "]";
	}

	
	
	
}
