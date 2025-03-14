package com.condicionales;

import java.util.Scanner;

public class Condicionales7_HEVM {

	public static void main(String[] args) {
		/*El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
		*debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
		*cobrar es la siguiente:
		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
		*alumnos.
		*Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
		*pagar cada alumno por el viaje. 
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Hagamos su presupuesto para su viaje escolar");
		System.out.println("Introduzca el número de alumnos que iran");
		int alumnos = input.nextInt();
		
		if (alumnos >= 100) {
			int precio = alumnos*65;
			System.out.println("El precio por alumno es de 65 euros");
			System.out.println("El precio total del autobus es de " + precio + " euros");
		}else if (alumnos < 100 && alumnos >= 50) {
			int precio = alumnos*70;
			System.out.println("El precio por alumno es de 70 euros");
			System.out.println("El precio total del autobus es de " + precio + " euros");
		}else if (alumnos < 50 && alumnos >= 30) {
			int precio = alumnos*95;
			System.out.println("El precio por alumno es de 95 euros");
			System.out.println("El precio total del autobus es de " + precio + " euros");
		}else {
			System.out.println("El precio del autobus es de 4000 euros al ser menos de 30 alumnos");
		}

	}

}
