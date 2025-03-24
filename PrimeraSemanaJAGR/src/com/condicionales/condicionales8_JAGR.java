package com.condicionales;

	import java.util.Scanner;

public class condicionales8_JAGR {

	public static void main(String[] args) {
		

		 Scanner scanner = new Scanner(System.in);

	        // Solicitar numero del dado
	        System.out.print("Ingrese el resultado del dado (1-6): ");
	        int numeroDado = scanner.nextInt();

	        // Determinar la cara opuesta en letras
	        String caraOpuesta;

	        switch (numeroDado) {
	            case 1: caraOpuesta = "6"; break;
	            case 2: caraOpuesta = "5"; break;
	            case 3: caraOpuesta = "4"; break;
	            case 4: caraOpuesta = "3"; break;
	            case 5: caraOpuesta = "2"; break;
	            case 6: caraOpuesta = "1"; break;
	            
	          //  case 1: caraOpuesta = "Seis"; break;
	          //  case 2: caraOpuesta = "Cinco"; break;
	          //  case 3: caraOpuesta = "Cuatro"; break;
	          //  case 4: caraOpuesta = "Tres"; break;
	          //  case 5: caraOpuesta = "Dos"; break;
	          //  case 6: caraOpuesta = "Uno"; break;
	            
	            default: 
	                caraOpuesta = "ERROR: numero incorrecto"; 
	                break;
	        }

	        // Mostrar resultado
	        System.out.println(caraOpuesta);

	        scanner.close();
	    }
	}	

	
