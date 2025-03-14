package com.ciclos;

import java.util.Scanner;

public class cICLOS3_jagr {

	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo en java
		//Trabajo 3
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar la cadena al usuario
	        System.out.print("Ingrese una palabra o frase: ");
	        String texto = scanner.nextLine();
	        
	        // Verificar si es un palindromo
	        if (esPalindromo(texto)) {
	            System.out.println("Es un palindromo.");
	        } else {
	            System.out.println("No es un palindromo.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean esPalindromo(String texto) {
	        // Eliminar espacios y convertir a minusculas
	        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        // Verificar si es igual al texto invertido
	        String invertido = new StringBuilder(textoLimpio).reverse().toString();
	        return textoLimpio.equals(invertido);

	}

}
