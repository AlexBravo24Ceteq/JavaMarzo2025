package com;

public class Motor {
	
	private String tipo;
	private double cilindros;
	private double valvulas;
	private double velocidad;
	private double potencia;
	
	public Motor() {}

	public Motor(String tipo, double cilindros, double valvulas, double velocidad, double potencia) {
		super();
		this.tipo = tipo;
		this.cilindros = cilindros;
		this.valvulas = valvulas;
		this.velocidad = velocidad;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCilindros() {
		return cilindros;
	}

	public void setCilindros(double cilindros) {
		this.cilindros = cilindros;
	}

	public double getValvulas() {
		return valvulas;
	}

	public void setValvulas(double valvulas) {
		this.valvulas = valvulas;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", cilindros=" + cilindros + ", valvulas=" + valvulas + ", velocidad="
				+ velocidad + ", potencia=" + potencia + "]";
	}

		
	
	
	

}
