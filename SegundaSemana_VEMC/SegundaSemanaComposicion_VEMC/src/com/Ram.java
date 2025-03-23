package com;

public class Ram {
//Esta clase sirve para crear memorias Ram que formaran parte de la computadora.

	private String marca;
	private String tipo;
	private double capacidad;
	private double frecuencia;
	
	public Ram() {
		
	}

	public Ram(String marca, String tipo, double capacidad, double frecuencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
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

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia
				+ "]";
	}
	
}
