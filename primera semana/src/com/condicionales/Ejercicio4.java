package com.condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		

		        // Crear un objeto para leer la entrada del usuario
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese una cadena
		        System.out.print("Ingrese una cadena: ");
		        String cadena = scanner.nextLine();

		        // Verificar si la cadena es una única letra mayúscula
		        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
		            System.out.println("La cadena ingresada es una letra mayúscula.");
		        } else {
		            System.out.println("La cadena ingresada no es una letra mayúscula.");
		        }

		        // Cerrar el objeto Scanner
		        scanner.close();
		    }
		}
	
