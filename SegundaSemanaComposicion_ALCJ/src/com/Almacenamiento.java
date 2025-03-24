package com;

public class Almacenamiento {
	private String marca;
	private String tipo;
	private double tamano;

	public Almacenamiento() {
	}

	public Almacenamiento(String marca, String tipo, double tamano) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamano = tamano;
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

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamano=" + tamano + "]";
	}

}
