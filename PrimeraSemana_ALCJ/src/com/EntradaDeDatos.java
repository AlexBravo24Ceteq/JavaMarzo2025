package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
	
		//Vamos a aprender a commo introducir datos a traves de teclado 
		//utilizando la clase Scanner
		
		//Primero ejemplo quiero capturar la edad de un usuario
         int edad; 
//		//Declaramos a un obeto o variable de la clase Scanner para poder
//		//introducir datos desde teclado
			Scanner input = new Scanner (System.in);
			System.out.println("======PROGRAMA PARA CAPTURAR EDAD====");
			System.out.println("Introduce tu edad");
			
//		edad = input.nextInt(); //aqui capturamos por teclado el numero
//		//y lo guardamos en la variable edad
//		
//		//una vez que capturamos la edad y la guardamos, posteriormente la podemos ocupar
//		//para algo mas
//		System.out.println("El proximo a�o tendras " + (edad+1) + " a�os");
//		
//		//con el mismo Scanner puedo seguir capturando mas datos
//		System.out.println("Introduce tu nombre");
//		//.nextLine nos permite leer espacios, pero con el salto de linea anteior
//		//piensa que yo ya introduje algo, entonces hay que consumir ese espacio
//		//anes de guardar el nombre
//		input.nextLine();//aqui esta instruccion consumimos el espacio
//		String nombre = input.nextLine();
//		
//		System.out.println("Hola " + nombre);
//		
		
		//Operador modulo %
		//funciona en divisiones y me permite devolver el valor 
		//del residuo de una division
		
		//Ej. 
		
		int x = 10;
		
		int division = 10/2;
		
		int residuo = 10%3;
		
		System.out.println(division);
		System.out.println(residuo);

	}

}
