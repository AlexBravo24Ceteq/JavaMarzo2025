package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JAGR {

	//Crea un programa que pida al usuario dos numeros y muestre el resultado de su division. 
	//Si el segundo numero es 0, debe mostrar un mensaje de error.
	//Trabajo 3
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Pedir los dos numeros al usuario
        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();

        // Comprobar si el divisor es 0
        if (num2 == 0) {
            System.out.println("¡Error! No se puede dividir entre 0.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la division es: " + resultado);
        }

        scanner.close();
    }
}