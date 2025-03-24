package com.arrays;

import java.util.Scanner;

public class Array3_VEMC {

	public static void main(String[] args) {
// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
Scanner input = new Scanner (System.in);//creamos el objeto Scanner para leer los datos en consola.

//solicitamos una frase
System.out.println("Introduce una frase: ");
String frase = input.nextLine();

//convertir la frase en un array de caracteres
char[] caracteres = frase.toCharArray();//Usamos el método toCharArray() de la clase String para convertir la frase en un array de caracteres.
//Este método devuelve un array de tipo char[] donde cada elemento es un carácter de la frase.

//Mostrar el array de caracteres.
System.out.println("\nArray de caracteres:");
for (int i = 0; i < caracteres.length; i++) {//Usamos un bucle for para recorrer el array de caracteres y mostrar cada carácter junto con su índice.
	System.out.println("Indice " + i + ": " + caracteres[i]);
	
}

input.close();

	}

}
