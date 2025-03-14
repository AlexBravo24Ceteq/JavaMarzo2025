package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JAFA {
	public static void main(String[] args) {
//		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//		23 x 95 = ???
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingresa el numero que quieres multiplicar: ");
		numero = input.nextInt();
		
		System.out.println("Hasta qque numero quieres multiplicar");
		int numero2 = input.nextInt();
		
		
		for (int i = 1; i <= numero2; i++) {
			System.out.println(numero+" x "+ i + "=" + (numero*i));
			
		}
	}

}
