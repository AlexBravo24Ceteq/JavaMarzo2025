package com.pruebas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// 
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Ingresa cuantos Carros vendio al mes:");
		int vendio=input.nextInt();
		System.out.println("Ingresa el precio:");
		int precio=input.nextInt();
		
		int inicial = 1000;
		int comicion= 150;
		double ventaCarro= 0.05;
		
		double sum= precio * ventaCarro;
		
		int suma= (int) (inicial +  (vendio * comicion )+sum);
		
		System.out.println(suma);
		//1000+ 300 + 10000

	}

}
