package com;

public class Computadora {

	
	private String marcar;
	private String modelo;
	private String color;
	private double precio;
	//Los siguientes atributos son los objetos que formaran parrte de la computadora
	private Ram memoria;
	private Procesador cpu;
	private Almacenamiento disco;
	
	//contructores
	
	public Computadora() {
		
	}

	public Computadora(String marcar, String modelo, String color, double precio, Ram memoria, Procesador cpu,
			Almacenamiento disco) {
		super();
		this.marcar = marcar;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.memoria = memoria;
		this.cpu = cpu;
		this.disco = disco;
	}

	public String getMarcar() {
		return marcar;
	}

	public void setMarcar(String marcar) {
		this.marcar = marcar;
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

	public Ram getMemoria() {
		return memoria;
	}

	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return "Computadora [marcar=" + marcar + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", \n memoria=" + memoria + ", \n cpu=" + cpu + ", \n disco=" + disco + "]";
	}
	
	
	
}
