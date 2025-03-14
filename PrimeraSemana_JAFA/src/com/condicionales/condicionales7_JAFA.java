package com.condicionales;

import java.util.Scanner;

public class condicionales7_JAFA {

	public static void main(String[] args) {
		// El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
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
		System.out.println("La compa�ia de autobuses debe de recibir "+ PagoTotal+ " euros");
	}

}