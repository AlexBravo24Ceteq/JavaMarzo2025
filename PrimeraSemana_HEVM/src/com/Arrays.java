package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays o arreglos de una dimension también son conocidos como vectores
		//Son estructuras que nos van a permitir almacenar un conjunto de datos de un tipo en comun
		//y una vez declarado su tamaño, estos no pueden crecer en tiempo de ejecución
		
		//Ejemplo, declarando un array de numeros enteros con su tamaño inicial
		
		int [] numeros = new int [5]; //un array de 5 elementos enteros
		
		//Introducir valores en cada indice o posicion del array
		
		numeros[0] = 1; //aqui declaramos en que posicion del array queremos guardar el valor
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;

		//Si necesitamos un valor de alguna posicion
		//Por ejemplo, mandarla a imprimir en consola, pues llamamos a ese indice
		
		System.out.println(numeros[2]);
		
		//Otra forma de declarar los array es ya con sus valores asignados desde un inicio
		
		int [] numeros2 = {1, 2, 3, 4, 5, 6};
		System.out.println(numeros2[4]);
		
		//Otros tipos de array
		char[] letras = {'J','O', 'S', ';', ' '};
		String [] nombres = {"Alexandra", "Pablo", "Juan", "Fabiola", "Daniela"};
		
		//vamos a ver que ocurre si mandamos o queremos imprimir el conjunto de datos
		System.out.println(numeros);
		System.out.println(letras); //el array de caracteres si lo manda a imprimir como si imprimiera un String en consola
		System.out.println(nombres);
		
		//Para poder imprimir o recorrer todo un array podemos hacerlo mediante un ciclo for
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " ");
		}
		System.out.println();
		//imprimir los valores de un array utilizando otro ciclo que se llamafor each
		//El ciclo For each puede mandar a imprimir si o si cada elemento
		System.out.println("Imprimiendo Array con for each");
		for(String i:nombres) { //para cada elemento String del array nombres
			System.out.println(i); //mandamos a imprimir cada elemento en una nueva linea
		}
		
		for (int i:numeros) {
			System.out.println(i);
		}
		}
		
	}


