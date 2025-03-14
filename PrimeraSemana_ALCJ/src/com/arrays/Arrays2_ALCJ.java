package com.arrays;

public class Arrays2_ALCJ {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
	        
	        
	        for (int x = 0; x < numeros.length; x++) {
	            numeros[x] = x + 1; 
	        }
	        
	        
	        int suma = 0;
	        for (int x = 0; x < numeros.length; x++) {
	            suma += numeros[x];
	        }
	        
	      
	        double media = (double) suma / numeros.length;
	        
	        System.out.println("La suma de los números del 1 al 100 es: " + suma);
	        System.out.println("La media de los números del 1 al 100 es: " + media);

	}

}
