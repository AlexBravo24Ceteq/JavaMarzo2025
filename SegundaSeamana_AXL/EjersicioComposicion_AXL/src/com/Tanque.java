package com;

public class Tanque {
	
	private String tipo_gasolina;
	private double capacidad;
	private String rendimiento_combustible;
	
	public Tanque() {}

	public Tanque(String tipo_gasolina, double capacidad, String rendimiento_combustible) {
		super();
		this.tipo_gasolina = tipo_gasolina;
		this.capacidad = capacidad;
		this.rendimiento_combustible = rendimiento_combustible;
	}

	public String getTipo_gasolina() {
		return tipo_gasolina;
	}

	public void setTipo_gasolina(String tipo_gasolina) {
		this.tipo_gasolina = tipo_gasolina;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getRendimiento_combustible() {
		return rendimiento_combustible;
	}

	public void setRendimiento_combustible(String rendimiento_combustible) {
		this.rendimiento_combustible = rendimiento_combustible;
	}

	@Override
	public String toString() {
		return "Tanque [tipo_gasolina=" + tipo_gasolina + ", capacidad=" + capacidad + ", rendimiento_combustible="
				+ rendimiento_combustible + "]";
	}

	

}
