package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		
		// Array de dos dimensiones. Es una estructura mas amplia
		//En lugar de almacenar valores en forma de "fila"
		//Vamos a contar con otra dimension para asi tener una estructura en forma de tabla.
		//a este Array se le conoce como "Matriz".
		
		
		//Ej, Array dos dimensiones de numeros enteros
		
		int [] [] matriz = new int [3] [3];//[filas] [columnas]
		
		//Llenar los espacios de una matriz o array bidimensional(dos dimensiones)
		
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9;
		
		//Ej. crear una matriz con los valores asignados desde un inicio.
		
		int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		//Ej. si quiero imprimir o utilizar un solo valorde una matriz.
		System.out.println(matriz[1][2]);
		System.out.println();
		
		//Ej. de imprimir un array de dos dimensiones con dos ciclos anidados.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
			
			//podemos tener un array que contenga  mas de un tipo de dato?
			//es decir que contenga int, double, String, etc.
			
			Object nombre = "Alex";
			Object numero = 100;
			Object decimal = 12.5;
			Object numero2 = 10;
			//No podemos tener un array con mas de un tipo de dato, pero podemos tener un array de elementos tipo objeto.
			
			Object [] varios = {100,3.1416,true,'?',"Andy"};
			//Esto seria una forma de almacenar mas de un tipo de dato (se almacena como elementos de tipo objeto).
			//No es el uso mas optimo pero se podria.
			
			
		}
		
	}

}
