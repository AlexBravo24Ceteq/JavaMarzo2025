package com.ciclos;

 import java.util.Scanner;

public class Ciclos9_JAGR {

	public static void main(String[] args) {
		
		//Programa Java que lea dos numeros y muestre los numeros pares entre ellos.
		//Trabajo 9

		Scanner scanner = new Scanner(System.in);

        // Solicitar dos numeros
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        // Asegurar que num1 sea menor que num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Mostrar los numeros pares entre num1 y num2
        System.out.println("Numeros pares entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
