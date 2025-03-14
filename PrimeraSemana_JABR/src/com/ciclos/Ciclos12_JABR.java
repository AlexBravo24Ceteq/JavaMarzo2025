package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JABR {

	public static void main(String[] args) {
		// 12.Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea superior a 25.
		
		//Necesitamos el Scanner para poder pedir las edades por teclado
		Scanner input = new Scanner(System.in);
		
		//Necesitamos diversas variables
		int edad; //aqui voy a guardar la edad o edades que se solicitan
		int sumaEdades = 0; //aqui guardaré la suma de las edades
		int promedio; //aqui voy a guardar el promedio
		int contador = 0; //aqui voy a guardar cuantas edades o cuantas veces hemos
		//tecleado o guardado una edad
		
		//Necesitamos ejecutar esto y pedir edades mientras el promedio no supere 25
		
		do {
			//Solicitamos una edad para guardar
			System.out.println("Introduce una edad");
			edad = input.nextInt();
			//Necesito sumar las edades
			sumaEdades = sumaEdades+edad;
			//Primero incrementamos el contador de edades
			contador++;
			//Sacamos el promedio
			promedio = sumaEdades/contador;
			System.out.println("El promedio por ahora es: " + promedio);
			//Condicionamos
			if (promedio>25) {
				break;
			}
		}while(edad>0); //siempre que la edad sea mayor a 0
		
		System.out.println("===========FIN DEL PROGRAMA============");
		System.out.println("La suma de las edades fue: " + sumaEdades);
		System.out.println("La cantidad de edades ingresadas fue: " + contador);
		System.out.println("El promedio es igual a: " + promedio);
	}

}
