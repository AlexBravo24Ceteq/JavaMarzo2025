package com;

public class Procesador {

	private String marca;
	private String modelo;
	private String generacion;
	private double frecuencia; 
	
	public Procesador() {}

	public Procesador(String marca, String modelo, String generacion, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.generacion = generacion;
		this.frecuencia = frecuencia;
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

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", generacion=" + generacion + ", frecuencia="
				+ frecuencia + "]";
	}
	
	
}
