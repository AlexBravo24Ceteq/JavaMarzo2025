package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JABR {

	public static void main(String[] args) {
		// 11. Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
		
		//Necesitamos un Scanner para poder solicitar los datos por teclado
		Scanner input = new Scanner (System.in);
		//Necesitamos tambien unas variables de tipo entero para guardar
		//el alto y ancho que el usuario solicite
		int alto;
		int ancho;
		//Solicitamos que se introduzcan los valores
		System.out.println("Introduce el valor del alto de la figura");
		alto = input.nextInt();
		System.out.println("Introduce el valor del ancho de la figura");
		ancho = input.nextInt();
		
		//Vamos a resolverlo con dos ciclos for. El interno dibujara los caracteres (ancho)
		//y el externo dara los saltos de linea (alto)
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				//Este ciclo manda a imprimir los caracteres en una sola linea
				System.out.print("* ");
			}
			//Ahora estamos dentro del ciclo externo y una vez se dibujo la primera linea
			//El ciclo externo dara un salto de linea
			System.out.println();
		}
		

	}

}
