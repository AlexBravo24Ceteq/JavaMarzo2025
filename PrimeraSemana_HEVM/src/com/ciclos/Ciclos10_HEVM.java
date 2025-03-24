package com.ciclos;

import java.util.Scanner;

public class Ciclos10_HEVM {

	public static void main(String[] args) {
		//Programa que lea 20 números e indique si son positivos o negativos y pares o
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		 
		Scanner input = new Scanner (System.in);
		int numero;
		int contador = 1;
		int valor1 = 0;
		int valor2 = 0;
		
	       do {
	            System.out.print("Introduce un número: ");
	            numero = input.nextInt();

	            if (numero != 0) {
	                if (numero > 0) {
	                    System.out.print("Positivo");
	                    valor1 = valor1 + numero;
	                } else {
	                    System.out.print("Negativo");
	                }
	                if (numero % 2 == 0) {
	                    System.out.println(" Par");
	                } else {
	                    System.out.println(" Impar");
	                    valor2 = valor2 + numero;
	                }
	            }
	            contador ++;
	       } while (contador <= 20);
	       System.out.println("La suma de los numeros positivos es : " + valor1);
	       System.out.println("La suma de los numeros impares es : " + valor2);
	       
	}
}
