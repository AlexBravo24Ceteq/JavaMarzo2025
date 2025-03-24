package com.condicionales;

import java.util.Scanner;

public class Condicionales5_HEVM {
	public static void main(String[] args) {
		/*. Realiza un programa que calcule la aceptación de una 
		 * solicitud en base a los siguientes
		 * parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA.
		 */
		
		 Scanner input = new Scanner (System.in);
		 
		 System.out.println("Complete los siguientes datos para su solicitud:");
		 System.out.println("Introduce tu nombre");
		 String nombre = input.next();
		 
		 System.out.println("Introduce tu nota del colegio");
		 double nota = input.nextDouble();
		 
		 System.out.println("Introduce tu edad en numeros enteros");
		 int edad = input.nextInt();
		 
		 System.out.println("Introduce tu sexo");
		 System.out.println("usa M para masculino y F para femenio");
		 String sexo = input.next();
		 
		 if (nota>=5 && edad >=18 && sexo.equals("F")) {
			 System.out.println("Felicidades " + nombre + " su solicitud fue aceptada");
		 }else if (nota>=5 && edad >=18 && sexo.equals("M")) {
			 System.out.println("Se le informa " + nombre + " que su solicitud se encuentra en estado de POSIBLE");
		 }else {
			 System.out.println("Lamentablemente su solicitud no puede ser aceptada, no cumple con los requisistos requeridos");
		 }
		 
	}
}