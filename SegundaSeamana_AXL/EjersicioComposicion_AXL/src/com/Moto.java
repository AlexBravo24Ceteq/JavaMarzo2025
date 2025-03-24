package com;

public class Moto {
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	private double altura;
	private Motor funsion;
	private Llantas carga ;
	private Tanque capacidad;
	
	
	public Moto() {
		
	}


	public Moto(String marca, String modelo, String color, double precio, double altura, Motor funsion, Llantas carga,
			Tanque capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.altura = altura;
		this.funsion = funsion;
		this.carga = carga;
		this.capacidad = capacidad;
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public Motor getFunsion() {
		return funsion;
	}


	public void setFunsion(Motor funsion) {
		this.funsion = funsion;
	}


	public Llantas getCarga() {
		return carga;
	}


	public void setCarga(Llantas carga) {
		this.carga = carga;
	}


	public Tanque getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Tanque capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", altura="
				+ altura + ", \nfunsion=" + funsion + ", \ncarga=" + carga + ", \ncapacidad=" + capacidad + "]";
	}
	
	
	

}
