package Arrays;

public class arrays {

	public static void main(String[] args) {
		
		//los arrays o arreglos de una dimension
		//tambien conocidos como vectores
		//son escruturas que nos van a permitir almacenar
		//un conjunto de datos de un tipo comun
		//y una vez declarado su tamaño estos no pueden crecer
		//en tiempo de ejecucion
		
		//Ej.  declarando un array de numeros enteros con su tamaño inicial
		
	int [] numeros = new int [6]; //un array de 5 elementos enteros
	//Introducir valores en cada indice o posicion del array.
	
	
	numeros [0] = 1;
	numeros [1] = 2;
	numeros [2] = 3;
	numeros [3] = 4;
	numeros [4] = 5;
	numeros [5] = 6;

//Si necesitamos ocupar el valor de alguna posicion 
	//y mandarlo a imprimir en consola, pues llamamos a ese indice
	
	System.out.println(numeros[5]);
	
	//otra forma de declarar los Arrays es ya con sus valores asignados
	//desde un inicio
	
	int [] numeros2 = {1,2,3,9,5,6};
	
	System.out.println(numeros2[3]);
 
	//Ej. un array de caracteres
	
	char [] nombre = {'J', 'o', 'r', 'g', 'e'};
	
	
	
	String[] nombres = {"Jorge", "Alexandra", "Guillermo", "America"};
	
	System.out.println(nombres[0]);
	
	//vamos a ver que ocurre si mandamos o queremos imprimir todo el conjunto de datos
	
	System.out.println(numeros);
	System.out.println(nombre); //el array de caracteres si lo manda a imprimir
	//como si imprimieramos un String en consola
	System.out.println(nombres);
	
	//para poder imprimir o recorrer todo un arraypodemos hacerlo mediante
	//ciclo for
	
	for (int i = 0; i < nombres.length; i++) {
		System.out.println(nombres[i] + "");
	}
		System.out.println();
		
		//Imprimir valores de un array utilizando otro ciclo que se llama for each
		//el ciclo de for each puede mandar a imprimir si o si cada elemento
		
		System.out.println("imprimiendo array con for each");
		
		for (String i:nombres) { //para cada elemnto string del array nombres
			System.out.println(i); //mandamos a imprimir cada elemnto en una nueva linea
		}
		System.out.println("Imprimiendo Array de numeros con for each");
			for (int i:numeros) {
				System.out.println(i);
				
			}
			
		}
	}


