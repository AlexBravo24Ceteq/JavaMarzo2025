package com.arrays;

import java.util.Scanner;

public class Arrays1_ALCJ {

	public static void main(String[] args) {
		// 1.-Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		System.out.println("<<<<<<<<<<HOLIS>>>>>>>>>>");
		
        int[] numeros = new int[10];
        
        Scanner teclado = new Scanner(System.in);
        

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Ingrese el valor para la posición " + x + ": ");
            numeros[x] = teclado.nextInt();
        }
        
       
        System.out.println("Índice y valores del array:");
        for (int x = 0; x < numeros.length; x++) {
            System.out.println("Índice: " + x + " - Valor: " + numeros[x]);
        }
        

	}

}
