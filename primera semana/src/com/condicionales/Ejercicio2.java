package com.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio  donde se solicita un número por teclado y nos indique si es par o impar

Scanner scanner = new Scanner (System.in);

//Solicitar al usuario el numero
System.out.print("introduce un numero: ");
int numero = scanner.nextInt();

//Determinar si el numero es par o impar
if (numero % 2 == 0) {
	System.out.println ("El numero " + numero + "EL numero es par");
	
}else {
	System.out.println ("El numero " + numero + "EL numero es impar");
}
	scanner.close();
	}
}

