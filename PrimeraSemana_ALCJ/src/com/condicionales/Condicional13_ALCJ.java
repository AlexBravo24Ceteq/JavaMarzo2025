package com.condicionales;

import java.util.Scanner;

public class Condicional13_ALCJ {

	public static void main(String[] args) {
		// Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
		//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	    //Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
	    //y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		//niños y el resto se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<INSTITUTO ESPAÑOL>>>>");
        System.out.println("Ingresa el monto de la donación:");
        double donacion = teclado.nextDouble();

        double centroSalud, comedorNinos, inversionBolsa;

        if (donacion >= 10000) {
            centroSalud = donacion * 0.30;
            comedorNinos = donacion * 0.50;
            inversionBolsa = donacion * 0.20;
            
        } else {
            centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.60;
            inversionBolsa = donacion * 0.15;
        }

        System.out.printf("Centro de salud: $%.2f%n", centroSalud);
        System.out.printf("Comedor de niños: $%.2f%n", comedorNinos);
        System.out.printf("Inversión en la bolsa: $%.2f%n", inversionBolsa);
    }


	}


