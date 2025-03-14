package com.condicionales;

import java.util.Scanner;

public class Condicionales11_HEVM {

	public static void main(String[] args) {
		/*
		*Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
		*Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
		*la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		
		*ZONA UBICACIÓN COSTO/KILOGRAMO
		*1 América del Norte 24,00 euros
		*2 América Central 20, 00 euros
		*3 América del Sur 21,00 euros
		*4 Europa 10,00 euros
		*5 Asia 18,00 euros
		
		*Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
		*cuestiones de logística y seguridad.
		*Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
		*de la entrega.
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Realizaremos la cotización del envio de su paquete");
		System.out.println("Por favor introduzca la Zona ubicación como se indica a continuacion:");
		System.out.println("América del Norte = AN");
		System.out.println("América Central = AC");
		System.out.println("América del Sur = AS");
		System.out.println("Europa = E");
		System.out.println("Asia = A");					
		
		String zona = input.next();
		
		System.out.println("Ahora introduzca el peso de su paquete en Kg");
		
		double peso = input.nextDouble();
		
		if (peso <= 5 && zona.equals("AN")) {
			double precio = peso*24;
			System.out.println("El precio de su envio es de " + precio + " euros");
		}else if (peso <= 5 && zona.equals("AC")) {
			double precio = peso*20;
			System.out.println("El precio de su envio es de " + precio + " euros");
		}else if (peso <= 5 && zona.equals("AS")) {
			double precio = peso*21;
			System.out.println("El precio de su envio es de " + precio + " euros");
		}else if (peso <= 5 && zona.equals("E")) {
			double precio = peso*10;
			System.out.println("El precio de su envio es de " + precio + " euros");
		}else if (peso <= 5 && zona.equals("A")) {
			double precio = peso*18;
			System.out.println("El precio de su envio es de " + precio + " euros");
		}else if (peso > 5) {
			System.out.println("Lo lamentamos, por política de la empresa los paquetes con un peso superior a 5kg " + 
					" no son transportados por cuestiones de logística y seguridad.");
		}else {
			System.out.println("Error, alguno de lso datos no es valido");
		}
		
	}

}
