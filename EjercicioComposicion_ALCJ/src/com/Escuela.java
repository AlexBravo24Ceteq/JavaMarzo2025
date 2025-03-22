package com;

public class Escuela {
	private String color;
	private double area;
	private Estudiantes alumnos;
	private Profesores maestros;
	private Aulas salones;
	
	public Escuela () {}

	public Escuela(String color, double area, Estudiantes alumnos, Profesores maestros, Aulas salones) {
		super();
		this.color = color;
		this.area = area;
		this.alumnos = alumnos;
		this.maestros = maestros;
		this.salones = salones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Estudiantes getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Estudiantes alumnos) {
		this.alumnos = alumnos;
	}

	public Profesores getMaestros() {
		return maestros;
	}

	public void setMaestros(Profesores maestros) {
		this.maestros = maestros;
	}

	public Aulas getSalones() {
		return salones;
	}

	public void setSalones(Aulas salones) {
		this.salones = salones;
	}

	@Override
	public String toString() {
		return "Escuela [color = " + color + "\n" + " area = " + area + "\n" + " alumnos = " + alumnos + "\n" +  " maestros =" + maestros
				+ "\n" +  " salones = " + salones + "]";
	}
	
	
}
