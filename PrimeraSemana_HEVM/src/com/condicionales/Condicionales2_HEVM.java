package com.condicionales;

import java.util.Scanner;

public class Condicionales2_HEVM {

	public static void main(String[] args) {
		/*Realiza un programa que pida un n�mero por
		 *teclado y nos indique si es par o impar.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero entero y te dire si es par o impar");
		int numero = input.nextInt();	
		
		if (numero%2 == 0) {
			System.out.println("Tu n�mero es un n�mero par");
		}else{
			System.out.println("Tu n�mero es un n�mero impar");
		}
		

	}

}
