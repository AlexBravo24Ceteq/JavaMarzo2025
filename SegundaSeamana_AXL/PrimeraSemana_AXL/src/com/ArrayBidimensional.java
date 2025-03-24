package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// ARRAYS en dos dimensiones
		//Es una estructura mas amplia, es decir en lugar de 
		//almacenar ahora valores en forma de una "fila"
		//vamos a contar con otra dimension para que asi tengamos
		//una estructura como de una "tabla"
		//A este array se le conoce tambien con el nombre de matriz
		
		
		//Ejemplo array de 2 dimensiones
		
		int [] [] matriz = new int [3] [3];//primera dimensio [valor de filas]
		//segunda dimension[valor de las columnas]
		
		
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
		
		
		//Ej crear matriz con los valores asignados desde un inicio
		int [][] matriz2 = {{ 1,2,3},{ 4,5,6},{7,8,9}};
		
		//Ej si quiero imprimir un solo valor de la matriz
		System.out.println(matriz[1][2]);
		
		//Ej si quiero imprimir un array de dos dimensiones con ciclos anidados
		for(int i = 0; i <3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//¿Podemos tener un array que contenga mas de un tipo de dato?
		//Es decir que contenga int, double, String, etc.
		
		Object nombre ="Alex";
		Object numero ="1000";
		Object decimal =3.1416;
		
		Object numero2 = 10;
		
		Object [] varios = {100,3.1416,true,'?',"Ale"};
		//Esto seria una forma de alamcenar mas de un tipo de dato
		//no lo mas optimo pero se podria
		
		
		

	}

}
