package com.condicionales;

import java.util.Scanner;

public class Condicionales7_VEMC {

	public static void main(String[] args) {
/*El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto debe cobrar a cada alumno 
 * y cu�nto debe pagar a la compa��a de viajes
 *  por el servicio. La forma de cobrar es la siguiente: * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros. 
 *  * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
 *  * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos. 
 *  Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.*/
 Scanner input = new Scanner(System.in);
//Solicitar el numero de alumnos
 System.out.println("Introduce el n�mero de alumnos: ");
 int nAlumnos = input.nextInt();
 
 //Calcular el costo total y el costo por alumno
 double costoTotal;
 double costoAlumno;
 if (nAlumnos >= 100) {//si son 100 o mas el costo 65
	 costoAlumno = 65;
	 costoTotal = nAlumnos * costoAlumno;
 } else if (nAlumnos >= 50 && nAlumnos <= 99) {
	 costoAlumno = 70;
	 costoTotal = nAlumnos * costoAlumno;
	 } else if (nAlumnos >= 30 && nAlumnos <= 49) {
		 costoAlumno = 95;
		 costoTotal = nAlumnos * costoAlumno;
	 } else {
		 costoTotal = 4000; //Costo fijo para menos de 30 alumnos
		 costoAlumno = costoTotal / nAlumnos;
	 }
 //Mostrar resultados
 
 System.out.println("El costo total a pagar a la compa�ia de autobuses es: " + costoTotal + " euros.");
 System.out.println("Cada alumno debe pagar: " + costoAlumno + " euros.");
 
 input.close();
	}

}
