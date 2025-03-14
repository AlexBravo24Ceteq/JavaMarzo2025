package com.condicionales;

import java.util.Scanner;

public class Condicionales13_VEMC {

	public static void main(String[] args) {
	// Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
	//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
	//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
	//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

		Scanner input = new Scanner (System.in);
		
		
		//solicitar el monto de donacion
		System.out.println("Introduce el monto que deseas donar: ");
		double donacion = input.nextDouble();
		double centroSalud,  comedorNi�os,  inversionBolsa;//creamos las variables destinadas para cada rublo
		
		//Determinar la distribucion segun la donaci�n
		if(donacion >= 10000) {
			centroSalud = donacion * 0.30;//30% al centro de salud.
			comedorNi�os = donacion * 0.50;//50% al comedor de ni�os
			inversionBolsa = donacion * 0.20;//20% se invierte
		}else{
			centroSalud = donacion * 0.25;
			comedorNi�os = donacion * 0.60;
			inversionBolsa = donacion * 0.15;
		}
		//Mostrar los montos destinados a cada rublo
		System.out.println("\nDistribuci�n de la donaci�n: ");
		System.out.printf("Centro de Salud: $%.2f\n", centroSalud);
		System.out.printf("Comedor de los Ni�os: $%2f\n", comedorNi�os);
		System.out.printf("Inversi�n en la Bolsa: $%2f\n", inversionBolsa);
		input.close();
	}

}
