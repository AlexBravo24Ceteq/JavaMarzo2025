package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JAGR {
	
	//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Pedir numero al usuario
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        // Comprobar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR.");
        } else {
            System.out.println("El numero " + numero + " es IMPAR.");
        }

        scanner.close();
    }
}
