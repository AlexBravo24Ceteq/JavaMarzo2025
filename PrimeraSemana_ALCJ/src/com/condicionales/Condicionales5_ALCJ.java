package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ALCJ {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//Otros casos -> NO ACEPTADA
		 
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa la edad:");
        int edad = teclado.nextInt();
        
        System.out.println("Ingresa la nota:");
        double nota = teclado.nextDouble();
        
        System.out.println("Ingresa el sexo (M para masculino, F para femenino):");
        char sexo = teclado.next().charAt(0);
        
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

	}

}
