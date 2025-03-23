package com;


//La HERENCIA - Pilar de POO
//Se realiza con la palabra reservada "extends"
public class Empleado extends Persona{

//Con la herencia recibimos atributos y metodos de la clase Padre.
//Aqui solo declaramos lo propio de Empleado.	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {
		
	}
//Este constructor se genera seleccionando el constructor con todos los parametros de la clase Padre.
	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	//Los metodos abstractos deben definirlos las clases hijas.
	@Override
	public int sumar(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
}
