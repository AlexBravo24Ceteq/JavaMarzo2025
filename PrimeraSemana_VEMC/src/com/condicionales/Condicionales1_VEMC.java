package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VEMC {

	public static void main(String[] args) {
//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		int numero1;
		int numero2;
		Scanner input = new Scanner(System.in);
		System.out.println("===COMPARACI�N DE N�MEROS===");
		System.out.println("Introduce el primer n�mero: ");//Primer valor a introducir
		numero1 = input.nextInt();
		System.out.println("Introduce el segundo n�mero: ");//Segundo valor a introducir
		numero2 = input.nextInt();
		//Condicion de comparacion de numeros.
		if (numero1 > numero2) {
			System.out.println("El primer n�mero (" + numero1 + ") es mayor que el segundo n�mero ("  + numero2 + ")");
		}else if (numero2 > numero1){
			System.out.println("El segundo n�mero (" + numero2 + ") es mayor que el primer n�mero (" + numero1 + ")");
		}else{
			System.out.println("Ambos n�meros son iguales.");
		}
		input.close();	
	}

}
