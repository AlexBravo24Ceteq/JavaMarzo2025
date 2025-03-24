package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AXL {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar. 
		
     Scanner scanner = new Scanner(System.in);
        
//Solicitar un numero
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        //Comprobar si el numero es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        scanner.close();

	}

}
