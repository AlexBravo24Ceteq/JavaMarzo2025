package com.condicionales;

import java.util.Scanner;

public class Condicionales13_HEVM {

	public static void main(String[] args) {
		/*
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
		*centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		*Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
		*y el resto se invierte en la bolsa.
		*Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		*niños y el resto se invierte en la bolsa.
		*La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Calculemos cuanto dinero se destinara al comedor para niños " +
		" el centro de salud y la inversion en la bolsa.");
		System.out.println("Introduzca el monto de la donación");
		double donacion = input.nextDouble();
		
		if (donacion >= 10000) {
			double cs = donacion*.30;
			double cd = donacion*.50;
			double b = donacion*.20;
			
			System.out.println("Lo destinado al centro de salud sera de " + cs + " euros");
			System.out.println("Lo destinado al comedor para niños sera de " + cd + " euros");
			System.out.println("Lo destinado a invertirse en la bolsa sera de " + b + " euros");
		}else {
			double cs = donacion*.25;
			double cd = donacion*.60;
			double b = donacion*.15;
			
			System.out.println("Lo destinado al centro de salud sera de " + cs + " euros");
			System.out.println("Lo destinado al comedor para niños sera de " + cd + " euros");
			System.out.println("Lo destinado a invertirse en la bolsa sera de " + b + " euros");
		}
	}

}
