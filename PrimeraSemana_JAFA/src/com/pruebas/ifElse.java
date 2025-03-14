package com.pruebas;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, dato=5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingresa un numero:");
		numero = input.nextInt();
		
		if(numero == dato) {
			System.out.println("El numero es igual a 5");
		}
		else {
			System.out.println("Son diferentes a 5	");
		}

	}

}
