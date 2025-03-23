package com;

public class Autos {
	
private String marca;
private String modelo;
private String tipo;
private String color;
private double precio;


//METODO DE CONSTRUCTOR VACIO - permite iniciar un objeto vacio para poder asignarle posteriormente valor a sus atributos.

public Autos(){
	
}

//METODO CONTRUCTOR CON TODOS LOS PARAMETROS.
public Autos(String marca, String modelo, String tipo,String color ,double precio){
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.color = color;
	this.precio = precio;
	
}

//METODOS GETTERS Y SETTERS
public String getMarca(){
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo(){
	return modelo;
}public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getTipo(){
	return tipo;
}
public void setTipo(String tipo){
	this.tipo = tipo;
}
public String getColor(){
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrecio(){
	return precio;
}
public void setPrecio(double precio){
	this.precio = precio;
}
//METODO TO STRING
@Override
public String toString() {
	return "Autos [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", precio=" + precio
			+ "]";
}


}
