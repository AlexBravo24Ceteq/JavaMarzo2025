package com;


// La HERENCIA- pilar de POO
//Se realiza con la palabra reservada extends
public class Empleado extends Persona {
	
	//Con la herencia ya estamos recibiendo atributos
	//y metodos de la clase padre y aqui solo declaramos
	//lo propio de empleados
	
	private String rfc;
	private double salario;
	private String turno;
	
	//constructor vacio normal
	public Empleado() {
		
	}
	
	//modificar el metodo  consructor a la hora de eligir a super clase
	//Este constructor para seleccionarlo debemos seleccionar el constructor 
	//con todos los parametros de nuestra clase padre
	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}
	
	//Getters y setters normales
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

	//modificar Se seleciona el toString
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	//Los metodos abstractos deben definirlos las clases hijas
	@Override
	public int sumar(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}

	
	
	
	
	
	

}
