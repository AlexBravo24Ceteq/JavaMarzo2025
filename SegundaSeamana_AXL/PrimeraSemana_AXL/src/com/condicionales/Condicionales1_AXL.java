package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AXL {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor 
		//o si son iguales. 
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Comparar los números
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // Cerrar el escáner
        scanner.close();

	}

}
