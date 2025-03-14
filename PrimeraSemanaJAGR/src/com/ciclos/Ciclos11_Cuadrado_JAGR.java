package com.ciclos;

import java.util.Scanner;

public class Ciclos11_Cuadrado_JAGR {

	public static void main(String[] args) {
		
		
		// Dibujar un cuadrado
		//Trabajo 11

		Scanner scanner = new Scanner(System.in);

        // ancho y alto
        System.out.print("Ingrese el ancho del cuadrado: ");
        int ancho = scanner.nextInt();
        
        System.out.print("Ingrese el alto del cuadrado: ");
        int alto = scanner.nextInt();
        
        // Dibujar el cuadrado
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

