package com.condicionales;

import java.util.Scanner;

public class Condicionales1_HEVM {

	public static void main(String[] args) {
		/*Realiza un programa que reciba dos números por teclado 
		 * e indique cuál es mayor o si son iguales.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int numero1 = input.nextInt();	
		
		System.out.println("Introduce un segundo número");
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
