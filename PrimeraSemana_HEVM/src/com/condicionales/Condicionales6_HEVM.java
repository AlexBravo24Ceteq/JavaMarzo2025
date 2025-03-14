package com.condicionales;

import java.util.Scanner;

public class Condicionales6_HEVM {

	public static void main(String[] args) {
		/*
		 * La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
		 *clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
		 *es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		 *entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		 *es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
		 *tamaño 2.
		 *Precio inicial se recibe desde teclado
		 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Se le dira cuanto dinero recibira por su embarque de uvas");
		System.out.println("Primero introduzca el precio fijado por la asociación de vinicultores");
		double precioInicial = input.nextDouble();
		
		System.out.println("Ahora introduzca el número de uvas de tipo A con tamaño 1");
		int tipoA1 = input.nextInt();
		
		System.out.println("Introduzca el número de uvas de tipo A con tamaño 2");
		int tipoA2 = input.nextInt();
		
		System.out.println("Introduzca el número de uvas de tipo B con tamaño 1");
		int tipoB1 = input.nextInt();
		
		System.out.println("Introduzca el número de uvas de tipo B con tamaño 2");
		int tipoB2 = input.nextInt();
		
		double pagoEmbarque = tipoA1*(precioInicial+.30) + tipoA2*(precioInicial+.20) + tipoB1*(precioInicial-.30) + tipoB2*(precioInicial-.50);
		System.out.println("El pago por su embarque es de " + pagoEmbarque + " pesos");
	}

}
