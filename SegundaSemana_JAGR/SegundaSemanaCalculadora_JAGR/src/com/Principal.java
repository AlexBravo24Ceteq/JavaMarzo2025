package com;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de la calculadora cient�fica
        Cientifica calc = new Cientifica("Casio", "Negro", 299.99);

        System.out.println("Calculadora creada: " + calc);

        // Pedir n�meros por teclado
        System.out.print("Introduce el primer n�mero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo n�mero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Introduce el tercer n�mero: ");
        double num3 = scanner.nextDouble();

        // Realizar operaciones
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicaci�n: " + calc.multiplicar(num1, num2));
        System.out.println("Divisi�n: " + calc.dividir(num1, num2));

        System.out.println("Suma con tres n�meros: " + calc.sumar(num1, num2, num3));
        System.out.println("Resta con tres n�meros: " + calc.restar(num1, num2, num3));
        System.out.println("Multiplicaci�n con tres n�meros: " + calc.multiplicar(num1, num2, num3));
        System.out.println("Divisi�n con tres n�meros: " + calc.dividir(num1, num2, num3));

        scanner.close();
    }
}