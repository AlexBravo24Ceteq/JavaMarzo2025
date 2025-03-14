package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JAFA {

	public static void main(String[] args) {
		
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2,division;
		
		System.out.println("Ingresa el primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		num2 = input.nextInt();
		
		if ( num2 == 0) {
			System.out.println("Error");
		}
		else {
			division = num1/num2;
			System.out.println("El resultado de la division es: "+ division);
		}
		
		
		
		
		
	}
}
