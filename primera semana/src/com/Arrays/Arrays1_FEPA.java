package com.Arrays;

import java.util.Scanner;

public class Arrays1_FEPA {

	public static void main(String[] args) {
		

		
int[] array = new int[10];
        
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los valores para cada posici�n del array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor para la posici�n " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Mostrar el �ndice y el valor correspondiente
        System.out.println("�ndice y valores del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("�ndice: " + i + " - Valor: " + array[i]);
        }
        
        // Cerrar el scanner
        scanner.close();
	}

}
