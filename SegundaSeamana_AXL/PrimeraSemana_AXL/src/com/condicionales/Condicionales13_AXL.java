package com.condicionales;

import java.util.Scanner;

public class Condicionales13_AXL {

	public static void main(String[] args) {
		// // // Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
	    //centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	      //Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
	      //y el resto se invierte en la bolsa.
	    //Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
	    //ni�os y el resto se invierte en la bolsa.
	    //La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		
		
		Scanner teclado = new Scanner(System.in);

      System.out.println("INSTITUTO");
      System.out.println("Ingresa el monto de la donaci�n:");
      double donacion = teclado.nextDouble();

      double centSalud, comeNinos, inversionBolsa;

      if (donacion >= 10000) {
          centSalud = donacion * 0.30;
          comeNinos = donacion * 0.50;
          inversionBolsa = donacion * 0.20;
          
      } else {
          centSalud = donacion * 0.25;
          comeNinos = donacion * 0.60;
          inversionBolsa = donacion * 0.15;
      }

      System.out.printf("Centro de salud: $%.2f%n", centSalud);
      System.out.printf("Comedor de ni�os: $%.2f%n", comeNinos);
      System.out.printf("Inversi�n en la bolsa: $%.2f%n", inversionBolsa);

	}

}
