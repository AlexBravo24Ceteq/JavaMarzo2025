package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VEMC {

	public static void main(String[] args) {
//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
int numero1; 
int numero2;
int division;
Scanner input = new Scanner(System.in);
System.out.println("===DIVISI�N===");
System.out.println("Introduce el primer n�mero: ");//solicitar primer numero
numero1 = input.nextInt();
System.out.println("Introduce el segundo n�mero: ");//solicitar segundo numero
numero2 = input.nextInt();
if (numero2 == 0) {//condicion de comparacion del segundo numero a cero.
	System.out.println("ERROR: no se puede dividir entre cero.");
}else{
division = numero1 / numero2;//resultado de la division
System.out.println("El resultado es: " + division);	
}
input.close();
	}

}
