package com.condicionales;

import java.util.Scanner;

public class condicionales5_JAFA {
	public static void main(String[] args) {
		
		//Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
		//par�metros: edad, nota y sexo.
		//* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		
		Scanner input = new Scanner(System.in);
		
		int edad;
		float nota;
		char sexo;
		
		System.out.println("Ingresa tu edad: ");
		edad= input.nextInt();
		
		System.out.println("Ingresa tu claificaci�n: ");
		nota = input.nextFloat();
		
		System.out.println("Ingresa tu sexo M/F");
		sexo= input.next().charAt(0);
		
		
		if ( nota >= 5 && edad >= 18) {
			if (sexo == 'M' ) {
				System.out.println("Posible");
			}
			
			else if ( sexo == 'F') {
				System.out.println("Aceptada");
			}
			else {
				System.out.println("No acpetada");
			}
			
		}else {
			System.out.println("No acpetada");
		}
	
	}

}
