package com.ciclos;

import java.util.Scanner;

public class Ciclos4_ALCJ {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		//“Carácter no encontrado”.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("<<<<<<<<<<HOLA MIS AMORES>>>>>>>>>>");
		
		System.out.print("Escribe una oraciòn: ");
        String oracion = teclado.nextLine();
        
        System.out.print("Escribe una letra: ");
        char letra = teclado.next().charAt(0);
        
        oracion = oracion.toLowerCase();
        letra = Character.toLowerCase(letra);
        
        int contador = 0;
        
        for (int x = 0; x < oracion.length(); x++) {
            if (oracion.charAt(x) == letra) {
                contador++; 
            }

	}
        if (contador > 0) {
        	System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la oraciòn.");
        } else {
        	System.out.println("Caracter no encontrado :( ");
        	
        }

	}
}