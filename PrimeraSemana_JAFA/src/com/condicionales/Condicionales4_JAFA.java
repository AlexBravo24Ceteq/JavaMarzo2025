package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JAFA {
	public static void main(String[] args) {
		
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner input = new Scanner(System.in);
		String cadena;
		
		System.out.println("Ingresa una cadena: ");
		cadena = input.nextLine();
		
		if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {//Charcter.isUpperCAse es un metodo que nos comprueba si esta en mayuscula o no
			System.out.println("La cadena ingresada es una letra Mayuscaula");
		}
		else {
			System.out.println("La cadena ingresada no es una letra mayuscula");
		}
	}

}
