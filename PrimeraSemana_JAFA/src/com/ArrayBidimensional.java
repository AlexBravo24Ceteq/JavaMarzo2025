package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de dos dimenciones es una estructura mas amplia, es decir
		//en lugar de almacenar ahora valores en forma de una fila
		//vamos a contar con otra dimension para que asi tengamos
		//una estructura como de una tabla
		//A este array se le conoce tambien con el nombre de matriz
		
		
		//ej. de un array de dos dimenciones de numeros enteros
		
		int[] [] matriz = new int [3][3];//[filas] [Columnas]
		
		//para  poder insertar informacion
		//LLenar los espacios de una matriz o array de dos dimensciones
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;

		
		//Ej de creae una matriz con los valores asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//ej. si quiero imprimi o utilizar un sol valor de una matriz
		
		System.out.println(matriz[1][2]);
		
		//ej de imprimir un array de dos dimensiones con dos ciclos anidados
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		
		//¿Podemos tener un array que contenga mas de un tipo de dato?
		//Es decir que contenga int, double, strign, ect
		
		Object nombre="Alex";
		Object numero= 100;
		Object decimal= 3.1416;
		
		Object [] varios = {100,3.14,true,'#', "andy"};
		//Esto seria una forma de almacenar mas de un tipo de dato no lo mas optimo
		//pero se podria . se estan almacenando como tipo objeto
		
		
		
		
	}

}
