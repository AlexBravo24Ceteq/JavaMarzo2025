package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JAFA {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una frase para verificar si es un palindromo:");
		String texto = input.nextLine();
		
		String textoL= texto.replaceAll("\\s+", "").toLowerCase(); //Eliminar espacios de texto convierte todo a minusculas
		
		boolean esPalindromo=true;
		
		for (int i = 0; i < textoL.length() ; i++) {
			if(textoL.charAt(i)!= textoL.charAt(textoL.length()-1 -i)) {
				esPalindromo= false;
				break;
			}
			
		}
		if(esPalindromo) {
			System.out.println("El texto es Palindromo");
		}
		else {
			System.out.println("El texto no es Palindromo");
		}
		

	}

}
