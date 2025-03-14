package com.ciclos;

import java.util.Scanner;

public class Ciclos9_HEVM {

	public static void main(String[] args) {
		//Programa Java que lea dos números y muestre los números pares entre ellos 
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero");
		int numero1 = input.nextInt();
		
		System.out.println("Ingrese otro numero entero");
		int numero2 = input.nextInt();
		
		int residuo = 0; 
		
		if (numero1 > numero2 && numero1%2 == residuo) {
			for (int i = numero2 ; i <= numero1 ; i+=2) {
				System.out.println(i);
			}
			}else if (numero1 > numero2 && numero1%2 != residuo) {
				for (int i = numero2 + 1; i <= numero1 ; i+=2) {
					System.out.println(i);
					}
			}else if (numero1 < numero2 && numero1%2 == residuo) {
				for (int i = numero1; i <= numero2 ; i+=2) {
					System.out.println(i);
				}
			}else if (numero1 < numero2 && numero1%2 != residuo) {
				for (int i = numero1 + 1 ; i <= numero2 ; i+=2) {
					System.out.println(i);
				}
		}

	}

	}

