package com.condicionales;

import java.util.Scanner;

public class Condionales1_ALCJ {

	public static void main(String[] args) {
		
		/* 1.- Realiza un programa que reciba dos números por teclado
		 * e indique cuál es mayor o si son iguales.
		 */
		
		
		int numero1, numero2;
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("<<<<<Bienvenido>>>>>");
		System.out.println("Ingresa el primer numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		numero2 = teclado.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("El primer numero (" + numero1 + ") es mayor que el segundo numero (" + numero2 + ").");
			
		} else if ( numero1 < numero2) { 
			System.out.println("El primer numero (" + numero1 + ") es menor que el segundo numero (" + numero2 + ").");
		} else {
			System.out.println("Los dos numeros son iguales");
		}
}
}