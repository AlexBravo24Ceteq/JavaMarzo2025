package com.condicionales;

import java.util.Scanner;

public class condicionales10_JAFA {
	public static void main(String[] args) {
		/*Realiza un programa que pida un número entero entre uno y
		 *  doce e imprima el número de días que tiene el 
		 *  mes correspondiente.
		 */
      
		Scanner input = new Scanner(System.in);
		
		int resultado;
		
		System.out.println("Ingrese un numero del (1 al 12)");
		resultado= input.nextInt();
		
		int dias;
		
		switch (resultado) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias= 30;
			break;
		case 2:
			dias = 28;
			break;
		
		default:
			System.out.println("ERROR: Introduce un numero del 1 al 12");
			return; //cerrar el programa con retunr 
		}
		
		System.out.println("El mes "+ resultado + " tiene "+ dias + " dias");
	}

}
