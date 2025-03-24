package com;

public class Automovil {

	private String marca;
	private String modelo;
	private String color;
	private double precio;
	//
	private Motor motor;
	private Ruedas llantas;
	private Chasis chasis;
	
	public Automovil() {
		
	}

	public Automovil(String marca, String modelo, String color, double precio, Motor motor, Ruedas llantas,
			Chasis chasis) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.llantas = llantas;
		this.chasis = chasis;
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Ruedas getLlantas() {
		return llantas;
	}

	public void setLlantas(Ruedas llantas) {
		this.llantas = llantas;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", \n motor=" + motor + ", \n llantas=" + llantas + ", \n chasis=" + chasis + "]";
	}
	
	
	
}
