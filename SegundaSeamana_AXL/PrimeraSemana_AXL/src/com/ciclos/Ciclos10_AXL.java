package com.ciclos;

import java.util.Scanner;

public class Ciclos10_AXL {

	public static void main(String[] args) {
		// 10. Programa que lea 20 números e indique si son positivos o negativos 
		//y pares o impares y además muestre la sumatoria de los positivos 
		//y sumatoria de los impares.
		
		Scanner leer = new Scanner(System.in);
        int numero;

        do {

            System.out.print("Introduce un número (0 para acabar): ");                                  
            numero = leer.nextInt();

            if (numero != 0) {
                if (numero > 0) {
                    System.out.print("Positivo");
                } else {
                    System.out.print("Negativo");
                }
                if (numero % 2 == 0) {
                    System.out.println(" Par");
                } else {
                    System.out.println(" Impar");
                }
            }

        } while (numero != 0);

	}

}
