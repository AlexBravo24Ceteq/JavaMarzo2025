package com.arrays;

public class Arrays2_JAFA {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.

		int [] numeros = new int [100];
		
		int contador=1;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= contador;
			contador++;
		}
		
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		int media = suma / numeros.length;
		
	System.out.println("La suma del 1 al 100: " + suma);
	System.out.println("La media del 1 al 100:" + media);
	}
	

}
