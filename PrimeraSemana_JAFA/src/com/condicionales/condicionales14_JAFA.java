package com.condicionales;

import java.util.Scanner;

public class condicionales14_JAFA {
	public static void main(String[] args) {
//		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//		primeras 40 horas y $20 por cada hora extra
		
		Scanner input = new Scanner(System.in);
		
		int horasTrabajadas;
		
		System.out.println("Introduce las horas trabajadas en la semana: ");
		horasTrabajadas=input.nextInt();
		
		double porHora=16.00;
		double horaExtra=20.00;
		
		double salario;
		
		if(horasTrabajadas <=40) {
			salario = horasTrabajadas * porHora;
		}
		else {
			int HorasExtras = horasTrabajadas - 40;
			salario = (40*porHora) + (HorasExtras*horaExtra);
			
		}
		System.out.println("El salario semanal es: $ "+ salario);
	}
}
