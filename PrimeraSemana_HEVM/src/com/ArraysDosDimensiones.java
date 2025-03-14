package com;

public class ArraysDosDimensiones {

	public static void main(String[] args) {
		//Array de dos dimensiones, es una estructura mas amplia, es decir
		// en lugar de almacenar valores en una fila, vamos a contar con otra
		//dimension para que asi tengamos una estructura como de una "tabla"
		//a este Array se le conoce tambien con el nombre de matriz
		
		//ejemplo de un array de dos dimensiones de numeros enteros
		
		int [] [] matriz = new int [3] [3]; // [Filas] [Columnas]
		
		//llenar los espacios de una matriz o array de dos dimensiones
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9;
		
		//Ejemplo de crear una matriz asignandole los valores desde su creacion
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//ejemplo si quiero imprimir o utilizar un valor de una matriz
		
		System.out.println(matriz [1][2]);
		
		//ejemplo de imprimir un array de dos dimensiones con dos ciclos anidados
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		//podemos tener un array que contenga mas de un tipo de dato?
		//es decir que contenga int, double, String, etc
		
		Object nombre = "Alex";
		Object numero =100;
		Object decimal = 3.1416;
		Object numero2 = 10;
		
		Object [] varios = {100, 3.1416, true, '?', "Andy"};
		//Esto seria una forma de almacenar mas de un tipo de dato, no lo mas optimo
		//pero se pueden como tipo de dato objeto
		}

}
