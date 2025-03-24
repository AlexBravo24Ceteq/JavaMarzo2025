package com.ciclos;

import java.util.Scanner;

public class Ciclos4_AXL {

	public static void main(String[] args) {
		//4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.
		
		Scanner reader = new Scanner(System.in);
        String frase = "";
        char letra = ' ';
        int contador = 0;
        System.out.println("Ingresa una frase");
        frase = reader.nextLine();
        System.out.println("Ingresa una letra");
        letra = reader.nextLine().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == letra) contador++;
        }
        if(contador == 0) System.out.println("La letra que ingreso no se encuentra en la frase");
        else if(contador == 1) System.out.println("Solo hay una letra en la frase");
        else System.out.println("La letra '" + letra + "' se repite " + contador + " veces");

	}

}
