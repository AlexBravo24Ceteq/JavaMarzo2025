package com;

//HERENCIA- pilar de la POO
	//Se realiza con la palabra extends

public class Empleado extends Persona{
	
	/*Con la herencia ya estamos recibiendo atributos y metodos de la clase padre y aqui
	 * declaramos lo propio del empleado
	 */
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}
//Este constructor para generarlo debemos seleccionar el constructor
	//con todos los parametros
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
	
	
	
	
	

}
