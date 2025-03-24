package com.condicionales;

import java.util.Scanner;

public class Condicionales13_Donacion_JAGR {

	public static void main(String[] args) {
		
		//Una institucion benefica recibe anualmente una donacion proveniente de Europa
		//Trabajo 13
		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar el monto de la donacion al usuario
	        System.out.print("Ingrese el monto de la donacion en dolares: ");
	        double donacion = scanner.nextDouble();

	        // Variables para los montos asignados
	        double centroSalud, comedorNinos, inversionBolsa;

	        // Determinar la distribucion segun el monto
	        if (donacion >= 10000) {
	            centroSalud = donacion * 0.30;
	            comedorNinos = donacion * 0.50;
	        } else {
	            centroSalud = donacion * 0.25;
	            comedorNinos = donacion * 0.60;
	        }
	        
	        inversionBolsa = donacion - (centroSalud + comedorNinos);
	        
	        // Mostrar resultados
	        System.out.println("Distribucion de la donacion:");
	        System.out.printf("Centro de salud: $%.2f\n", centroSalud);
	        System.out.printf("Comedor de niños: $%.2f\n", comedorNinos);
	        System.out.printf("Inversión en bolsa: $%.2f\n", inversionBolsa);
	        
	        scanner.close();

	}

}
