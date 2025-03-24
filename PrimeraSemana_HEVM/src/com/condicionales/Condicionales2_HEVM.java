package com.condicionales;

import java.util.Scanner;

public class Condicionales2_HEVM {

	public static void main(String[] args) {
		/*Realiza un programa que pida un número por
		 *teclado y nos indique si es par o impar.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un número entero y te dire si es par o impar");
		int numero = input.nextInt();	
		
		if (numero%2 == 0) {
			System.out.println("Tu número es un número par");
		}else{
			System.out.println("Tu número es un número impar");
		}
		

	}

}
