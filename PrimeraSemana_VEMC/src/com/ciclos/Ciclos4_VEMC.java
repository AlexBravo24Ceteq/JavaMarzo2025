package com.ciclos;

import java.util.Scanner;

public class Ciclos4_VEMC {

	public static void main(String[] args) {
//Programa que reciba una frase y una letra por teclado. 
//Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
Scanner input = new Scanner (System.in);
System.out.println("Introduce una frase: ");//solicitar ingresar una frase.
String frase = input.nextLine();
System.out.println("Introduce una letra: ");//solicita ingresar una letra
char letra = input.next().charAt(0); //lee el primer caracter ingresado
int contador = contarLetra(frase, letra);//cuenta la cantidad de veces que aparece la letra en la frase.
//mostrar resultado
if (contador > 0) {
	System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
}else {
	System.out.println("Carácter no encontrado.");
}
input.close();
	}

//metrodo para contar  la cantidad de veces que aparece una letra en una frase
public static int contarLetra(String frase, char letra) {
	int contador = 0;
	frase = frase.toLowerCase(); //convierte la frase en minuscula.
	letra = Character.toLowerCase(letra);//convierte la letra en minuscula
//Recorrer la frase y contar las condicionales
	for (int i = 0; i < frase.length(); i++) {
		if (frase.charAt(i) == letra) {
			contador++;
			
		}
	}
	return contador;

	}

}
