package com.condicionales;

import java.util.Scanner;

public class Condicionales13_AXL {

	public static void main(String[] args) {
		// // // Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
	    //centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	      //Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
	      //y el resto se invierte en la bolsa.
	    //Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
	    //niños y el resto se invierte en la bolsa.
	    //La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		
		Scanner teclado = new Scanner(System.in);

      System.out.println("INSTITUTO");
      System.out.println("Ingresa el monto de la donación:");
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
      System.out.printf("Comedor de niños: $%.2f%n", comeNinos);
      System.out.printf("Inversión en la bolsa: $%.2f%n", inversionBolsa);

	}

}
