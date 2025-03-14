package com.arrays;

public class Array4_VEMC {

	public static void main(String[] args) {
// Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
//Guardar los valores de este array en otro array distinto pero con los valores invertidos.
//es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		
int [] arrayOriginal = {1,2,3,4,5};//array original con valores establecidos.


//Creamos un nuevo array para almacenar los valores invertidos
int [] arrayInvertido = new int[arrayOriginal.length];

//Inversion del array original y guardarlo en el nuevo array.
for (int i = 0; i < arrayInvertido.length; i++) {//Usamos un bucle for para recorrer el array original.
	arrayInvertido[arrayOriginal.length - 1 - i] = arrayOriginal[i];//En cada iteración, asignamos el valor del array original en la posición i al array invertido en la posición arrayOriginal.length - 1 - i
	}//Esto invierte el orden de los elementos.

//Mostrar array original
System.out.println("Array Original: ");
for (int i = 0; i < arrayOriginal.length; i++) {
	System.out.println(arrayOriginal[i] + " ");
	
}
System.out.println();
//Mostrar array invertido
System.out.println("Array Invertido: ");//El array invertido se crea con el mismo tamaño que el array original.
for (int i = 0; i < arrayInvertido.length; i++) {
	System.out.println(arrayInvertido[i] + " ");
	
}
	}

}
