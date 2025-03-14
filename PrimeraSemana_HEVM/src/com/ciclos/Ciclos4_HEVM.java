package com.ciclos;

import java.util.Scanner;

public class Ciclos4_HEVM {

	public static void main(String[] args) {
		/*
		 * .Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		 *cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		 *“Carácter no encontrado”. 
		 */

		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduzca una frase");
		String frase = input.nextLine();
		
		System.out.println("Ahora introduzca una letra y le dire cuantas hay en la frase anterior");
		char letra = input.next().charAt(0);
		
		frase = frase.toLowerCase();
		letra = Character.toLowerCase(letra);
 		
		int cantidad = 0;
			
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				cantidad++;
			}
		}

		System.out.println("Su frase contiene " + cantidad + " de letras " + letra);

	}
}
