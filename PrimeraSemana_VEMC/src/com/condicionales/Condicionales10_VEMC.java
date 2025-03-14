package com.condicionales;

import java.util.Scanner;

public class Condicionales10_VEMC {

	public static void main(String[] args) {
//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
Scanner input = new Scanner (System.in);
System.out.println("Introduce un número entero (entre 1 y 12): ");//solicitar el numero del mes
int numeroMes = input.nextInt();
int dias;
switch (numeroMes) {
case 1: //Enero
case 3: //Marzo
case 5: //Mayo
case 7: //Julio
case 8: //Agosto
case 10: //Octubre
case 12: //Diciembre
	dias = 31;
	break;
case 4: //Abril
case 6: //Junio
case 9: //Septiembre
case 11: //Noviembre
	dias = 30;
	break;
case 2: //Febrero
	dias=28;//suponiendo que no es bisiesto
	default: dias = -1;
	}

	if (dias != -1) {
		System.out.println("El mes " + numeroMes + " tiene " + dias +" dias.");
	}else {
		System.out.println("ERROR: Número incorrecto. Debe ser un número del 1 al 12.");
	}

input.close();
	}

}
