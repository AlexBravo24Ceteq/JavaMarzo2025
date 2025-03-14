package com.Arrays;

import java.util.Scanner;

public class Arrays1_FEPA {

	public static void main(String[] args) {
		

		
int[] array = new int[10];
        
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los valores para cada posición del array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Mostrar el índice y el valor correspondiente
        System.out.println("Índice y valores del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice: " + i + " - Valor: " + array[i]);
        }
        
        // Cerrar el scanner
        scanner.close();
	}

}
