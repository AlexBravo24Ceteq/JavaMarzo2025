package com.condicionales;

import java.util.Scanner;

public class Condicionales10_HEVM {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		//mes correspondiente.
Scanner input = new Scanner (System.in);
		
		System.out.println("Introduzca un número del 1 al 12 y le dire a que mes corresponde");
		System.out.println("Ademas de la cantidad de dias que tiene");
		int numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Enero y tiene 31 dias");
			break;
		case 2:
			System.out.println("Febrero y tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo y tiene 31 dias");
			break;
		case 4:
			System.out.println("Abril y tiene 30 dias");
			break;	
		case 5:
			System.out.println("Mayo y tiene 31 dias");
			break;	
		case 6:
			System.out.println("Junio y tiene 30 dias");
			break;	
		case 7:
			System.out.println("Julio y tiene 31 dias");
			break;	
		case 8:
			System.out.println("Agosto y tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre y tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre y tiene 31 dias");
			break;	
		case 11:
			System.out.println("Noviembre y tiene 30 dias");
			break;	
		case 12:
			System.out.println("Diciembre y tiene 31 dias");
			break;		
		default:
			System.out.println("Error");
			break;
		}
	}

}
