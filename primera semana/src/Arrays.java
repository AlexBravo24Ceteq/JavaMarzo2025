
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LOS ARRAYS O ARREGLOS DE UNA DIMENSION SON CONOCIDOS COMO VECTORES
		//SON ESTRUCTURAS QUE NOS VAN A PERMITIR ALMACENAR UN CONJUNTO
		//DE DATOS DE UN TIPO EN COMUN Y UNA VEZ DECLARADO SU TAMAÑO ESTOS PUEDEN CRECER 
		//EN TIEMPO DE EJECUCION
		
		
		/EJ.  DECLRANDO un array de nuero enteros con su tamaño inicila
		
		int [] numeros = new int [5]; //un array de 5 elemtos enteros
		
		
		//Introducir valores en cad indice o posicion del array
		
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		
		//Si neesitamos utilizar un valor de algina posicion 
		//Por ejemplo mandarla a imprimir en consola, pues llamamos a es 
		// indice
		
		System.out.println(numeros [2]);
		
		//Otra forma de declacar los arrays es ya cons us valores asignados 
		// desde un inicio
		
		int [] numeros2 = {1,2,3,4,5,6}
		
		//Ej.  un array con caracterres
		
		char [] nombre = {'J', 'O', '$', ';', ''}
		
		
		
		
		
		for (int i = 0; i< nombres.length; i++) {
			System.out.print (nombres [i] + " ");
			
			//Imprimier los vlaores de  un array utilizando otro ciclo que se lla  
			// for each, puede enviar a imprimir  si o si 
			// cada elemento 
			Systemn.out.println ("Imprimiento array con for each");
			
			for (String i:nombres) { //para cada elelmto string del array nombres
				Systeme.out.prinln(i); //mandamos a imorimir cada elemnto en una nueva linea
				
				
			}
			
			for (int i:numeros) {
				System.out.println(i);
			}
		}
	}

}
