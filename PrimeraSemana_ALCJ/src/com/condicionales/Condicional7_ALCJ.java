package com.condicionales;

import java.util.Scanner;

public class Condicional7_ALCJ {

	public static void main(String[] args) {
		/* 7.- El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		 * debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		 * cobrar es la siguiente:
         * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
         * De 50 a 99 alumnos, el costo es de 70 euros.
         * De 30 a 49 alumnos, el costo es de 95 euros.
         * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
         * alumnos. 
         * Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
         * pagar cada alumno por el viaje.
		 */

		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa el n�mero de alumnos:");
        int numeroAlumnos = teclado.nextInt();

        double costoPorAlumno;
        double costoTotal;
        
        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            costoPorAlumno = 70;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            costoPorAlumno = 95;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else {
            costoTotal = 4000;
            costoPorAlumno = costoTotal / numeroAlumnos;
        }
        
        System.out.println("El pago del autobus es: " + costoTotal + " pesos.");
        System.out.println("Cada alumno debe pagar: " + costoPorAlumno + " pesos.");

	}

}
