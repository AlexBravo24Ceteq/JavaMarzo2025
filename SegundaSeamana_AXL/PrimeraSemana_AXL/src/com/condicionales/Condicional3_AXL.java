package com.condicionales;

import java.util.Scanner;

public class Condicional3_AXL {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el 
		//segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner scanner = new Scanner (System.in);
	    int divisor;
	    int dividendo;
	    
	// Solicitar los numeros al usuario
	    System.out.println("Mostrar la division entre dos n�meros enteros");
	    System.out.print("Introduce el primer n�mero: ");
	    divisor = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    dividendo = scanner.nextInt();
	    
	// Aqui se realiza la operacion y se mostrara el resultado en la pantalla
	    if (dividendo != 0){
	        System.out.println((double)divisor/(double)dividendo);
	    }else {
	        System.out.println("El segundo n�mero introducido es 0 " + "Introduzca un n�mero v�lido.");
	    } 
	    
	    scanner.close();

	}

}
