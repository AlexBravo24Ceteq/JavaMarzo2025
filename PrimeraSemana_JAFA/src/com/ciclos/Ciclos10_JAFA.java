package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JAFA {

	public static void main(String[] args) {
//		// Programa que lea 20 números e indique si son positivos o negativos y pares o 
//		impares y además muestre la sumatoria de los positivos y sumatoria de los impares.

			Scanner input = new Scanner(System.in);
			
			int sumaPares=0;
			int sumaImp=0;
			
			//leer los 20 numeros 
			for (int i = 1; i <= 20; i++) {
				System.out.println("Introduce el numero "+i+" :");
				int numero = input.nextInt();
				
				//verificar si es positivo o negativo
				if (numero > 0) {
					System.out.println(numero+ " Es positivo");
					sumaPares += numero;
				}
				else if (numero <0) {
					System.out.println(numero+ " Es negativo");
				}
				else {
					System.out.println(numero+ " Es cero");
				}
			// verificar si es par o impar
				
				if(numero % 2==0) {
					System.out.println(numero+ " Es par");
				}
				else {
					System.out.println(numero + " Es impar");
					sumaImp += numero;
				}
				
			}
				System.out.println("\nLa suma de los números positivos es: " + sumaPares);
				System.out.println("La suma de los números impares es: " + sumaImp);
	}

}
