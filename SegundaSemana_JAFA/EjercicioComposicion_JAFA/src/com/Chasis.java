package com;

public class Chasis {
	
	private String material;// Acero, Aluminio
	private double peso;// peso en kg
	
	public Chasis() {
		
	}

	public Chasis(String material, double peso) {
		super();
		this.material = material;
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Chasis [material=" + material + ", peso=" + peso + "]";
	}
	
	

}
