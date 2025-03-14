package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JAFA {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un numero:");
		int num1=input.nextInt();
		
		System.out.println("Imgresa un segundo nuemro:");
		int num2=input.nextInt();
		
		int menor= Math.min(num1, num2);
		int mayor= Math.max(num1, num2);
		
		System.out.println("Los numero pares entre "+ menor +" y "+ mayor+ " son:");
		
		for (int i = menor; i <=mayor; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"");
			}
			
		}

	}

}
