package com;

public class Gato extends Animal {
	private String sexo;
	private String tama�o;
	private double altura;
	
	public Gato() {}

	public Gato(String nombre, String raza, int edad, String sexo, String tama�o, double altura) {
		super(nombre, raza, edad);
		this.sexo = sexo;
		this.tama�o = tama�o;
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Gato [sexo=" + sexo + ", tama�o=" + tama�o + ", altura=" + altura + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
