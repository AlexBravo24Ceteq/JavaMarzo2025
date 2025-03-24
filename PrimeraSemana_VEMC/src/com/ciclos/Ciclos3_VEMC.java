package com.ciclos;

import java.util.Scanner;

public class Ciclos3_VEMC {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
	Scanner input = new Scanner (System.in);
	System.out.println("Introduce una palabra o frase: ");
	String texto = input.nextLine();
	if (esPalindromo(texto)) {
		System.out.println("Es un palindromo!");
	}else {
		System.out.println("No es un palindromo");
	}
	input.close();

	}
	
	public static boolean esPalindromo(String texto) {
		texto = texto.replaceAll("\\s+", "").toLowerCase();
		int longitud = texto.length();
		
		//comparar caracteres desde los extremos hacia el centro.
		for(int i = 0; i < longitud / 2; i++) {
			if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	

}
