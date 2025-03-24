package com.ciclos;

public class Ciclos1_VEMC {

	public static void main(String[] args) {
// Programa un algoritmo que realice la tabla de multiplicar del  12.
int numero = 12;//numero a multiplicar
int i = 1;//contador
System.out.println("Tabla de multiplicar del " + numero +": ");
//Ciclo while para generar una tabla
while (i <= 10) {
	int resultado = numero * i;
	System.out.println(numero +" x " + i + " = " + resultado);
	i ++;//termina el ciclo.

	
}

	}

}
