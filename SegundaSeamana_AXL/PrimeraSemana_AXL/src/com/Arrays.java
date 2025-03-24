package com;

public class Arrays {

	public static void main(String[] args) {
		// 13 de marzo del 2025
		
		
		//String representacion de un array de caracteres
		//ARRAYS o ARREGLOS de una dimension tamben son conocidos como vectores
		//que nos permiten alamacenar un conjunto de datos en un tiempo comun
        //y una vez declarado su tamaño estos no pueden crecer en tiempo de ejecucion
		
		
		//Ej. declarando un array de numeros con su tamaño inicial
		
		
		int [] numeros = new int  [6]; //un array de 6 elementos enteros
		
		//Introducir valores en cadaindice o posicion del array
		
//		numeros [0] = 1;
//		numeros [1] = 2;
//		numeros [2] = 3;
//		numeros [3] = 4;
//		numeros [4] = 5;
		
		
		numeros [5] = 10;
		numeros [1] = 3;
		numeros [0] = 6;
		numeros [3] = 100;
		numeros [2] = 1000;
		numeros [4] = 1;
		//Si necesitamos utilizar un valor de alguna posicion
		//Ej. mandarla a imprimir en consola pues llamamos
		//a ese indice
		
		System.out.println(numeros[5]);
		
		
		//Otra manera de declarar los Arrays es ya con sus valores
		//asignados desde un inicio
		
		int [] numeros2 = {3, 5, 1, 9, 2, 7};
		
		System.out.println(numeros2[3]);
		
		
		//Ej. array con caracteres osea letras
		char[] nombre = {'J', 'O', 'R', 'g', 'e'};
		
		
		//Ej un Array de String
		String[] nombres = {"Alexandra", "Valentin", "America", "Guillermo", "Victor"};
		System.out.println(nombres[0]);
		
		//Vamor a ver que pasa si mandamos o queremos imprimir todo el conjunto de datos
		System.out.println(numeros);
		System.out.println(nombre);//El array de caracteris si lo manda a imprimir, como si fuera un String
		//en consola
		System.out.println(nombres);
		
		
		//Para poder imprimir o recorrer todo un array podemos hacerlo
		//mediante un ciclo for
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " ");
		}
		
		
		//Opcion de imprimir los valores de un array utilizando un cillo llamado for-each
		//Este cilo puede mandar a imprimir si o si cada elemento
		
		System.out.println("Imprimiendo array for each");
		for (String i:nombres) { //para cada elemento del string del array nombres
			System.out.println(i);//mandamos a imprimir cada elemento en una vueva linea
			
		}
		
		System.out.println("Imprimiendo array de numeros con for each");
		for (int i:numeros) { 
			System.out.println(i);
		}
		
		
		
				

	}

}
