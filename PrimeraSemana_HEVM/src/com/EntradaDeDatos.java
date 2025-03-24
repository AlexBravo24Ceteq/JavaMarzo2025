package com;

import java.util.Scanner; //importamos la clase Scanner desde java.util.Scanner

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		/*Vamos a aprender a como introducir datos a traves del teclado utilizando la clase Scanner
		 * 
		 * Primero, ejemplo, quiero capturar la edad de un usauario 
		 * 
		 * Declaramos a un objeto o variable de la clase Scanner para poder introducir datos desde teclado
		 */
		int edad;
		Scanner input = new Scanner (System.in);
		
		System.out.println("--Programa para capturar la edad--");
		System.out.println("Introduce tu edad");
		
		edad = input.nextInt(); // aqui capturamos por teclado el numero y lo guardamos en la variable edad
		
		//Una vez que capturamos la edad y la guardamos, posteriormente la podemos ocupar
		System.out.println("El proximo año tendras " + (edad + 1) + " años");
		
		//Con el mismo Scanner puedo seguir capturando mas tados
		System.out.println("Introduce tu nombre");
		String nombre = input.next(); //Captura la primera palabra o secuencia de caracteres
		System.out.println(("Hola " + nombre));
		
		/*.nextLine nos permite leer espacios, pero con el salto de linea anterior piensa que
		 * yo ya introduje algo, entonces hay que consumir ese espacio antes de guardar el nombre
		 * por lo que usamos input.nextLine(); vacio
		 */
		System.out.println("Introduce tu nombre");
		input.nextLine();
		String nombre1 = input.nextLine();
		System.out.println(("Hola " + nombre1));
		
		//Para comentar varias lineas puedes seleccionarlas y presionar ctrl + 7
		
		/* Operador modulo %
		 * Este operador me funciona en divisiones y me permite devolver el valor del residuo de una division
		 */
		
		int x =10;
		int division = 10/2;
		int residuo = 10%2;
		int residuo1 = 10%3;
		
		System.out.println(division);
		System.out.println(residuo);
		System.out.println(residuo1);
		
	}

}
