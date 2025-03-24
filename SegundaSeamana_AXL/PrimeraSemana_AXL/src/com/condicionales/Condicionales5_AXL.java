package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AXL {

	public static void main(String[] args) {
		/*5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
		par�metros: edad, nota y sexo. 
		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA 
		*/
		
		Scanner scanner = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;
	    
	// Solicitar los datos al usuario
	    System.out.println("Aceptaci�n de una solicitud" + " en base a los siguientes par�metros:");
	    System.out.print("Edad: ");
	    edad = scanner.nextInt();
	    System.out.print("Nota: ");
	    nota = scanner.nextInt(); scanner.nextLine();
	    System.out.print("Sexo (M o F): ");
	    sexo = scanner.nextLine();
	    
	// Aqui se vera si es aceptada segun sus datos ingresados y se hara el calculo
	    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	      System.out.println("El valor de sexo introducido es incorrecto.\n"
	          + "por favor, reenv�e el formulario.");
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }

	}

}
