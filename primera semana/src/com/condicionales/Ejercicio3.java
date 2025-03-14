package com.condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// PROGRAMA PARA REALIZAR DIVISION DE DOS NUMEROS
		Scanner scanner = new Scanner (System.in);
		
		//Solicitar el primer numero
		
		System.out.print(("Introduce el primer numero:");
		double num1 = scanner.nextDouble();
		
		//Solicitar el segundo numero
		
				System.out.print(("Introduce el segundo numero:");
				double num2 = scanner.nextDouble();
			
				
		//Verificar si el segundo numero es cero
				
		if (num2 == 0) {
			System.out.println ("Error:  No se puede dividir por cero");
			
		} else {
			//Calcular y mostrar el resultado de la division 
			double resultado = num1 / num2 
			System.out.println("El resultado de la division es:" + resultado);
			
		}
		//Cerrar el scanner
		scanner.close();
		
	}
	

}
