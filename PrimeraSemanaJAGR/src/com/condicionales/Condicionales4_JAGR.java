package com.condicionales;

	import java.util.Scanner;
	
	public class Condicionales4_JAGR {
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayuscula.
		//Trabajo 4
		
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar entrada al usuario
	        System.out.print("Ingresa un caracter: ");
	        String input = scanner.nextLine();

	        // Verificar que la entrada no este vacia y sea un solo caracter
	        if (input.length() == 1) {
	            char letra = input.charAt(0);

	            // Comprobar si es una letra mayuscula
	            if (Character.isUpperCase(letra)) {
	                System.out.println("El caracter '" + letra + "' es una letra mayuscula.");
	            } else {
	                System.out.println("El caracter '" + letra + "' NO es una letra mayuscula.");
	            }
	        } else {
	            System.out.println("Por favor, ingresa solo un caracter.");
	        }

	        scanner.close();
	    }
	}

