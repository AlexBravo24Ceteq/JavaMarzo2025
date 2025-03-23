 package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Instanciar la calculadora Cientifica
		Cientifica calculadora = new Cientifica("Casio","Negro","Grande");
		
		//Solicitar valores por teclado.
		System.out.println("Ingresa el primer número: ");
		double a = input.nextDouble();
		
		System.out.println("Ingresa el segundo número: ");
		double b = input.nextDouble();
		
		System.out.println("Ingresa el tercer número: ");
		double c = input.nextDouble();
		
		//Probando los metodos
		System.out.println(calculadora);
		System.out.println("La suma de " + a + ", " + b + " y " + c + " es igual a " + calculadora.sumar(a, b, c));
		System.out.println("La resta de " + a + ", " + b + " y " + c +" es igual a " + calculadora.restar(a, b, c));
		System.out.println("La multiplicación  de " + a + ", " + b + " y " + c + " es igual a " + calculadora.multiplicar(a, b, c));
		System.out.println("La división de " + a + ", " + b + " y " + c +" es igual a " + calculadora.dividir(a, b, c));
	
		input.close();
	}

}
