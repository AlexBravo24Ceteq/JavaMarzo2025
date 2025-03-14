package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ALCJ {

	public static void main(String[] args) {
		// 9.- Programa Java que lea dos números y muestre los números pares entre ellos 
		System.out.println("HOLA ESTAS EN EL PROGRAMA JAVA DE AMÈRICA :)   ");
		
		Scanner teclado = new Scanner(System.in);

       
        System.out.print("Escribe el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Escribe el segundo número: ");
        int numero2 = teclado.nextInt();

        int menor, mayor;
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        } else {
            menor = numero2;
            mayor = numero1;
	}
        System.out.println("Números pares entre " + menor + " y " + mayor + ":");
        for (int x = menor; x <= mayor; x++) {
           
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
}
     teclado.close();
	 }    

}