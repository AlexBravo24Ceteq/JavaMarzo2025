package com.arrays;

import java.util.Scanner;

public class Array3_HEVM {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Escribe una frase");
		String frase = input.nextLine();
		
		char[] letras = new char [frase.length()];
		
		for(int i = 0; i < frase.length(); i++) {
			letras[i] = frase.charAt(i);
		}for (char i:letras) {
			System.out.print(i + " ");

	}
	}
}
