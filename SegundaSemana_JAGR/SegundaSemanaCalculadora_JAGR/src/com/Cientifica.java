package com;

public class Cientifica extends Calculadora {

    // Constructor
    public Cientifica(String marca, String color, double precio) {
        super(marca, color, precio);
    }

    // Implementaci�n de los m�todos abstractos
    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

    // M�todos adicionales con 3 par�metros
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    public double dividir(double a, double b, double c) {
        if (b == 0 || c == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b / c;
    }
}