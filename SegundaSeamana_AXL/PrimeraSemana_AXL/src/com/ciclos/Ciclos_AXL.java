package com.ciclos;

import java.util.Scanner;

public class Ciclos_AXL {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo. 
		
		Scanner palabra = new Scanner(System.in);
	    
	    System.out.println("Escribe la frase: ");
	    String frase = palabra.nextLine();
	    
	    frase = frase.replaceAll("\\s+", "").toLowerCase();
	    
	    boolean esPalind = true;
	    
	    for (int x = 0; x < frase.length() / 2; x++) {
	      if (frase.charAt(x) != frase.charAt(frase.length() - 1 - x)) {
	        esPalind = false; 
	        break;
	      }
	 
	    }
	    if (esPalind) {
	      System.out.println("¡Es un palindromo ");
	    } else {
	      System.out.println("No es un palindromo ");
	    }

	}

}
