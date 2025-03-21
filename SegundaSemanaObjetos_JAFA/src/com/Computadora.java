package com;

//Recuerden que en este paradigma de la POO, nuestras clases serian
//como "plantillas" para poder crear objetos

public class Computadora {
	
	//Abstraccion - Pilar de POO
	
	//Atributos- caracteristicas que puede tener mi objeto
	
	
	//ENCAPSULAMIENTO o encapsulacion - pilar POO
	//consiste en proteger el nivel de acceso a la informacion
	//modifiadores de acceso- private, protected, defaul, public
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private double precio;
	private double ram;
	private double almacenamiento;
	private double procesador;
	
	
	//METODOS constructores
	
	//son metodos que nos van a permitir crear/ iniciar a nuestros objetos
	//ya sea con o sin atributos iniciados
	
	
	//Metodo constructor Vacio- me permite iniciar un objeto vacio
	//para poder asignarle posteriormente valor a sus atributos
	
	public Computadora() {
		
	}

	//METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
	//Nos va permitir crear un objeto pero que al momento de crearlo
	//nos va a solicitar todos los atributos para inicialo
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
	//Podemos generar tantos constructores como necesitemos y solo con los atributos
	//que necesitemos
	//pero generalment con el constructor vacio y el de todos los parametros es mas que 
	//suficientes
	public Computadora(String marca, String tipo, double precio) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.precio = precio;
	}
	//Metodos GETTERS Y SETTERS
	//METODO GET - Nos devuelven o poroporcionan acceso de lectura de un atributo privado
	//Metdodo Set- Nos permieten establecer o asignar un valor a un atributo privado
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
	
	//MEtodo TO STRING
	//Nos muestra todos los valores de nuestro objeto en formato String
	//util para mandarlo a imprimir en consola y poder ver como se forma o compone
	//nuestro objeto como si de una "Radiografia" se tratara
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo
				+ ", precio=" + precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", procesador="
				+ procesador + "]";
	}
	
	//
	
	
	
	
	
}
