package com.condicionales;

import java.util.Scanner;

public class condicionales13_JAFA {
	public static void main(String[] args) {
//		//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//			y el resto se invierte en la bolsa.
//			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//			ni�os y el resto se invierte en la bolsa.
//			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		
		Scanner input = new Scanner(System.in);
		
		double donacion;
		
		System.out.println("Ingresa en monto para la donaci�n: ");
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
		
		System.out.println("Distribucion de la donaci�n");
		System.out.println("Centro de salud: $ "+ centroSalud);
		System.out.println("Comedor de ni�o: $ " + comedor);
		System.out.println("Inversion en la bolsa: $ "+ bolsa);
		
	}

}
