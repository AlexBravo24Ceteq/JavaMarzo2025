package com.condicionales;

import java.util.Scanner;

public class Condicionales1_HEVM {

	public static void main(String[] args) {
		/*Realiza un programa que reciba dos n�meros por teclado 
		 * e indique cu�l es mayor o si son iguales.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero");
		int numero1 = input.nextInt();	
		
		System.out.println("Introduce un segundo n�mero");
		int numero2 = input.nextInt();
		
		if (numero1 < numero2) {
			System.out.println(numero1 + " es menor a " + numero2 );
		}else if (numero1 > numero2){
			System.out.println(numero1 + " es mayor a " + numero2);
		}else {
			System.out.println("Los numeros son iguales");
		}
	}

}
