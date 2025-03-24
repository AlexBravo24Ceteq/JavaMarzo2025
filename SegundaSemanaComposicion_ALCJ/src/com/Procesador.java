package com;

public class Procesador {
	private String marca;
	private String tipo;
	private String generacion;
	private double frecuencia;
	

	public Procesador() {}


	public Procesador(String marca, String tipo, String generacion, double frecuencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.generacion = generacion;
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
		return "Procesador [marca=" + marca + ", tipo=" + tipo + ", generacion=" + generacion + ", frecuencia="
				+ frecuencia + "]";
	}
	
}
