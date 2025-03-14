package com.condicionales;

import java.util.Scanner;

public class Condicionales13_VEMC {

	public static void main(String[] args) {
	// Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
	//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.
	//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.
	//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		Scanner input = new Scanner (System.in);
		
		
		//solicitar el monto de donacion
		System.out.println("Introduce el monto que deseas donar: ");
		double donacion = input.nextDouble();
		double centroSalud,  comedorNiños,  inversionBolsa;//creamos las variables destinadas para cada rublo
		
		//Determinar la distribucion segun la donación
		if(donacion >= 10000) {
			centroSalud = donacion * 0.30;//30% al centro de salud.
			comedorNiños = donacion * 0.50;//50% al comedor de niños
			inversionBolsa = donacion * 0.20;//20% se invierte
		}else{
			centroSalud = donacion * 0.25;
			comedorNiños = donacion * 0.60;
			inversionBolsa = donacion * 0.15;
		}
		//Mostrar los montos destinados a cada rublo
		System.out.println("\nDistribución de la donación: ");
		System.out.printf("Centro de Salud: $%.2f\n", centroSalud);
		System.out.printf("Comedor de los Niños: $%2f\n", comedorNiños);
		System.out.printf("Inversión en la Bolsa: $%2f\n", inversionBolsa);
		input.close();
	}

}
