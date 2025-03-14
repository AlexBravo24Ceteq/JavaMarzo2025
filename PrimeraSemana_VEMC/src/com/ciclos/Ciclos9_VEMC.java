package com.ciclos;

import java.util.Scanner;

public class Ciclos9_VEMC {

	public static void main(String[] args) {
//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingresa el primer n�mero: ");
		int numero1 = input.nextInt();
		
		System.out.println("Ingresa el segundo n�mero: ");
		int numero2 = input.nextInt();
		
		//determinar el menor y el mayor.
		int menor = Math.min(numero1, numero2);//obtiene el numero menor.
		int mayor = Math.max(numero1, numero2);//obitiene el numero mayor.
		
		//mostrar los numero pares entre el mayor y menor.
		System.out.println("N�meros pares entre " + menor + " y " + mayor + ":");
		for (int i = menor; i <= mayor; i ++ ) {
			if(i % 2 == 0) {//verificamos si es par.
				System.out.println(i + " ");
				input.close();
			}
		}

	}

}
