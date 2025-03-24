package com.arrays;

public class Arrays4_ALCJ {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}.
		
        int[] original = {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];
        
        for (int x = 0; x < original.length; x++) {
            invertido[x] = original[original.length - 1 - x];
        }
        
        System.out.println("Array original:");
        for (int x = 0; x < invertido.length; x++) {
        System.out.print(original[x] + " ");
        
        }
        System.out.println(); 
        
        System.out.println("Array invertido:");
        for (int x = 0; x < invertido.length; x++) {
        System.out.print(invertido[x] + " ");
            

	}

	}
}
