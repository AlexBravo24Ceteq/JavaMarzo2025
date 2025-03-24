package com;

public class Llantas {
	
	private String banda;
	private String composicion;
	private String funcion;
	private double radio_delantera;
	private double radio_tracera;
	public Llantas(String banda, String composicion, String funcion, double radio_delantera, double radio_tracera) {
		super();
		this.banda = banda;
		this.composicion = composicion;
		this.funcion = funcion;
		this.radio_delantera = radio_delantera;
		this.radio_tracera = radio_tracera;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getComposicion() {
		return composicion;
	}
	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public double getRadio_delantera() {
		return radio_delantera;
	}
	public void setRadio_delantera(double radio_delantera) {
		this.radio_delantera = radio_delantera;
	}
	public double getRadio_tracera() {
		return radio_tracera;
	}
	public void setRadio_tracera(double radio_tracera) {
		this.radio_tracera = radio_tracera;
	}
	@Override
	public String toString() {
		return "Llantas [banda=" + banda + ", composicion=" + composicion + ", funcion=" + funcion
				+ ", radio_delantera=" + radio_delantera + ", radio_tracera=" + radio_tracera + "]";
	}
	
	
	
	
	

}
