package com.ciclos;

import java.util.Scanner;

public class Ciclos3_ALCJ {

	public static void main(String[] args) {
		// 3.- Realiza un programa para determinar si un String es palíndromo. 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe la frase: ");
		String frase = teclado.nextLine();
		
		frase = frase.replaceAll("\\s+", "").toLowerCase();
		
		boolean esPalindromo = true;
		
		for (int x = 0; x < frase.length() / 2; x++) {
			if (frase.charAt(x) != frase.charAt(frase.length() - 1 - x)) {
				esPalindromo = false; 
				break;
			}
 
		}
		if (esPalindromo) {
			System.out.println("¡Esto es un palindromo <3!");
		} else {
			System.out.println("NO es un palindromo :( ");
		}
		
		teclado.close();

	}

}
