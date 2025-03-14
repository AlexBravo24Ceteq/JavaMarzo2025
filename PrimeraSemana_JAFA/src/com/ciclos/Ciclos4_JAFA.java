package com.ciclos;

import java.util.Scanner;

public class Ciclos4_JAFA {

	public static void main(String[] args) {
//		// 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”.

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa una Frase de tu preferencia:");
		String frase = input.nextLine();
		
		System.out.println("Ingresa una letra:");
		char letra = input.next().charAt(0);
		
		int contador= 0;
		
		//recorre la frase y contar las ocurrencias de la letra
		for (int i = 0; i < frase.length(); i++) { 
			if(frase.charAt(i)== letra) {
				contador++;
			}
		}
		
		if (contador > 0) {
			System.out.println("La letra "+ letra + " aparece "+ contador+ " veces en la frase");
		}
		else {
			System.out.println("Caracter no encontrado");
		}
		
		
		
	}

}
