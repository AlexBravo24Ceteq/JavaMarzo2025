package com;

public class Metodos_adicionales {

	 // Métodos adicionales con más argumentos
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
        if (b != 0 && c != 0) {
            return a / b / c;
        } else {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
    }
}
