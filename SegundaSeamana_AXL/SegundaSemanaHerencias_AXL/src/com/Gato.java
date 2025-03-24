package com;

public class Gato extends Animal {
	private String sexo;
	private String tamaño;
	private double altura;
	
	public Gato() {}

	public Gato(String nombre, String raza, int edad, String sexo, String tamaño, double altura) {
		super(nombre, raza, edad);
		this.sexo = sexo;
		this.tamaño = tamaño;
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Gato [sexo=" + sexo + ", tamaño=" + tamaño + ", altura=" + altura + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
