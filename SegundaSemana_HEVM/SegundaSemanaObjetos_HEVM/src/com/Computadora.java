package com;

//Recuerden que en este paradigma de la POO nuestras clases serian 
//como plpantillas para poder crear objetos
public class Computadora {
	
	//Abstraccion - Pilar de la POO
	//La idea de traer ese objeto a la programación
	
	/*Atributod - caracteristicas que puede tener mi objeto
	*tarjeta grafica, pantalla, fuente de poder, memoria interna,
	*RAM, tarjeta madre, etc.
	*/
	
	
	//Encapsulacion o Encapsulamiento - Pilar de POO
	//Consiste en proteger el nivel de acceso a la información
	//Modificadores de acceso - private, protected, default, public
	
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private double ram;
	private double almacenamiento;
	private double procesador;
	
	//Métodos constructores
	//Son métodos que nos van a permitir crear/iniciar a nuestros 
	//objetos ya sea con o sin atributos iniciados
	
	//Método constructors vacío - me permite iniciar un objeto vacio
	//para poder asignarle posteriormente valor a sus atributos
	public Computadora() {
		
	}
	
	//Método constructor con todos los parametros
	//Nos va a permitir crear un objeto pero que al momento de crearlo
	//nos va a solicitar todos los atributos para iniciarlo
	public Computadora(String marca, String modelo, String color, String tipo, double precio, double ram,
			double almacenamiento, double procesador) {
		super();
		this.marca = marca; //marca se va a guardar en la variable local "private String marca;"
		this.modelo = modelo;  //Computadora hp = new Computadora("HP","440G7","Negro".......);
		this.color = color;
		this.tipo = tipo;
		this.precio = precio;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
	}

	//Podemos generar tantos constructores como necesitemos solo con los atributos deseados
	//Pero generalmente el constructor vacio y el de todos  los parametros son suficientes
	public Computadora(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	//Métodos Getters y Setters
	//Métodos Get- nos devuelven o proporcionan acceso de lectura de un atributo privado
	//Método Set - Nos permiten establecer o asignar un valor a un atributo privado
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
	
}
