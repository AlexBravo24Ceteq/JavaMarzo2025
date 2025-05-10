package com;

public class Coche extends Vehiculo{
	private int numPuertas;
	private String color;
	private String transmision; 
	
	public Coche() {}

	public Coche(String marca, String modelo, int numPuertas, String color, String transmision) {
		super(marca, modelo);
		this.numPuertas = numPuertas;
		this.color = color;
		this.transmision = transmision;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", color=" + color + ", transmision=" + transmision + ", toString()="
				+ super.toString() + "]";
	}
	

}
