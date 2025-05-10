package com;

public class Estudiantes {
	private String Alumno1;
	private String Alumno2;
	private String Alumno3;
	
public Estudiantes() {}

public Estudiantes(String alumno1, String alumno2, String alumno3) {
	super();
	Alumno1 = alumno1;
	Alumno2 = alumno2;
	Alumno3 = alumno3;
}

public String getAlumno1() {
	return Alumno1;
}

public void setAlumno1(String alumno1) {
	Alumno1 = alumno1;
}

public String getAlumno2() {
	return Alumno2;
}

public void setAlumno2(String alumno2) {
	Alumno2 = alumno2;
}

public String getAlumno3() {
	return Alumno3;
}

public void setAlumno3(String alumno3) {
	Alumno3 = alumno3;
}

@Override
public String toString() {
	return "Estudiantes [Alumno1=" + Alumno1 + ", Alumno2=" + Alumno2 + ", Alumno3=" + Alumno3 + "]";
}


}
