package com.condicionales;

import java.util.Scanner;

public class Condicionales9_ALCJ {

	public static void main(String[] args) {
		// 9.- Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		//introducimos otro n�mero nos da un error.
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa un n�mero del 1 al 7 para el dia de la semana:");
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
            diaSemana = "Mi�rcoles";
            break;
        case 4:
            diaSemana = "Jueves";
            break;
        case 5:
            diaSemana = "Viernes";
            break;
        case 6:
            diaSemana = "S�bado";
            break;
        case 7:
            diaSemana = "Domingo";
            break;
        default:
            diaSemana = "ERROR: N�mero incorrecto. Debe ser un n�mero del 1 al 7.";
            break;
            
	}
        System.out.println(diaSemana);

	 }
	
}
