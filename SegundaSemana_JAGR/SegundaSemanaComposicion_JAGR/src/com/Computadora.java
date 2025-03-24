package com;

public class Computadora {

	private String marca;
	private String modelo;
	private String color;
	private double precio;
	//Marca error porque de debe crear una clase
	//los siguientes atributos son objetos que formaran parte der la computadora
	
	private Ram memoria;
	private Procesador cpu;
	private Almacenamiento disco;
	
	public Computadora() {}
	
	Computadora(String marca, String modelo, String color, double precio, Ram memoria, Procesador cpu,
			Almacenamiento disco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.memoria = memoria;
		this.cpu = cpu;
		this.disco = disco;
		
		
	}
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Ram getMemoria() {
		return memoria;
	}
	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}
	public Procesador getCpu() {
		return cpu;
	}
	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}
	public Almacenamiento getDisco() {
		return disco;
	}
	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}
	
	{
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", \n memoria=" + memoria + ",\n  cpu=" + cpu + ",\n   disco=" + disco + "]";
	}
}
	
