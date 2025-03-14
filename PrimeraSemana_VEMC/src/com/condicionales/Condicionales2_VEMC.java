package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VEMC {

	public static void main(String[] args) {
// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		int numero;
		Scanner input = new Scanner(System.in);//declaracion de la variable Scanner
		System.out.println("===INDICADOR DE NÚMEROS PARES E IMPARES===");
		System.out.println("Introduce un número: ");
		numero = input.nextInt();//se guarda el dato en la variable numero.
		//condicion si el numero se divide entre dos sin dejar residuo es par, sino es impar.
		if (numero % 2 == 0) {//condicion donde si devuelve un valor residuo es impar.
		System.out.println("El número " + numero + " es par.");
		}else{
		System.out.println("El número " + numero + " es impar.");
		}
	input.close();	
	}

}
