package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Estudiantes primerAno = new Estudiantes("America", "Jair", "Fatima");
		Profesores primerGrado = new Profesores("Cinthya", "Viridiana", "Melissa");
		Aulas primeros = new Aulas("A", "B", "C");
		
		Escuela ninosHeroes = new Escuela("Blanco", 1225.0, primerAno, primerGrado, primeros);
		
		System.out.println(ninosHeroes);
		

	}

}
