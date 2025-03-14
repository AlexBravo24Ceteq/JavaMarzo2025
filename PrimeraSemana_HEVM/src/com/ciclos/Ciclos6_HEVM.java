package com.ciclos;

public class Ciclos6_HEVM {

	public static void main(String[] args) {
		/*
		 *Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		 *mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		 *todo el dinero lo reinvierte?
		 */
		double inversion = 1000;
		
		for (int i = 1; i <= 12; i++) {
			double interes = inversion*0.02;
			inversion = inversion + interes;
			System.out.println("su dinero al mes " + i + " es de " + inversion);
		}
		
		System.out.println("Su dinero al finalizar el a�o es de " + inversion + " pesos");
	}

}
