package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ALCJ {

	public static void main(String[] args) {
		//3.- Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el
		//segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner teclado = new Scanner (System.in);
		
	   System.out.println("Hola mi nombre es Am�rica");
	   System.out.println("Ingresa el primer numero (dividendo):");
	   double numero1 = teclado.nextDouble();
	   
	   System.out.println("Ingresa el segundo numero (divisor):");
	   double numero2 = teclado.nextDouble();
	   
	   if (numero2 == 0) {
		   System.out.println("Error: No se puede dividir entre 0");
		   
	   } else {
		   double resultado = numero1 / numero2;
		   System.out.println("El resultado de la division es: " + resultado);
	   }

	}

}
