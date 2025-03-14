package com.ciclos;

		import java.util.Scanner;

public class Ciclos91_JAGR {
	
		//Programa que lea 20 numeros e indique si son positivos o negativos y pares o
	    //impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.
		//Trabajo 10
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        	int sumaPositivos = 0;
        	int sumaImpares = 0;

        // Leer 20 numeros
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();

            // Determinar si es positivo o negativo
            	if (numero >= 0) {
            			System.out.print("Es positivo, ");
                sumaPositivos += numero; // Sumar si es positivo
            	} else {
            			System.out.print("Es negativo, ");
            }		

            	// Determinar si es par o impar
            	if (numero % 2 == 0) {
            		System.out.println("y par.");
            	} else {
                System.out.println("e impar.");
                	sumaImpares += numero; // Sumar si es impar
            }
        }

        // Mostrar resultados
        	System.out.println("\nSumatoria de los números positivos: " + sumaPositivos);
        	System.out.println("Sumatoria de los números impares: " + sumaImpares);

        	scanner.close();
    }
}