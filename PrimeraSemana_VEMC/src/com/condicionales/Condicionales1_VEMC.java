package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VEMC {

	public static void main(String[] args) {
//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1;
		int numero2;
		Scanner input = new Scanner(System.in);
		System.out.println("===COMPARACIÓN DE NÚMEROS===");
		System.out.println("Introduce el primer número: ");//Primer valor a introducir
		numero1 = input.nextInt();
		System.out.println("Introduce el segundo número: ");//Segundo valor a introducir
		numero2 = input.nextInt();
		//Condicion de comparacion de numeros.
		if (numero1 > numero2) {
			System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número ("  + numero2 + ")");
		}else if (numero2 > numero1){
			System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ")");
		}else{
			System.out.println("Ambos números son iguales.");
		}
		input.close();	
	}

}
