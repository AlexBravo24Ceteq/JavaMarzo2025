package com.ciclos;

import java.util.Scanner;

public class Ciclos12_VEMC {

	public static void main(String[] args) {
// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las edades sea superior a 25.
		
		
@SuppressWarnings("resource")
Scanner input = new Scanner (System.in);//se crea el obtejo scanner para leer la entrada de datos.

//inicializar variables
int sumaEdades = 0;
int cantidadEdades = 0;
double promedio = 0;

//bucle para ingresar edades
while (promedio <= 25) {//se ejecuta el ciclo hasta que promedio sea menor o igual a 25.
	System.out.print("Introduce tu edad: ");
	int edad = input.nextInt();
	
	//sumar la edad al total y aumentar el contador
	sumaEdades += edad;
	cantidadEdades ++;
	
	//calculamos el promedio
	promedio = (double) sumaEdades / cantidadEdades;
	
	
	//mostrar promedio actual
	System.out.printf("Promedio actual: %.2f\n", promedio);

}
	//mostrar el resultado final
System.out.printf("El promedio de las edades es %.2f, que es superior a 25.\n" , promedio);
}

	}


