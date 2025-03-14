package com.condicionales;

		import java.util.Scanner;

public class Condicionales93_JAGR {
	
public static void main(String[] args) {
		
		//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días 
		//que tiene el mes correspondiente.
	//trabajo 10
	
		
		Scanner scanner = new Scanner(System.in);

	        // Solicitar el número del mes
	        System.out.print("Ingrese un numero de mes (1-12): ");
	        int mes = scanner.nextInt();

	        // Determinar el número de días según el mes
	        int dias;
	        switch (mes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                dias = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                dias = 30;
	                break;
	            case 2:
	                dias = 28; // No consideramos años bisiestos aquí
	                break;
	            default:
	                dias = -1; // Indica que el número es inválido
	                break;
	        }

	        // Mostrar el resultado
	        if (dias != -1) {
	            System.out.println("El mes " + mes + " tiene " + dias + " dias.");
	        } else {
	            System.out.println("Error: numero fuera de rango (1-12).");
	        }

	        scanner.close();
	    }
	}
	

	
	
	

