package com.condicionales;

import java.util.Scanner;

public class Condicionales14_HEVM {

	public static void main(String[] args) {
		/*
		 *Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		 *horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
		 *primeras 40 horas y $20 por cada hora extra
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Calculemos su salario de la semana, introduzca el numero de horas que trabajo");
		double horas = input.nextDouble();
		
		if (horas <= 40) {
			double pago = horas*16;
			System.out.println("Su salario de esta semana es de " + pago + " euros");
		}else {
			double horasExtra = horas - 40;
			double pago = 40*16 + horasExtra*20;
			System.out.println("Usted trabajo " + horasExtra + " horas extra");
			System.out.println("Su salario de esta semana es de " + pago + " euros");
		}

	}

}
