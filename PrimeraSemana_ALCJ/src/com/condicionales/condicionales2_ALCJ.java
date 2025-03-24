package com.condicionales;

import java.util.Scanner;

public class condicionales2_ALCJ {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("<<<<<<<<<<Bienvenido a mi ejercicio>>>>>>>>");
		System.out.println("Ingresa un numero");
		
		int numero = teclado.nextInt();
		
		if (numero %2 == 0 ) {
			System.out.println("El numero " + numero + " es par.");
		} else { 
			System.out.println("El numero " + numero + " es impar.");
		}
		
	}

}
