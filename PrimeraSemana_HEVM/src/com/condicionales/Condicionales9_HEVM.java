package com.condicionales;

import java.util.Scanner;

public class Condicionales9_HEVM {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		//introducimos otro n�mero nos da un error
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduzca un n�mero del 1 al 7 y le dire a que n�mero de la semana corresponde");
		int dia = input.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;	
		case 5:
			System.out.println("Viernes");
			break;	
		case 6:
			System.out.println("Sabado");
			break;	
		case 7:
			System.out.println("Domingo");
			break;	
		default:
			System.out.println("Error");
			break;
		}
	}

}
