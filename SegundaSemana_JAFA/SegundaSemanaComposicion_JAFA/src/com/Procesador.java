package com;

public class Procesador {
	
	private String marca;
	private String tipo;
	private double frecuencia;
	private String generacion;
	
	public Procesador() {
		
	}

	public Procesador(String marca, String tipo, double frecuencia, String generacion) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
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

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", tipo=" + tipo + ", frecuencia=" + frecuencia + ", generacion="
				+ generacion + "]";
	}

	
	
}
