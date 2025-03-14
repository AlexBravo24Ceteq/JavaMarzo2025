package com.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un n�mero del 1 al 7: ");
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Mi�rcoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "S�bado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Error: N�mero fuera de rango. Debe ser un n�mero del 1 al 7.";
                break;
        }

        System.out.println(dia);

        scanner.close();
		
	}

}
