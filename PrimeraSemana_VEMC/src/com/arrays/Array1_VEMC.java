package com.arrays;

import java.util.Scanner;

public class Array1_VEMC {

	public static void main(String[] args) {
//Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el índice y el valor al que corresponde.
		Scanner input = new Scanner(System.in);//creamos una variable para ingresar datos en consola.
		int [] numeros = new int [10];//creamos un array de 10 elementos.
		
		//Solicitamos los valores para cada posicion del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el valor para la posicion " + i + ": ");
			numeros[i] = input.nextInt();
		}
		
		//Mostrar el indice y cada posicion del array.
		System.out.println("\nValores del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice " + i +": " + numeros[i]);
		input.close();	
		}
		
		

	}

}
