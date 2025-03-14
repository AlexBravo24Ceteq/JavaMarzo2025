package com.arrays;

public class Arrays2_HEVM {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		double suma = 0;
		
		int [] numeros = new int [100];
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
			suma = suma + i + 1;
			}for (int i:numeros) {
				System.out.print(i + " ");
				}
			double media = suma/100;
			System.out.println();
			System.out.println("La suma de los números del 1 al 100 es: ");
			System.out.println(suma);
			System.out.println("Y el promedio de esa suma es: ");
			System.out.println(media);
	}

}
