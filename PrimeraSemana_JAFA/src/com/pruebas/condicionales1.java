package com.pruebas;

import java.util.Scanner;

public class condicionales1 {

	public static void main(String[] args) {
		// Determinar si un numero es positivo, negativo o cero
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un numero entero");
		int numero= input.nextInt();
		
		if(numero > 0) {
			System.out.println("El numero es positivo.");
		}
		else if (numero < 0) {
			System.out.println("El numero es negativo");
		}
		else {
			System.out.println("El numero es cero");
		}

	}

}
