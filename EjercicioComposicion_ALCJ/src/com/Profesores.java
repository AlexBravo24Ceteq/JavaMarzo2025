package com;

public class Profesores {
	private String Profesor1;
	private String Profesor2;
	private String Profesor3;
	
	public Profesores () {}

	public Profesores(String profesor1, String profesor2, String profesor3) {
		super();
		Profesor1 = profesor1;
		Profesor2 = profesor2;
		Profesor3 = profesor3;
	}

	public String getProfesor1() {
		return Profesor1;
	}

	public void setProfesor1(String profesor1) {
		Profesor1 = profesor1;
	}

	public String getProfesor2() {
		return Profesor2;
	}

	public void setProfesor2(String profesor2) {
		Profesor2 = profesor2;
	}

	public String getProfesor3() {
		return Profesor3;
	}

	public void setProfesor3(String profesor3) {
		Profesor3 = profesor3;
	}

	@Override
	public String toString() {
		return "Profesores [Profesor1=" + Profesor1 + ", Profesor2=" + Profesor2 + ", Profesor3=" + Profesor3 + "]";
	}
	

}
