package com.ciclos;

import java.util.Scanner;

public class Ciclos8_HEVM {

	public static void main(String[] args) {
		//  Programa Java que lea dos números y muestre los números desde el menor hasta el
		//mayor
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero");
		int numero1 = input.nextInt();
		
		System.out.println("Ingrese otro numero entero");
		int numero2 = input.nextInt();
		
		if (numero1 > numero2) {
			for (int i = numero2 ; i <= numero1 ; i++) {
				System.out.println(i);
			}
			}else {
				for (int i = numero1 ; i <= numero2 ; i++) {
					System.out.println(i);
			}
		}

	}

}
