package com.arrays;

public class Array4_HEVM {

	public static void main(String[] args) {
		/*Dado un array de n�meros de 5 posiciones con los siguientes valores:
		*{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		*los valores invertidos, es decir, que el segundo array deber� tener los valores
		*{5,4,3,2,1}.
		*/
		
		int [] numeros = {1, 2, 3, 4, 5};
		int [] numerosInvertidos = new int [numeros.length];
		int j = 0;
		
		for (int i = numeros.length; i > 0; i--) {
			numerosInvertidos[j] = i;
			j++;
			
		}for (int i:numerosInvertidos) {
			System.out.print(i + " ");

	}
	}
}
