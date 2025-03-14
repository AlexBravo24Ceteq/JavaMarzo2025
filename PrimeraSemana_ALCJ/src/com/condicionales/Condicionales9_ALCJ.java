package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ALCJ {

	public static void main(String[] args) {
		// 9.- Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		//introducimos otro número nos da un error.
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa un número del 1 al 7 para el dia de la semana:");
        int numeroDia = teclado.nextInt();

        String diaSemana;
        
        switch (numeroDia) {
        case 1:
            diaSemana = "Lunes";
            break;
        case 2:
            diaSemana = "Martes";
            break;
        case 3:
            diaSemana = "Miércoles";
            break;
        case 4:
            diaSemana = "Jueves";
            break;
        case 5:
            diaSemana = "Viernes";
            break;
        case 6:
            diaSemana = "Sábado";
            break;
        case 7:
            diaSemana = "Domingo";
            break;
        default:
            diaSemana = "ERROR: Número incorrecto. Debe ser un número del 1 al 7.";
            break;
            
	}
        System.out.println(diaSemana);

	 }
	
}
