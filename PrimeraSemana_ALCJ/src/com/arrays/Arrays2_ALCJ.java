package com.arrays;

public class Arrays2_ALCJ {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
	        
	        
	        for (int x = 0; x < numeros.length; x++) {
	            numeros[x] = x + 1; 
	        }
	        
	        
	        int suma = 0;
	        for (int x = 0; x < numeros.length; x++) {
	            suma += numeros[x];
	        }
	        
	      
	        double media = (double) suma / numeros.length;
	        
	        System.out.println("La suma de los n�meros del 1 al 100 es: " + suma);
	        System.out.println("La media de los n�meros del 1 al 100 es: " + media);

	}

}
