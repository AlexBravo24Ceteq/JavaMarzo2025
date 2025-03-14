package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Como introducir datos a traves del teclado utilizando la clase "Scanner"
		//Ej. Quiero capturar la edad de un usuario.
		int edad;
		//Declaramos a un objeto o variable de la clase "Scanner" para poder introducir datos desde el teclado
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("==Programa para capturar tu edad==");
		System.out.println("Introduce tu edad: ");
		edad = input.nextInt();//aqui capturamos por teclado un numero y lo guardamos en la viariable edad
		
		//Una vez capturada la edad y la guardamos, posteriormente la podemos ocupar para algo mas.
		System.out.println("El proximo año tendras " + (edad+1) + " años");
	
		//Con el mismo Scanner podemos seguir capturando mas datos.
		System.out.println("Introduce tu nombre: ");//nextLine nos permite leer espacios
		//pero con el salto de linea anterior piensa que yo ya introduje algo, entonces hay que consumir ese espacio antes de guardar el nombre.
		input.nextLine();// aqui en esta linea consumismos el espacio
		String nombre = input.nextLine();//aqui ya se puede capturar el nombre.
		
		System.out.println("Hola " + nombre);
		
		//Operador modulo "%" funciona en divisiones y me permite devolver el valor del residuo de la division.
		//Ej. 
		int x = 10;
		int division = 10/2;
		int residuo = 10%3; 
		System.out.println(division);
		System.out.println(residuo);
		
		

	}

}
