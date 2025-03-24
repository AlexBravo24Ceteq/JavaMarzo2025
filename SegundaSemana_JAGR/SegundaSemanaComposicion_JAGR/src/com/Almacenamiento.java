package com;

public class Almacenamiento {

	
	private String marca;
	private String modelo;
	private String tama�o;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, String modelo, String tama�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", tama�o=" + tama�o + "]";
	}
	
	
}
