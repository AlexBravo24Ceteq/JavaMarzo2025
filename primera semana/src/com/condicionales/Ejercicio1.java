package com.condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in);
		//Solicitar los dos numeros al usuario
		// Solicitar el primer numero
		System.out.println("Ingrese el primer numero:");
		int numero1 = scanner.nextInt();
		
		//Solicitar el segundo numero
		System.out.println("Ingrese el segundo numero:");
		int numero2 = scanner.nextInt();
		
		//Se compara los dos numeros
		
		if (numero1 > numero2) {
			System.out.println("El primer numero (" + numero1 +") es mayor que el segundo numero (" + numero2 +").");
			
		}else if (numero2 > numero1) {
			System.out.println ("El segundo numero (" + numero2 +") es mayor que el primer numero (" + numero1 +").");
		}else {
			System.out.println ("Los dos numeros son iguales");
			
		}
		scanner.close();
		
}
	

}
