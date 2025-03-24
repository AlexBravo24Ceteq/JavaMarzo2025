package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JAFA {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner input = new Scanner(System.in);
		
		int a; 
		
		System.out.println("Ingresa un numero: ");
		a= input.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("El numero "+ a + " es par.");
		}
		else {
			System.out.println("El numero "+ a + " es impar.");
		}
		
				

	}

}
