package com.condicionales;

import java.util.Scanner;

public class Condicionales14_VEMC {

	public static void main(String[] args) {
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		//Si trabaja 40 horas o menos se le paga $16 por hora.
		//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
Scanner input = new Scanner (System.in);
System.out.println("Introduce las horas trabajadas esta semana: ");
int horasTrabajadas = input.nextInt();

//Calcular el salario semanal
double salario;
if(horasTrabajadas <= 40) {//Si las horas trabajadas son 40 o menos, el salario se calcula multiplicando las horas por $16.
	salario = horasTrabajadas * 16;
}else {
	int horasExtras = horasTrabajadas - 40; //horas extra
	salario = (40 * 16) + (horasExtras * 20);//$16 por las primeras 40 horas y $20 por horas extras.
}
//Mostrar el salario semanal
System.out.printf("El salario semanal es: $%.2f\n", salario);
input.close();
	}

}
