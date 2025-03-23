package com;

public abstract class Calculadora {

	private String marca;
	private String color;
	private String tama�o;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String tama�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
	}

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

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	
	//Creando metodos abstractos
	public abstract  double sumar(double a, double b, double c);
	public abstract double restar(double a, double b, double c);
	public abstract double multiplicar(double a, double b, double c);
	public abstract double dividir(double a, double b, double c);
	
	
	
}
