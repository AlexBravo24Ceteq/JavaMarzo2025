package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JAFA {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
		
		Scanner input = new Scanner (System.in);
		int a,b;
		 
		System.out.println("==========Programa de condicionales=========");
		System.out.println("Ingresa el primer numero: ");
		a = input.nextInt();
		 
		System.out.println("Ingresa el segundo numero: ");
		b = input.nextInt();
		
		if (a>b) {
			System.out.println("El primer numero es mayor y es el "+a);
		}
		else if(a<b) {
			System.out.println("El segundo numero es mayor y es el " + b);
		}
		else if(a==b){
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("ERROR");
		}

	}

}
