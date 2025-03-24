package com.condicionales;

import java.util.Scanner;

public class Condicionales8_HEVM {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
		*seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
		*obtenido.
		*Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		*Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
		*“ERROR: número incorrecto”.
		*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dime que numero has sacado al lanzar un dado de seis caras y te dire el numero que esta en la cara opuesta");
		int resultado = input.nextInt();
		
		if (resultado == 1) {
			System.out.println("El numero opuesto es el seis");
		}else if (resultado == 2) {
			System.out.println("El numero opuesto es el cinco");
		}else if (resultado == 3) {
			System.out.println("El numero opuesto es el cuatro");
		}else if (resultado == 4) {
			System.out.println("El numero opuesto es el tres");
		}else if (resultado == 5) {
			System.out.println("El numero opuesto es el dos");
		}else if (resultado == 6) {
			System.out.println("El numero opuesto es el uno");
		}else {
			System.out.println("Error, introduzca un numero entero entre 1 y 6");
		}
	}

}
