package com.arrays;

import java.util.Scanner;

public class Arrays3_JAFA {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.
		
	
		
			Scanner input = new Scanner(System.in);
		
		
			System.out.println("Ingresa una frase de tu agrado:");
			String frase= input.nextLine();
			
			char [] caracter = new char[frase.length()];
			
			for (int i = 0; i < frase.length(); i++) {
				caracter[i]= frase.charAt(i);
			}
			
			for (int i = 0; i < caracter.length; i++) {
				System.out.println("Indice "+ i + ":"+ caracter[i]);
			}
		

	}

}
