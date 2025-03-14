package com.condicionales;

import java.util.Scanner;

public class condicionales9_JAGR {

	public static void main(String[] args) {
		

		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
		//Si introducimos otro número nos da un error.
		//trabajo 9

		
		Scanner scanner = new Scanner(System.in);

        // Solicitar numero del dia de la semana
        System.out.print("Ingrese un numero del 1 al 7: ");
        int numero = scanner.nextInt();

        // Determinar el día de la semana
        String dia;
        switch (numero) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miercoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sabado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Error: numero fuera de rango (1-7)."; break;
        }

        // Mostrar el resultado
        System.out.println(dia);

        scanner.close();
    }
}
	


