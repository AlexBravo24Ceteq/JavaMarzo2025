package com.ciclos;

import java.util.Scanner;

public class Ciclos_Edades12_JAGR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumaEdades = 0, cantidadEdades = 0;
        double promedio = 0;

        System.out.println("Ingrese edades (el programa terminara cuando el promedio supere 25):");

        while (promedio <= 25) {
            System.out.print("Ingrese una edad valida: ");
            
            // Validación de entrada
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada invalida. Ingrese un numero entero: ");
                scanner.next(); // Limpiar entrada incorrecta
            }
            
            int edad = scanner.nextInt();
            
            // Verificar que la edad sea valida
            if (edad < 0) {
                System.out.println("La edad no puede ser negativa. Intentelo de nuevo.");
                continue;
            }

            sumaEdades += edad;
            cantidadEdades++;
            promedio = (double) sumaEdades / cantidadEdades;
        }

        System.out.printf("El programa ha finalizado. Promedio de edades: %.2f\n", promedio);
        scanner.close();
    }
}
