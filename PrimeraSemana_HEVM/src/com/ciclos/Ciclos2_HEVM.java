package com.ciclos;

import java.util.Scanner;

public class Ciclos2_HEVM {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???

		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingrese el número de la tabla de multiplicar que desea");
		int numero = input.nextInt();
		
		System.out.println("Ingrese hasta que número quiere la tabla de multiplicar");
		int tabla = input.nextInt();
		
		for (int i = 1; i <= tabla; i++) {
			int	resultado = i*numero;
			System.out.println(i + " x " + numero + " = " + resultado);
			}
	}
}
