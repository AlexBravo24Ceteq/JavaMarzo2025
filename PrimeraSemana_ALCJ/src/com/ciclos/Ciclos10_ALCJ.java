package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ALCJ {

	public static void main(String[] args) {
		// 10.- Programa que lea 20 números e indique si son positivos o negativos y pares o
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		System.out.println("WELCOME :)  ");
		Scanner teclado = new Scanner(System.in);

        int numeroPositivo = 0;
        int numeroImpar = 0;

        for (int x = 1; x <= 20; x++) {
            System.out.print("Escribe el numero " + x + ": ");
            int numero = teclado.nextInt();
            
            if (numero >= 0) {
                System.out.println("El número " + numero + " es positivo.");
                numeroPositivo += numero;
            } else {
                System.out.println("El número " + numero + " es negativo.");
            }

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
                numeroImpar += numero; 
            }
            
            System.out.println("-----------------------------");
        }

        System.out.println("Sumatoria de los números positivos: " + numeroPositivo);
        System.out.println("Sumatoria de los números impares: " + numeroImpar);

       teclado.close();
	}

}
