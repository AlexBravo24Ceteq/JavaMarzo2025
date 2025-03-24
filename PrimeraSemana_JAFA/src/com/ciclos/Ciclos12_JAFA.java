package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JAFA {

	public static void main(String[] args) {
//		// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
//		cuando el promedio de las edades sea superior a 25
//	
		Scanner input = new Scanner(System.in);
		
		int sumaEdad=0;
		int contarEdades=0;
		int promedio=0;
		
		
		while(promedio<=25) {
			System.out.println("Introduce la edad de la persona: " );
			int edad=input.nextInt();
			
			sumaEdad += edad;
			contarEdades++;
			
			promedio=  sumaEdad / contarEdades;
			System.out.println("El promedio por ahora es: "+ promedio);
		}
		
		System.out.println("=====FIN DEL PROGRMA=======");
		System.out.println("El promedio de edades es: "+ promedio);
		System.out.println("Se ingresaron "+ contarEdades+ " edades");
	}

}
