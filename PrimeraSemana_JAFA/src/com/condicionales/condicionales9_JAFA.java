package com.condicionales;

import java.util.Scanner;

public class condicionales9_JAFA {

	public static void main(String[] args) {
//		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//		introducimos otro número nos da un error

		
		Scanner input = new Scanner(System.in);
		int resultado;
		
		System.out.println("Ingresa un nuemro del (1-7): ");
		resultado= input.nextInt();
		
		 String DiaDeSemana = "";
		
		switch (resultado) {
		case 1:
			DiaDeSemana= "Lunes";
			break;
		case 2:
			DiaDeSemana= "Martes";
			break;
		case 3:
			DiaDeSemana= "Miercoles";
			break;
		case 4:
			DiaDeSemana= "Jueves";
			break;
		case 5:
			DiaDeSemana= "Viernes";
			break;
		case 6:
			DiaDeSemana= "Sabado";
			break;
		case 7:
			DiaDeSemana= "Domingo";
			break;

		default:
			System.out.println("ERROR: Introduce un numero del 1 al 7");
			break;
		}
		
		System.out.println( DiaDeSemana);
	}

}
