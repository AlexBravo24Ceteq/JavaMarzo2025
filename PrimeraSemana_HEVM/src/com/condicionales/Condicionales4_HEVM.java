package com.condicionales;

import java.util.Scanner;

public class Condicionales4_HEVM {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		  Scanner input = new Scanner (System.in);

		    System.out.print("Introduce la cadena que desees y te diermos si es mayuscula o minuscula");
		    String cadena = input.next();
		    
		    
		    //Java comparar� los caracteres asign�ndoles su valor ASCII, 
		   //A a la Z est�n todas de forma correlativa, desde el n�mero 65 al 90. 
		    
		    if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra may�scula");
		   // }else if ((cadena > "A") && (cadena < "Z")) {
		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra may�scula.");
		    }else {
		        System.out.println("La cadena no es una letra may�scula.");
		    }

	}

}
