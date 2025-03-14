package com.condicionales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TABULADOR PARA EQUIPAJE EN AEROLINEA

		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu destino de viaje: ");
        int destino = scanner.nextInt();

        

        switch (destino) {
            case 1:  // America del Norte
            case 2:  // America Central
            case 3:  // America del sur
            case 4:  // Europa
            case 5:  // Asia
            
              
                break;
            
                
            default:
                System.out.println(" Ingresa tu Número de kilos de tu equipaje:");
                int kilos = scanner.nextInt();

        
                
            default:
                kilos => 5; 
                System.out.println ("Error: Número fuera de rango. Debe ser un número del 1 al 7.");
                
                break;
        }
        

        System.out.println("El mes " + mes + " tiene " + dias + " días.");

		
		
	}

}
