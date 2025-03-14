package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ALCJ {

	public static void main(String[] args) {
		// 4.- Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("<<<<<HOLA>>>>");
        System.out.println("Ingresa cadena:");
        
        String cadena = teclado.nextLine();
        
        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La cadena ingresada es una letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada NO es una letra mayúscula.");
        }


	}

}
