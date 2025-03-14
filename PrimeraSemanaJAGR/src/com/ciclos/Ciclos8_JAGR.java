package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JAGR {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números desde el menor hasta el
		//mayor  en java
		//Trabajo 8

		 Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar dos numeros al usuario
	        System.out.print("Ingrese el primer numero: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Ingrese el segundo numero: ");
	        int num2 = scanner.nextInt();
	        
	        // Determinar el menor y el mayor
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);
	        
	        // Mostrar los numeros en orden
	        System.out.println("Numeros desde " + menor + " hasta " + mayor + ":");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.print(i + " ");
	        }
	        
	        scanner.close();
	    }
	}
