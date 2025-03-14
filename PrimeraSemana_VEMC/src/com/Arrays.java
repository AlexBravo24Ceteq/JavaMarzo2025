package com;

public class Arrays {

	public static void main(String[] args) {
// Los Arrays (Arreglos) de una dimension son conocidos como vectores y son estructuras que permiten almacenar un conjunto de datos de un mismo tipo.
//Una vez declarado el tamaño estos no pueden crecer en tiempo de ejecucucion.

		//Ej. declarando un array de numeros enteros con su tamaño inicial
		
		int[] numeros = new int [6];// un array de 5 elementos enteros.
		
		//Introducir valores en cada indice o posicion del array.
//		numeros [0] = 1;
//		numeros [1] = 2;
//		numeros [2] = 3;
//		numeros [3] = 4;
//		numeros [4] = 5;
		
		numeros [5] = 154;
		numeros [1] = 1000;
		numeros [0] = 5;
		numeros [2] = 6;
		numeros [4] = 254;
		numeros [3] = 101;
		
		
////Si necesitamos utilizar algun valor de alguna posicion
//Ej. mandar a imprimir el valor a consola, lo llamamos desde su indice.
		System.out.println(numeros[5]);
	
		
//Otra forma de declarar Arrays es ya con sus valores asignados desde el inicio
		int [] numeros2 = {1,2,3,4,5,6};
		int [] numeros3 = {3,54,68,4,100,5};
		
		System.out.println(numeros3[2]);
//Ej. array de caracteres
		char [] nombre = {'v','e','m','c'};
		
		System.out.println(nombre [3]);
		
//Ej. array de Strings
		String [] nombres = {"Victor","Guillermo", "America","Jorge","Alexandra"};
		System.out.println(nombres[1]);
		
		
//Ej. Que ocurre si mandamos o queremos imprimir todo el conjunto de datos.
		System.out.println(numeros);
		System.out.println(nombre);//el array de caracteres si lo manda a imprimir  como si fuera un string en consola
		System.out.println(nombres);
	
//para poder imprimir o recorrer todo en un array podemos hacerlo mediante un ciclo for especificando desde que posicion iniciar.
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + " ");
			
		}
		System.out.println();
//Imprimir los valores de un array utilizando otro cilco que se llama (for each).
//Este ciclo puede mandar a imprimir si o si cada elemento.
		System.out.println("Imprimiendo Array con for each");
		
		for(String i:nombres) { //Para cada String del array nombres
			System.out.println(i);//madanmos a imprimir cada elemento en una nueva linea
		}
		
		System.out.println("Imprimiendo Array de numeros con for each");
		for(int i:numeros) {
			System.out.println(i);
		}
	}

}
