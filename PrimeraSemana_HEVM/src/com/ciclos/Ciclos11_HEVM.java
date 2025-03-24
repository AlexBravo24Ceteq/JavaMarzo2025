package com.ciclos;

import java.util.Scanner;

public class Ciclos11_HEVM {

	public static void main(String[] args) {
		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tamaño del lado del cuadrado");
		int lado = input.nextInt();
		
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

}
