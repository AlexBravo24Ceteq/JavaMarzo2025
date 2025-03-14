package com.ciclos;

import java.util.Scanner;

public class Ciclos8_VEMC {

	public static void main(String[] args) {
// Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el mayor.
Scanner input = new Scanner (System.in);

System.out.println("Ingresa el primer n�mero: ");
int numero1 = input.nextInt();

System.out.println("Ingresa el segundo n�mero: ");
int numero2 = input.nextInt();

//determinar el menor y el mayor.
int menor = Math.min(numero1, numero2);//obtiene el numero menor.
int mayor = Math.max(numero1, numero2);//obitiene el numero mayor.


//mostrar n�meros de menor a mayor
System.out.println("N�meros desde " + menor + " hasta " + mayor + ":");
for (int i = menor; i <= mayor; i ++) {//el bucle recorre desde el menor hasta el mayor
	System.out.println(i +" ");//, en cada iteracion se imprime el valor de i
	input.close();
}

	}

}
