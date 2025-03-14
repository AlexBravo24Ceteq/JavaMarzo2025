package com.ciclos;

import java.util.Scanner;

public class Ciclos2_VEMC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
		// hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
Scanner input = new Scanner (System.in);
System.out.println("Introduce un número para generar su tabla de multiplicación: ");//solicitar al usuario un numero base
int numero = input.nextInt();
System.out.println("Introduce el número limite de la tabla: ");//solicitar el limite hasta cual multiplicar.
int limite = input.nextInt();
System.out.println("Tabla de multiplicar del " + numero + " hasta " + limite + ":");//muestra la tabla de multiplicar
for (int i = 1; i <= limite; i++) {
	int resultado = numero * i;
	System.out.println(numero + " x " + i + " = " + resultado);
	input.close();
}

	}

}
