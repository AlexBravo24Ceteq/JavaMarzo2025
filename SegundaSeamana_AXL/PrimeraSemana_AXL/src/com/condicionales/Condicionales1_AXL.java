package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AXL {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor 
		//o si son iguales. 
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar el primer n�mero
        System.out.print("Introduce el primer n�mero: ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo n�mero
        System.out.print("Introduce el segundo n�mero: ");
        int numero2 = scanner.nextInt();

        // Comparar los n�meros
        if (numero1 > numero2) {
            System.out.println("El primer n�mero (" + numero1 + ") es mayor que el segundo n�mero (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo n�mero (" + numero2 + ") es mayor que el primer n�mero (" + numero1 + ").");
        } else {
            System.out.println("Ambos n�meros son iguales.");
        }

        // Cerrar el esc�ner
        scanner.close();

	}

}
