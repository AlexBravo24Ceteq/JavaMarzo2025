package com.ciclos;

import java.util.Scanner;

public class Ciclo8_ALCJ {

	public static void main(String[] args) {
		// 8.- Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el
		//mayor 
		
		System.out.println("HOLA BEBES <3 ");
		
		Scanner teclado = new Scanner(System.in);

     
        System.out.print("Escribe el primer n�mero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Escribe el segundo n�mero: ");
        int numero2 = teclado.nextInt();

        int menor, mayor;
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        } else {
            menor = numero2;
            mayor = numero1;
        }
        System.out.println("N�meros desde " + menor + " hasta " + mayor + ":");
        for (int x = menor; x <= mayor; x++) {
            System.out.print(x + " ");
        }
        
        teclado.close();


	}

}
