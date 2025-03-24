package com.condicionales;

import java.util.Scanner;

public class Condicionales3_HEVM {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		*segundo número es 0, debe mostrar un mensaje de error.
		*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un número que sera el divisor");
		double numero1 = input.nextInt();	
		
		System.out.println("Introduce un número que sera el dividendo");
		double numero2 = input.nextInt();
		
		if (numero2 != 0) {
			double division = numero1/numero2;
			System.out.println("La division de " + numero1 + " entre " + numero2 + " es igual a " + division );
		}else {
			System.out.println("Las divisiones entre 0 estan indeterminadas");
		}
	}

}
