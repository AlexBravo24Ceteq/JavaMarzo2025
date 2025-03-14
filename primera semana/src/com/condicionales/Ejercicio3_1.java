package com.condicionales;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        // Solicitar al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Verificar si el segundo número es 0
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            // Calcular y mostrar el resultado de la división
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

	
