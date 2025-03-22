package com;

public class Ram {

	// Esta clase nos va a servir para crear memorias ram que formaran parte
	// de la computadora

	private String marca;
	private String tipo;
	private double tamano;
	private double frecuencia;

	public Ram() {
	}

	public Ram(String marca, String tipo, double tamano, double frecuencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamano = tamano;
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

	public double gettamano() {
		return tamano;
	}

	public void settamano(double tamano) {
		this.tamano = tamano;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", tipo=" + tipo + ", tamano=" + tamano + ", frecuencia=" + frecuencia + "]";
	}

}
