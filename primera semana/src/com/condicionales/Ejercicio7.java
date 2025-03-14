package com.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

        // Solicitar el número de alumnos
        System.out.print("Ingrese el número de alumnos para el viaje: ");
        int numeroAlumnos = scanner.nextInt();

        double costoTotal = 0;

        // Calcular el costo total según el número de alumnos
        if (numeroAlumnos >= 100) {
            costoTotal = numeroAlumnos * 65;
        } else if (numeroAlumnos >= 55 && numeroAlumnos <= 99) {
            costoTotal = numeroAlumnos * 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            costoTotal = numeroAlumnos * 95;
        } else if (numeroAlumnos < 30) {
            costoTotal = 4000.0 / numeroAlumnos;
        }

        // Mostrar el costo total
        System.out.println("El costo total del viaje es: $" + costoTotal);

        scanner.close();
		
	}

}
