package com;

public class Ruedas {
	
	private String marca;
	private int diametro;
	
	public Ruedas() {
		
	}

	public Ruedas(String marca, int diametro) {
		super();
		this.marca = marca;
		this.diametro = diametro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public String toString() {
		return "Ruedas [marca=" + marca + ", diametro=" + diametro + "]";
	}

	
	
}
