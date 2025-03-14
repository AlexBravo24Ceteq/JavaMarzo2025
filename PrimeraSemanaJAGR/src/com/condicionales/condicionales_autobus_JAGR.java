package com.condicionales;

		import java.util.Scanner;

public class condicionales_autobus_JAGR {

	public static void main(String[] args) {
		
		//Programa en java que calcula el pago total a la
				//compañia de autobuses y costo por alumno
		//Trabajo numero 7
			
			 Scanner scanner = new Scanner(System.in);

		     // Solicitar número de alumnos
			 
		     System.out.print("Ingrese el numero de alumnos: ");
		     int alumnos = scanner.nextInt();

		     double costoPorAlumno;
		     double costoTotal;

		     	// Determinar el costo según la cantidad de alumnos
		     	//se usa una estructura if-else para asignar el costo por alumno
		     	//segun la cantidad de estudiantes
		     
		     	if (alumnos >= 100) {
		         costoPorAlumno = 65;
		         costoTotal = alumnos * costoPorAlumno;
		     		} else if (alumnos >= 50) {
		     			costoPorAlumno = 70;
		     			costoTotal = alumnos * costoPorAlumno;
		     				} else if (alumnos >= 30) {
		     					costoPorAlumno = 95;
		     					costoTotal = alumnos * costoPorAlumno;
		     						} else {
		     							costoPorAlumno = 4000.0 / alumnos; // Costo total fijo dividido entre los alumnos
		     							costoTotal = 4000; // Costo fijo por el autobús
		     }

		     // Mostrar resultados
		     System.out.println("\nResumen del viaje:");
		     System.out.println("Costo por alumno: " + String.format("%.2f", costoPorAlumno) + " euros");
		     System.out.println("Pago total a la compañía: " + String.format("%.2f", costoTotal) + " euros");

		     scanner.close();
		 }
}
	