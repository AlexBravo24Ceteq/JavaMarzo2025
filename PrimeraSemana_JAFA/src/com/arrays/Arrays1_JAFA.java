package com.arrays;

import java.util.Scanner;

public class Arrays1_JAFA {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		int [] numeros = new int [10];
		
		Scanner input = new Scanner(System.in);
		
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el valor de la posición:");
			numeros[i]=input.nextInt();
		}
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println("Indice: "+i+ " Valor: "+numeros[i]);
		}

	}

}
