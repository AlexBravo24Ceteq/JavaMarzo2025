package com.arrays;

public class Array2_VEMC {

	public static void main(String[] args) {
// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
	//creamos un array con 100 valores.		
		
int [] numeros = new int [100];//se crea un array de enteros con 100 posiciones.

//llenar el array con los valores del 1 al 100.
for (int i = 0; i < numeros.length; i++) {// utilizamos un bucle for para llenar los valores en el array automaticamente.
	numeros[i] = i + 1;//cada iteracion asignamos el valor (i+1) a la posicion (i) del array.
	
}
//Calculamos la suma de todos los numeros

int suma = 0;//inicializamos la variable suma en 0
for (int i = 0; i < numeros.length; i++) {// usamos otro bucle para recorrer el array y sumar los valores.
	suma += numeros[i];
}

//calcular la media
double media = (double) suma / numeros.length;//se calcula dividiendo la suma de los numeros entre la cantidad de numeros


//mostramos los resultados

System.out.println("La suma de los numeros del 1 al 100 es: " + suma);
System.out.println("La  media de los numeros del 1 al 100 es: " + media);
	}

}
