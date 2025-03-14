package com.ciclos;

import java.util.Scanner;

public class Ciclos12_ALCJ {

	public static void main(String[] args) {
		//12.-  Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//cuando el promedio de las edades sea superior a 25.
	
        Scanner teclado = new Scanner(System.in);

        int sumaEdades = 0; 
        int cantidadPersonas = 0; 
        double promedio = 0;
        
     
        while (promedio <= 25) {
            System.out.print("Ingresa la edad de la persona " + (cantidadPersonas + 1) + ": ");
            int edad = teclado.nextInt();
            sumaEdades += edad;  
            
            cantidadPersonas++;

            promedio = (double) sumaEdades / cantidadPersonas;

            System.out.println("Promedio actual: " + promedio);
        }
        System.out.println("El promedio de las edades es mayor a 25.");
        System.out.println("Total de personas ingresadas: " + cantidadPersonas);
        System.out.println("Promedio final: " + promedio);

        teclado.close();
		
		

	}

}
