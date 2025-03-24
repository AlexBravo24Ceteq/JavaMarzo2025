package com.ciclos;

public class Ciclos1_JAGR {
    public static void main(String[] args) {
    	
        // Programa un algoritmo que realice la tabla de multiplicar del 12
    	//Trabajo 1
    	
        int numero = 12;
        System.out.println("Tabla de multiplicar del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
