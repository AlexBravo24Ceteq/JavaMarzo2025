package com;

public abstract class Calculadora { //convetimos la clase en abstracta
//Declaramos Atributos
	private String marca;
	private String color;
	private String tama�o;
	
	public Calculadora() { //Creamos los metodos Constructores
		
	}

	public Calculadora(String marca, String color, String tama�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
	}

	//metodos GETTERS and SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

		//toString
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	
	
	//Creamos 4 metodos Abstractos
	public abstract void sumar (int a,int b);
	//public abstract void sumer (); //polimorfismo
	public abstract void restar (int a, int b);
	public abstract void multiplicar (int a, int b);
	public abstract void dividir (int a, int b);
}
