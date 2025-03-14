package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		// Array de dos dimensiones. Es una estructura mas amplia, es deicr
		//en lugar de almacenar valores en forma de una fila
		//vamos a contar con otra dimension para que asi tengamos 
		//una estructura como de una tabla
		//A este array se le conoce tambien con el nombre de matriz
		
		//Ej. de array de dos dimensiones de numeros enteros
		
		int [] [] matriz = new int [3] [3]; // [filas] [columnas]
		
		//como llenar los espacios de una matriz 
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		//Ej. de crear una matriz con los valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Ej. si quiero imprimir o utilizar un solo valor de una matriz 
		
		System.out.println(matriz[1][2]);
		
		//Ej. de imprimmir una array de dos dimensiones con dos ciclos anidades
		
		for (int x = 0; x < 3; x++  ) {
			for (int  y = 0; y< 3; y++) {
				System.out.print(matriz[x][y] + " ");
			} 
			System.out.println();
		}
		
		//¿Podemos tener un array que contenga mas de un tipo de dato? 
		//Es decir que contenga int, double, String, etc.
		
		Object nombre = "America";
		Object numero = 100;
		Object decimal = 3.1416;
		
		Object numero2 = 10;
		
		Object [] varios = {100, 3.1416, true, '?', "Andy"};
		//Esta seria unna forma de almacenar mas de un tipo de dato, no lo mas optimo
		//pero se "podria"
		
		
		
		
		
		

	}

}
