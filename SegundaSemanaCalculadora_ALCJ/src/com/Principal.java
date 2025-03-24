package com;

public class Principal {
	public static void main(String[] args) {
        // Instancia la subclase, no la clase abstracta
        CalculadoraCientifica casio = new CalculadoraCientifica();

        // Usa el método sumar(double a, double b)
        double resultado = casio.sumar(10, 18);
        System.out.println("Resultado de la suma: " + resultado);

        // Usa el método sumar() sin parámetros
        casio.sumar();
    }
	

}
