package com.arrays;

import java.util.Scanner;

public class Arrays1_ALCJ {

	public static void main(String[] args) {
		// 1.-Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.
		
		System.out.println("<<<<<<<<<<HOLIS>>>>>>>>>>");
		
        int[] numeros = new int[10];
        
        Scanner teclado = new Scanner(System.in);
        

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Ingrese el valor para la posici�n " + x + ": ");
            numeros[x] = teclado.nextInt();
        }
        
       
        System.out.println("�ndice y valores del array:");
        for (int x = 0; x < numeros.length; x++) {
            System.out.println("�ndice: " + x + " - Valor: " + numeros[x]);
        }
        

	}

}
