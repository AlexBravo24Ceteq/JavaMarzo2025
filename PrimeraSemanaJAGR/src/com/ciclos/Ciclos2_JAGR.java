package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JAGR {

	public static void main(String[] args) {
		
		//tabla de multiplicar
		//Trabajo 2 

	       Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar numero y límite de iteracion
	        System.out.print("Ingrese el numero para la tabla de multiplicar: ");
	        int numero = scanner.nextInt();
	        
	        System.out.print("Ingrese hasta que numero desea multiplicar: ");
	        int limite = scanner.nextInt();
	        
	        // Generar la tabla de multiplicar
	        System.out.println("Tabla de multiplicar del " + numero + " hasta " + limite + ":");
	        for (int i = 1; i <= limite; i++) {
	            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
	        }
	        
	        scanner.close();
	    }
	}