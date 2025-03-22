package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Estudiantes primerAño = new Estudiantes("America", "Jair", "Fatima");
		Profesores primerGrado = new Profesores("Cinthya", "Viridiana", "Melissa");
		Aulas primeros = new Aulas("A", "B", "C");
		
		Escuela niñosHeroes = new Escuela("Blanco", 1225.0, primerAño, primerGrado, primeros);
		
		System.out.println(niñosHeroes);
		

	}

}
