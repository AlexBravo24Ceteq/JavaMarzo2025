package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AXL {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
		//correspondiente. Si introducimos otro n�mero nos da un error. 
		
		Scanner scanner = new Scanner(System.in);
	    int dia;
	    
	
	    // Se realiza la solicitud de datos al usuario
	    System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
	    System.out.println("1 Lunes");
	    System.out.println("2 Martes");
	    System.out.println("3 Mi�rcoles");
	    System.out.println("4 Jueves");
	    System.out.println("5 Viernes");
	    System.out.println("6 S�bado");
	    System.out.println("7 Domingo");
	    dia = scanner.nextInt();
	    
	    
	// Se selleciona la opcion, para demostrar el dia
	    switch (dia) {
	    case 1:
	      System.out.println("Dia LUNES");
	      break;
	    case 2:
	      System.out.println("Dia MARTES");
	      break;
	    case 3:
	      System.out.println("Dia MI�RCOLES");
	      break;
	    case 4:
	      System.out.println("Dia JUEVES");
	      break;
	    case 5:
	      System.out.println("Dia VIERNES");
	      break;
	    case 6:
	      System.out.println("Dia S�BADO");
	      break;
	    case 7:
	      System.out.println("Dia DOMINGO");
	      break;
	    default:
	      System.out.println("ERROR: n�mero incorrecto.");
	    }

	}

}
