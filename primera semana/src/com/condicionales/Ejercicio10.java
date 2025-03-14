package com.condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 12: ");
        int mes = scanner.nextInt();

        int dias;

        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2:  // Febrero
                dias = 28; // Normalmente 28 días, 29 en año bisiesto
                break;
            default:
                System.out.println("Número inválido. Debe ser entre 1 y 12.");
                return;
        }

        System.out.println("El mes " + mes + " tiene " + dias + " días.");

		
		
	}

}
