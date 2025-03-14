package com.condicionales;

import java.util.Scanner;

public class Condicionales10_ALCJ {

	public static void main(String[] args) {
		// 10.- Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		//mes correspondiente.
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<HOLO>>>>");
        System.out.println("Ingresa un número del 1 al 12 para el mes:");
        int numeroMes = teclado.nextInt();

        int dias;
        
        switch (numeroMes) {
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
            dias = 28; // Consideramos febrero no bisiesto
            break;
        default:
            dias = -1; // Valor inválido para manejar el error
            break;
    }

    if (dias == -1) {
        System.out.println("ERROR: Número incorrecto. Debe ser un número del 1 al 12.");
    } else {
        System.out.println("El mes " + numeroMes + " tiene " + dias + " días.");
    }

	}

}
