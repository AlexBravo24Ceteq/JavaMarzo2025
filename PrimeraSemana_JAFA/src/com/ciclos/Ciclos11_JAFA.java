package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JAFA {

	public static void main(String[] args) {
//		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
//		ancho y el alto. Ejemplo: 8 x 8 
//	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el ancho del cuadro:");
		int ancho = input.nextInt();
		
		System.out.println("Ingresa el alto del cuadro");
		int alto= input.nextInt();
		
		//El interno dibujara  los caracteres  y el externo dara los saltos 
		for (int i = 1; i <=alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				System.out.print("*");
			}
			System.out.println();//Salto de linea desppues de cada fila
		}
		
	}
}
