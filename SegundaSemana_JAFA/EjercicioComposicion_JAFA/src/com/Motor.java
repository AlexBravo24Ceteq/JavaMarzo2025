package com;

public class Motor {
	
	private String tipo; //Ej Gasolina, disel, electrico
	private int caballosDeFuerza;
	
	public Motor() {
		
	}

	public Motor(String tipo, int caballosDeFuerza) {
		super();
		this.tipo = tipo;
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", caballosDeFuerza=" + caballosDeFuerza + "]";
	}
	
	

}
