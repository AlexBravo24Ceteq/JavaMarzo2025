package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los arrays o arreglos de una dimension
		//también son conocidos como vectores
		// Son estructuras que nos van a permitir almacenar
		//un conjunto de datos de un tipo en común
		//Y una vez declarado su tamaño estos no pueden crecer en tiempo
		//de ejecución
		
		//Ej. declarando un array de numeros enteros con su tamaño inicial
		
		int [] numeros = new int [6]; //un array de 5 elementos enteros
		
		//Introducir valores en cada indice o posición del array
		
//		numeros[0] = 1;
//		numeros[1] = 2;
//		numeros[2] = 3;
//		numeros[3] = 4;
//		numeros[4] = 5;
//		numeros[5] = 6;
		
		numeros[5] = 10;
		numeros[1] = 3;
		numeros[0] = 6;
		numeros[2] = 100;
		numeros[3] = 1000;
		numeros[4] = 1;
		
		
		//Si necesitamos utilizar un valor de alguna posicion
		//Por ejemplo, mandarla a imprimir en consola, pues llamamos a ese 
		//indice
		System.out.println(numeros[5]);
		
		//Otra forma de declarar los Arrays es ya con sus valores asignados
		//desde un inicio
		
		int [] numeros2 = {3, 5, 1, 9, 2, 7};
		
		System.out.println(numeros2[3]);
		
		//Ej. Un array de caracteres
		
		char[] nombre = {'J', 'O', '$', ';', ' '};
		
		//Ej. un Array de Strings
		
		String[] nombres = {"Alexandra", "Guillermo", "Victor", "America", "Jorge"};
		
		System.out.println(nombres[0]);
		
		//Vamos a ver que ocurre si mandamos o queremos imprimir todo el conjunto de datos
		System.out.println(numeros);
		System.out.println(nombre); //el array de caracteres si lo manda a imprimir como
		//si imprimieramos un String en consola
		System.out.println(nombres);
		
		//Para poder imprimir o recorrer todo un array podemos hacerlo mediante un
		//ciclo for
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + " ");
		}
		System.out.println();
		//Imprimir los valores de un array utilizando otro ciclo que se llama for each
		//El ciclo for each puede mandar a imprimir si o si cada elemento
		System.out.println("Imprimiendo Array con for each");
		
		for (String i:nombres) { //para cada elemento String del array nombres
			System.out.println(i); //mandamos a imprimir cada elemento en una nueva linea
		}
		
		System.out.println("Imprimendo Array de numeros con for each");
		
		for (int i:numeros) {
			System.out.println(i);
		}

		
	}

}
