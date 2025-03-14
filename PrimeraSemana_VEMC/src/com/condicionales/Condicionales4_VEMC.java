package com.condicionales;

import java.util.Scanner;

public class Condicionales4_VEMC {

	public static void main(String[] args) {
// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		Scanner input = new Scanner(System.in);
		System.out.println("===Comprobador de Mayúsculas===");
		System.out.println("Introduce una cadena de caracteres: ");//solicitar una cadena al usuario
		String caracteres = input.nextLine();
//lenght() este metodo nos devuelve una longitud de caracteres en cadena
		if (caracteres.length() == 1 && Character.isUpperCase(caracteres.charAt(0))) {
//Verifica si la cadena es una unica letra mayuscula.
//el metodo charAt(0) devuelve el primer caracter de la cadena UpperCase verifica si el caracter es una letra mayuscula.
			System.out.println("La cadena introducida es una letra mayúscula.");
		}else{
			System.out.println("La cadena introducida NO es una letra mayúscula.");
		}
		
		input.close();

	}

}
