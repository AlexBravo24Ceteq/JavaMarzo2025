package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Como introducir ddatos a traves de teclado
		//utilizando la clase Scanner
		
		//Ej. capturar la edad de una persona
//		int edad;
//		//Declaramos a un objeto o variable de la clase Scanner
//		//para poder introducir datos desde el telcado
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("======PROGRAMA PARA CAPTURAR EDAD====");
//		System.out.println("Introduce tu edad");
//		
//		edad = input.nextInt(); //aqui capturamos por tecladoel numero
//		//y lo guardamos en la variable edad
//		
//		//Una vez que capturamos la edad y la guardamos, posteriormente
//		//la podemos ocupar para algo mas
//		System.out.println("El proximo año tendras " + (edad+1) + " años ");
////		
//		//Con el mismo Scanner puedo seguir capturando mas datos
//		System.out.println("Introduce tu nombre");
//		input.nextLine(); //Aqui en esta instruccion consumimos el espacio
//		String nombre = input.nextLine(); //y luego aqui ya se puede capturar el nombre
//		
//		System.out.println("Hola " + nombre);
		
		//.nextLine - Nos permite leer espacios, pero con el salto de linea anterior
		//antes de guardar el nombre
		
		
		//Operador modulo %
		//Este operador me sirve para divisiones y me permite devolver el valor
		//del residuo de una division
		
		//Ej.
		int x = 10;
		int division = 10/2;
		
		int residuo = 10%3;
		
		System.out.println(division);
		
		System.out.println(residuo);
		
		
		

	}

}
