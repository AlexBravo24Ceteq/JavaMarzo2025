package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Estudiantes primerA�o = new Estudiantes("America", "Jair", "Fatima");
		Profesores primerGrado = new Profesores("Cinthya", "Viridiana", "Melissa");
		Aulas primeros = new Aulas("A", "B", "C");
		
		Escuela ni�osHeroes = new Escuela("Blanco", 1225.0, primerA�o, primerGrado, primeros);
		
		System.out.println(ni�osHeroes);
		

	}

}
