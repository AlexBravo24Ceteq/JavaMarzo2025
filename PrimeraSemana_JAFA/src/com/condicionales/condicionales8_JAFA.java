package com.condicionales;

import java.util.Scanner;

public class condicionales8_JAFA {

	public static void main(String[] args) {
		
		
//		// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
//		“ERROR: número incorrecto”.
		
		Scanner input = new Scanner(System.in);
		int resultado;
		
		System.out.println("Ingrese el resultado del dado (1-6): ");
		resultado=input.nextInt();
		
		String opuesto =""; // variable para almacenar el numero opuesto en letra
		
		switch (resultado) {
		case 1:
			opuesto= "Seis";
			break;
		case 2:
			opuesto= "Cinco";
			break;
		case 3:
			opuesto= "Cuatro";
			break;
		case 4:
			opuesto= "Tres";
			break;
		case 5:
			opuesto= "Dos";
			break;
		case 6:
			opuesto= "Uno";
			break;

		default:
			System.out.println("ERROR: numero incorrecto");
			break;
		}
		
		System.out.println(opuesto);

	}

}
