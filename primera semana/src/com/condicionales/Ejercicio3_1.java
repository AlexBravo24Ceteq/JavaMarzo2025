package com.condicionales;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer n�mero
        System.out.print("Introduce el primer n�mero: ");
        double num1 = scanner.nextDouble();

        // Solicitar al usuario el segundo n�mero
        System.out.print("Introduce el segundo n�mero: ");
        double num2 = scanner.nextDouble();

        // Verificar si el segundo n�mero es 0
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            // Calcular y mostrar el resultado de la divisi�n
            double resultado = num1 / num2;
            System.out.println("El resultado de la divisi�n es: " + resultado);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

	
