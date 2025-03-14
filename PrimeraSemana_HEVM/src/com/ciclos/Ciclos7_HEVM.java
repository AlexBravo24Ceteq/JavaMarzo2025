package com.ciclos;

public class Ciclos7_HEVM {

	public static void main(String[] args) {
		/*
		 * - Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		 *mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		 *dinero?
		 */
		
		double inversion = 700;
		int mes = 0;
		
		while (inversion < 1500) {
		double interes = inversion*0.02;
		inversion = inversion + interes;
		mes++;
		System.out.println("Su dinero en el mes " + mes + " es de " + inversion);
		}
		System.out.println("La cantidad de meses para que su inversion supere los $1500 es de " + mes);
	}
}
