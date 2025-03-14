package com.pruebas;

import java.util.Scanner;

public class condicionales {
	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int num1 = input.nextInt();
		
		System.out.println("Ingrese un segundo numero ");
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println("EL primer numero es mayot");
		}
		else if(num1 < num2) {
			System.out.println("El segundo valor es mayor");
		}
		else if (num1 == num2){
		    System.out.println("Son iguales");
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}
