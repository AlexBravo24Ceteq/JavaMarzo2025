package com.condicionales;

import java.util.Scanner;

public class Condicionales11_VEMC {

	public static void main(String[] args) {
//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia.
//El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida.
//	ZONA UBICACIÓN	-	COSTO POR KILO
/*		
 * 1 América del Norte = 24,00 euros c
 * 2 América Central = 20, 00 euros
 * 3 América del Sur = 21,00 euros
 * 4 Europa 		=	10,00 euros
 * 5 Asia			=	18,00 euros
 * Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
 * Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 */
Scanner input = new Scanner (System.in);

//solicitamos el peso del paquete
System.out.println("Introduce el peso del paquete en (kg): ");
double peso = input.nextDouble();
//verificamos que el peso sea valido para el envio
if (peso > 5) {
	System.out.println("Rechazo de entrega: El paquete no puede pesar mas de 5kg.");
	
}else {
//solicitamos la zona destino
	System.out.println("Introduce la zona destion:");
	System.out.println("1. America del Norte");
	System.out.println("2. America Central");
	System.out.println("3. America del Sur");
	System.out.println("4. Europa");
	System.out.println("5. Asia");
	System.out.println("Zona (1-5): ");
	int zona = input.nextInt();
	
//Calcular el costo segun la zona
double costoPorKG;
switch (zona) {
case 1: 
	costoPorKG = 24.00;
	break;
case 2:
	costoPorKG = 20.00;
	break;
case 3: 
	costoPorKG = 21.00;
	break;
case 4:
	costoPorKG = 10.00;
	break;
case 5:
	costoPorKG = 18.00;
	break;
default:
	costoPorKG = -1;// para manejar zonas incorrectas	
}
//Mostrar costo o mensaje de error.
//condicion 
if(costoPorKG != -1) {//diferente de
	double costoTotal = peso * costoPorKG;
	System.out.printf("El costo de transporte es: %.2f euros \n", costoTotal);//%.2f es un especificador de formato 
																				//se utiliza con métodos como System.out.printf()
																				//o String.format() para formatear números de tipo float o double con dos decimales.
}else {
	System.out.println("ERROR: Zona no válida. Debes ingresar un número del 1 al 5.");
}
	
	
}
input.close();
	}

}
