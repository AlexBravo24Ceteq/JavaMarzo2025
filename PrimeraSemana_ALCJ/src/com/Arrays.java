package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays de una dimension
		//tambien son conocidos como vectores son estructuras que nos van a permitir
		//almacenar un conjunto de datos de un tipo en comun
		//y una vez declarado su tamaño estos no pueden creccer en tiempo de ejecucion
		
		//Ej. declarando un array de numeros enteros con su tamaño inicial
		
		int [] numeros = new int [6]; //array de 5 elementos enteros
		
		//introducir valores en cada indice o posicion del array
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6; 
		
		
		//si necesitamos utilizar un valor de alguna posicion 
		//por ejemplo, mandarla a imprimir en cconsola
		//pues llamamos a ese indice
		System.out.println(numeros[2]);
		
		//Otra forma de declarar los arrays es ya con sus valores asignados desde un incio
		
		int [] numeros2 = {1,2,3,4,5,6};
		System.out.println(numeros2[3]);
		
		//vamos a ver que ocurre si mandamos o queremos imprimir todo el conjunto de datos
		System.out.println(numeros);

	}

}
