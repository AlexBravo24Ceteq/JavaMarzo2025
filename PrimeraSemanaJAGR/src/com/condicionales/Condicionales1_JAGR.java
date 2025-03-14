package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JAGR {

	//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
	//Trabajo 1

	
	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar los dos números al usuario
		        System.out.print("Introduce el primer numero: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Introduce el segundo numero: ");
		        int num2 = scanner.nextInt();

		        // Comparar los números
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
