package com.condicionales;

import java.util.Scanner;

public class Condicionales6_HEVM {

	public static void main(String[] args) {
		/*
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
		 *clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
		 *es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
		 *entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
		 *es de tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
		 *tama�o 2.
		 *Precio inicial se recibe desde teclado
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Se le dira cuanto dinero recibira por su embarque de uvas");
		System.out.println("Primero introduzca el precio fijado por la asociaci�n de vinicultores");
		double precioInicial = input.nextDouble();
		
		System.out.println("Ahora introduzca el n�mero de uvas de tipo A con tama�o 1");
		int tipoA1 = input.nextInt();
		
		System.out.println("Introduzca el n�mero de uvas de tipo A con tama�o 2");
		int tipoA2 = input.nextInt();
		
		System.out.println("Introduzca el n�mero de uvas de tipo B con tama�o 1");
		int tipoB1 = input.nextInt();
		
		System.out.println("Introduzca el n�mero de uvas de tipo B con tama�o 2");
		int tipoB2 = input.nextInt();
		
		double pagoEmbarque = tipoA1*(precioInicial+.30) + tipoA2*(precioInicial+.20) + tipoB1*(precioInicial-.30) + tipoB2*(precioInicial-.50);
		System.out.println("El pago por su embarque es de " + pagoEmbarque + " pesos");
	}

}
