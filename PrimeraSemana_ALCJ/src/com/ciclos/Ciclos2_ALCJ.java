package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ALCJ {

	public static void main(String[] args) {
		// 2- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("<<<<<<<<<<HOLIS>>>>>>>>>>");
		
		System.out.println("Escribe el numero a multiplicar");
		int numero = teclado.nextInt();
		
		System.out.println("Escribe el numero que van a multiplicar (max. 95): ");
		int multiplicador = teclado.nextInt();
		
		if (multiplicador <= 0) {
			System.out.println("El multiplicador debe de ser un numero positivo");
		
		} else {
			int resultado = 0;
			for (int x = 1; x <= multiplicador; x++) {
				resultado = numero * x; 
			}
			
			System.out.println(numero + " x " + multiplicador + " = " + resultado );
		}


	}

}
