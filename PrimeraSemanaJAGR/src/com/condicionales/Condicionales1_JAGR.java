package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JAGR {

	//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales
	//Trabajo 1

	
	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar los dos n�meros al usuario
		        System.out.print("Introduce el primer numero: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Introduce el segundo numero: ");
		        int num2 = scanner.nextInt();

		        // Comparar los n�meros
		        if (num1 > num2) {
		            System.out.println("El numero mayor es: " + num1);
		        } else if (num1 < num2) {
		            System.out.println("El numero mayor es: " + num2);
		        } else {
		            System.out.println("Ambos numeros son iguales.");
		        }

		        scanner.close();


	}

}
