package com.condicionales;

import java.util.Scanner;

public class condicionales7_JAFA {

	public static void main(String[] args) {
		// El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
//		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
//		pagar cada alumno por el viaje.

		Scanner input = new Scanner(System.in);
		
		int alumno;
		
		System.out.println("Cuantos Alumnos van al viaje:");
		alumno = input.nextInt();
		
		double costoPorAlumno, PagoTotal;
		
		if (alumno >= 100) {
			costoPorAlumno=65;
			PagoTotal = alumno * costoPorAlumno;
		}
		else if (alumno >= 50 ) {
			costoPorAlumno= 70;
			PagoTotal = alumno * costoPorAlumno;
		}
		else if (alumno >= 30) {
			costoPorAlumno=95;
			PagoTotal= alumno * costoPorAlumno;
		}
		else {
			costoPorAlumno =4000 /alumno;
			PagoTotal = 4000;
		}
		
		System.out.println("Cada alumno debe de pagar "+ costoPorAlumno+ " euros");
		System.out.println("La compañia de autobuses debe de recibir "+ PagoTotal+ " euros");
	}

}