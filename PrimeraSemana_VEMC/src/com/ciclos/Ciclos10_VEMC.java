package com.ciclos;

import java.util.Scanner;

public class Ciclos10_VEMC {

	public static void main(String[] args) {
// Programa que lea 20 n�meros e indique si son positivos o negativos y pares o impares.
//y adem�s muestre la sumatoria de los positivos y sumatoria de los impares.
		
Scanner input = new Scanner (System.in);
int sumaPositivos = 0;
int sumaImpares = 0;

for (int i = 1; i <= 20; i ++) {//inicia la viariable en 1 hasta que sea menor igual a 20, y va contando
	System.out.println("Ingresa el n�mero " + i + ": ");
	if (input.hasNextInt()) {
		int numero = input.nextInt();
		
		if (numero >= 0) { //mayor igual a 0
			System.out.println("El n�mero " + numero + " es positivo.");
			sumaPositivos += numero;
			
		}else {
			System.out.println("El n�mero " + numero + " es negativo.");
		}
		if (numero % 2 == 0) {//corrobora si hay residuos para indenditicar par o impar.
			System.out.println("El n�mero " + numero + " es par.");
		}else {
			System.out.println("El n�mero " + numero + " es impar.");
			sumaImpares += numero;
		}
		System.out.println();
	}else {
		System.out.println("ERROR: Debes ingresar un n�mero entero.");
		input.next();//limpiamos el buffer
		i --;//Repetir iteracion
		
	}
}
System.out.println("Sumatoria de los n�meros positivos: " + sumaPositivos);
System.out.println("Sumatoria de los n�meros impares: " + sumaImpares);
	input.close();
	}


}
