package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones. Es una estructura más amplia, es decir
		//en lugar de almacenar ahora valores en forma de una "fila"
		//Vamos a contar con otra dimensión para que así tengamos
		//una estructura como de una "tabla"
		//A este array se le conoce tambien con el nombre de matriz
		
		//Ej. de un array de dos dimensiones de numeros enteros
		
		int [] [] matriz = new int [3] [3]; // [filas] [columnas]
		
		//Llenar los espacios de una matriz o array de dos dimensiones
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9;
		
		//Ej. de crear una matriz con los valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Ej. si quiero imprimir o utilizar un solo valor de una matriz
		
		System.out.println(matriz[1][2]);
		
		//Ej. de imprimir un array de dos dimensiones con dos ciclos anidados
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		//¿Podemos tener un array que contenga más de un tipo de dato?
		//Es decir que contenga int, double, String, etc
		
		Object nombre = "Alex";
		Object numero = 100;
		Object decimal = 3.1416;
		
		Object numero2 = 10;
		
		Object [] varios = {100, 3.146, true, '?', "Andy"};
		//Esto sería una forma de almacenar más de un tipo de dato, no lo más optimo
		//pero "se podría"
		
		
		

	}

}
