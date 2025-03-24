package com;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de la calculadora científica
        Cientifica calc = new Cientifica("Casio", "Negro", 299.99);

        System.out.println("Calculadora creada: " + calc);

        // Pedir números por teclado
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        // Realizar operaciones
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));

        System.out.println("Suma con tres números: " + calc.sumar(num1, num2, num3));
        System.out.println("Resta con tres números: " + calc.restar(num1, num2, num3));
        System.out.println("Multiplicación con tres números: " + calc.multiplicar(num1, num2, num3));
        System.out.println("División con tres números: " + calc.dividir(num1, num2, num3));

        scanner.close();
    }
}