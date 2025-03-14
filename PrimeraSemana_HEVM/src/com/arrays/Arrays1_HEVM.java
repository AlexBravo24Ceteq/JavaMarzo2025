package com.arrays;

import java.util.Scanner;

public class Arrays1_HEVM {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner input = new Scanner (System.in);
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < 10; i++) {
			
		System.out.println("ingrese un valor");
		int valor =input.nextInt();
		numeros[i] = valor;
		}
		System.out.println("El Array quedo con los siguientes valores y en las siguientes posiciones: ");
		for (int i:numeros) {
			System.out.print(i + " ");
			}
		}
}
