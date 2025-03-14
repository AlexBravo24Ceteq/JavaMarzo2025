package com.condicionales;

import java.util.Scanner;

public class Condicionales5_VEMC {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//Otros casos -> NO ACEPTADA
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce tu edad: ");
	int edad = input.nextInt();
	System.out.println("Introduce tu nota: ");
	double nota = input.nextDouble();
	System.out.println("Introduce tu sexo (M para masculino, F para femenino): ");
	char sexo = input.next().charAt(0);
	//Evaluar la aceptacion de solicitud con condicion
	if (nota >= 5 && edad >= 18) {//si es mayor o igual a 5 y que sea mayor o igual a 18
		if (sexo == 'F') {
		System.out.println("ACEPTADA");
		} else if (sexo == 'M') {
		System.out.println("POSIBLE");	
		} else {
		System.out.println("NO ACEPTADA");// en caso de que el sexo no sea M o F
		}
	} else {
		System.out.println("NO ACEPTADA");
		}
	input.close();
	
	}
}

