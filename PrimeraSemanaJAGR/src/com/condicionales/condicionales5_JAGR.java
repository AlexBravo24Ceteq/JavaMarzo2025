package com.condicionales;

import java.util.Scanner;

	public class condicionales5_JAGR {

	//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la nota (0-10): ");
        double nota = scanner.nextDouble();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        	//Convierte el sexo a mayuscula con toUpperCase(), así acepta m o f.
        
        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        // Evaluar la solicitud
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("Resultado: POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("Resultado: ACEPTADA");
            } else {
                System.out.println("Resultado: NO ACEPTADA (Sexo no valido)");
            }
        } else {
            System.out.println("Resultado: NO ACEPTADA");
        }

        scanner.close();
    }
}
	


