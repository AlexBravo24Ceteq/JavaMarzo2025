package com.condicionales;

import java.util.Scanner;

public class Condicional14_ALCJ {

	public static void main(String[] args) {
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
		//primeras 40 horas y $20 por cada hora extra.
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<SALARIO OBRERO>>>>");
        System.out.println("Ingresa el número de horas trabajadas esta semana:");
        int horasTrabajadas = teclado.nextInt();

        int horasNormales = 40;
        int pagoPorHoraNormal = 16;
        int pagoPorHoraExtra = 20;
        double salario;

        if (horasTrabajadas <= horasNormales) {
            salario = horasTrabajadas * pagoPorHoraNormal;
        } else {
            int horasExtras = horasTrabajadas - horasNormales;
            salario = (horasNormales * pagoPorHoraNormal) + (horasExtras * pagoPorHoraExtra);
        }
        System.out.printf("El salario semanal es: $%.2f%n", salario);
    }

	}


