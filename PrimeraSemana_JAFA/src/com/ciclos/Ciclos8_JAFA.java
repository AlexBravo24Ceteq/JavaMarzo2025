package com.ciclos;

import java.util.Scanner;

public class Ciclos8_JAFA {

	public static void main(String[] args) {
//		// Programa Java que lea dos números y muestre los números desde el menor hasta el 
//		mayor
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Ingresa un numero:");
		int num1 = input.nextInt();
		
		System.out.println("Ingresa un segundo numero:");
		int num2 = input.nextInt();
		
		//Determinar el numero mayo o menor
		
		int menor= Math.min(num1, num2);
		int mayor= Math.max(num1, num2);
		
		
		System.out.println("Los numeros desde el menor hasta el mayor son:");
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i+"");
			
		}
	}

}
