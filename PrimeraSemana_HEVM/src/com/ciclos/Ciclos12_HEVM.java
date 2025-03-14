package com.ciclos;

import java.util.Scanner;

public class Ciclos12_HEVM {

	public static void main(String[] args) {
		/*
		 * .Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		 *cuando el promedio de las edades sea superior a 25.
		 */

		Scanner input = new Scanner (System.in);
		double promedio = 0;
		int contador = 1;
		double suma = 0;
		int numero;
		
		 do {
	            System.out.print("Introduzca su edad: ");
	            numero = input.nextInt();
	            promedio = (suma + numero)/contador;
	            suma = suma + numero;
	            contador++;
	            System.out.println("El promedio actual es " + promedio);
	            if (numero<=0) {
	            	System.out.println("Esa edad no es valida");
	            }
	}while (promedio < 25 && numero > 0);
		 System.out.println("el promedio de las " + contador + " edades fue " + promedio);
	}
}
