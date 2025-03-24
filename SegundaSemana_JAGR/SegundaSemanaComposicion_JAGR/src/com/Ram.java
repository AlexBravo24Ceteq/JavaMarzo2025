package com;

public class Ram {

	//esta clase nos va a servir para crear memorias ram que formaran parte
	//de la computadora
	
	private String marca;
	private String tipo;
	private double tamaño;
	private double frecuencia;
	
	
	public Ram() {}


	public Ram(String marca, String tipo, double tamaño, double frecuencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.frecuencia = frecuencia;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	public double getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", tipo=" + tipo + ", tamaño=" + tamaño + ", frecuencia=" + frecuencia + "]";
	}
	
	
}
