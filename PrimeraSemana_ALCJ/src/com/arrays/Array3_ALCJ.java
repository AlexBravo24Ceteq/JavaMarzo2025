package com.arrays;

import java.util.Scanner;

public class Array3_ALCJ {

	public static void main(String[] args) {
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
		
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("HOLA! BIENVENIDO :)  ");
        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine();
        
        
        char[] caracteres = frase.toCharArray();
        System.out.println("Array de caracteres:");
        for (int x = 0; x < caracteres.length; x++) {
            System.out.println("Índice " + x + ": " + caracteres[x]);
        }
        


	}

}
