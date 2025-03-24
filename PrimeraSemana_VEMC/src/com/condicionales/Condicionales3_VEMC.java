package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VEMC {

	public static void main(String[] args) {
//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
int numero1; 
int numero2;
int division;
Scanner input = new Scanner(System.in);
System.out.println("===DIVISIÓN===");
System.out.println("Introduce el primer número: ");//solicitar primer numero
numero1 = input.nextInt();
System.out.println("Introduce el segundo número: ");//solicitar segundo numero
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
