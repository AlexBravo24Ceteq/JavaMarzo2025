package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VEMC {

	public static void main(String[] args) {
// 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		int numero;
		Scanner input = new Scanner(System.in);//declaracion de la variable Scanner
		System.out.println("===INDICADOR DE N�MEROS PARES E IMPARES===");
		System.out.println("Introduce un n�mero: ");
		numero = input.nextInt();//se guarda el dato en la variable numero.
		//condicion si el numero se divide entre dos sin dejar residuo es par, sino es impar.
		if (numero % 2 == 0) {//condicion donde si devuelve un valor residuo es impar.
		System.out.println("El n�mero " + numero + " es par.");
		}else{
		System.out.println("El n�mero " + numero + " es impar.");
		}
	input.close();	
	}

}
