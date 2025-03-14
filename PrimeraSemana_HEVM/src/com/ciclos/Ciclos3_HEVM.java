package com.ciclos;

import java.util.Scanner;

public class Ciclos3_HEVM {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo.

		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduzca una palabra y le dire si es un palindromo");
		String palabra = input.next();
		String reversa = "";
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
		reversa += palabra.charAt(i);
			
		} if(palabra.equalsIgnoreCase(reversa)){
			System.out.println("La palabra es un palindromo");
		}else {
			System.out.println("La palabra no es un palindromo");
		}
		}
	}

