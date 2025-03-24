package com.condicionales;

import java.util.Scanner;

public class condicionales13_JAFA {
	public static void main(String[] args) {
//		//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			niños y el resto se invierte en la bolsa.
//			La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		
		Scanner input = new Scanner(System.in);
		
		double donacion;
		
		System.out.println("Ingresa en monto para la donación: ");
		donacion= input.nextDouble();
		
		double  centroSalud= 0;
		double comedor= 0;
		double bolsa= 0; 
		
		if(donacion >=10000) {
			centroSalud = donacion * 0.30;
			comedor = donacion * 0.50;
			bolsa = donacion - centroSalud - comedor;
		}
		else {
			centroSalud = donacion * 0.25;
			comedor= donacion * 0.60;
			bolsa= donacion - centroSalud - comedor;
		}
		
		System.out.println("Distribucion de la donación");
		System.out.println("Centro de salud: $ "+ centroSalud);
		System.out.println("Comedor de niño: $ " + comedor);
		System.out.println("Inversion en la bolsa: $ "+ bolsa);
		
	}

}
