package com;

public class Almacenamiento {

	
	private String marca;
	private String modelo;
	private String tamaño;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, String modelo, String tamaño) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + "]";
	}
	
	
}
