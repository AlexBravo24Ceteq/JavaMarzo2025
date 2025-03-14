package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays o arreglos de una dimension
		//tambien son conocidos como vectores
		//son estructuras que nos van a permitir amacenar 
		//un conjunto de datos de un tipo en comun
		//y una ves decarado su tamaño estos no pueden crecer en tiempo
		//de ejecucuion
		
		//Ej. declarando un array de numeros enteros con su tamaño inicial
		
		int [] numeros = new int [5]; // un array de 5 elementos enteros
		
		//introducir valores en cada indice o posicion del array
		
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		
		//Si necesitamos utilizar un valor de alguna posicion
		//por ejemplo mandarla a imprimir en consola pues llamamos a ese 
		//indice
		
		System.out.println(numeros[2]);
		
		//Otra forma de declarar los Arrays es ya con sus valores asignados
		//desde un inicio
		
		int [] numeros2 = {1,2,3,4,5,6};
		System.out.println(numeros2[3]);

		
		
//		int [] numero3= new int [100];
//		int numerActual=1;
//		
//		for (int i = 0; i < numero3.length; i++) {
//			
//			numero3 [i]=numerActual;
//			numerActual++;
//		}
//		
//		System.out.println(numero3[0]);
		
		//Ej arrays  de caracter
		
		char[]nombre= {'j','o','s','e'};
		
		
		// ej un array conString
		
		String[] nombres = {"Alexandra","Guillermo","Jorge","America","Victor"};
		System.out.println(nombres[0]);
		
		//Vamos a ver que ocurre si mandamos  o queremos imprimir todo el conjunto de datos
		System.out.println(numeros);
		System.out.println(nombre);//el array de caracteres si lo manda a imprimir
		System.out.println(nombres);
		
		
		
		//Para poder imprimir o recorrer todo un array podemos hacerlo mediante un 
		//ciclo for
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[1]+"");
		}
		
		//imprimir los valores de un array utilizando otro ciclo que se llama for each
		System.out.println("Imprimir Array con for each");
		for (String i:nombres) { //para cada elemento String del array nombres
			System.out.println(i);//mandamos a imprimir cada elemento en una linea
		}
		//impriminedo numeros
		System.out.println("Imprimiensdo Aray de numeros con for each");
		
		for(int i:numeros) {
			System.out.println(i);
		}
		
	}

}
