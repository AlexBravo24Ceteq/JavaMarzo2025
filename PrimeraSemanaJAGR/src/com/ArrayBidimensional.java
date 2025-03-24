package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		
		//Array de dos dimensiones. Es una estructura mas amplia, es decir en lugar]
		//de almacenar ahora valores en forma de una "fila"
		//vamos a contar con otra dimension para que asi tengamos
		//una estructura como de una "tabla"
		//A este array se le conoce tambien con el nombre de matriz.
		
		//Ej. de un array de dos dimensiones de numeros enteros
		
		int[] [] matriz = new int [3] [3]; // [la primera dimension da el valor de las FILAS] y 
		//[la segenda el valor de las COLUMNAS]
		
		//LLenar los espacios de una matriz o array de dos dimensiones
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3;
		
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6;
		
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9;
	
		//Ej. de crear una matriz con los valores asignados desde un inicio.
		
		//en teoria se puede acceder mas rapido a la informacion porque esta en un indice.
		
		
		int[][] matriz2 = {{ 1,2,3}, {4,5,6},{7,8,9,}};
		
		
		System.out.println(matriz[1][2]);
		
		//Ej. si quiero imprimir o utilizar un solo valor de una matriz
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i] [j] + " ");
		
	}
		System.out.println();

		Object nombre = "Alex";
		Object numero = 100;
		Object decimal = 3.1416;
		
		Object numero2 = 10;
		
		Object[] varios = {100, 3.1416. true, '?', "Andy"};
		//esta seria una forma de almacenar mas de un tipo de dato, no mas lo optimo
		//pero se "podria"
		//no se guarda como un dato booleano, se convierne a objeto, no tiene un fin practico, no es utilizable eso
		
		System.out.print();
		
		
		
		
		
	}
}
}

