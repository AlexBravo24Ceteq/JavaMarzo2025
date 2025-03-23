package com;
//Recordar que en el paradigma POO, las clases son plantillas.
//Asi creamos los objetos a traves de atributos.

public class Computadora {

//ABSTRACCION - Pilar de la POO.
//ATRIBUTOS - Caracteristicas que puede tener mi objeto.
	
//tarjeta grafica, pantalla, tasa de refresco, fuente de poder, disipador,almacenamiento, RAM.

	
//ECAPSULACION O ENCAPSULAMIENTO - Pilar de la POO
//Consiste en proteger el nuevel de acceso a la informacion.
//MODIFICADORES DE ACCESO. - private,protected, default, public.
private String marca;
private String modelo;
private String color;
private String tipo;
private double precio;
private double ram;
private double almacenamiento;
private double procesador;
	
//METODOS CONSTRUCTORES - Metodos que nos permiten crear/iniciar a nuestros objetos.
//Ya sea con o sin atrubutos iniciados.

//METODO DE CONSTRUCTOR VACIO - permite iniciar un objeto vacio para poder asignarle posteriormente valor a sus atributos.

public Computadora (){
	
}
//METODO CONTRUCTOR CON TODOS LOS PARAMETROS.
//Nos permite crear un objeto pero que al momento de crearlo, solicite todos los atributos para iniciarlo.
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
//PODEMOS GENERAR TANTOS CONTRUCTORES COMO NECESITEMOS Y SOLO CON LOS ATRIBUTOS QUE NECESITEMOS
//GENERALMENTE EL CONSTRUCTOR VACIO Y EL DE TODOS LOS PARAMETROS ES MAS QUE SUFICIENTE
	
public Computadora (String marca, double precio) {
	super();
	this.marca = marca;
	this.precio = precio;
}
//METODOS GETTERS Y SETTERS
//METODO GET - nos devuelve o proporciona acceso de lectura de un atributo
//METODO SET- 

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
//Muestra todos los valores de nuestro objeto en formato String
//Util para poder imprimir en consola y poder ver como se conforma nuestro objeto como si de una "Radiografia" se tratara.
@Override
public String toString() {
	return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", precio="
			+ precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", procesador=" + procesador + "]";
}



}
