package com.condicionales;

import java.util.Scanner;

public class condiciones6_JAFA {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//		tama�o 2.
//		Precio inicial se recibe desde teclado
		
		Scanner input = new Scanner(System.in);
		double PInicial;
		char tipo;
		int tama�o;
		
		System.out.println("Ingresa el precio por Kilo: ");
		PInicial=input.nextDouble();
		
		System.out.println("Ingresa en tipo de uva A o B");
		tipo = input.next().charAt(0);
		
		System.out.println("Ingresa el tama�o de la uva 1 o 2");
		tama�o= input.nextInt();
		
		double PFinal = PInicial;
		
		
		if (tipo == 'A') {
			if(tama�o == 1) {
					PFinal += 0.20;
			}
			else if (tama�o == 2) {
				PFinal += 0.30;
			}
			else {
				System.out.println("Tama�o no valido");
				return;
		}
			
		}
		else if(tipo == 'B') {
			if( tama�o == 1) {
				PFinal -= 0.30;
			}
			else if (tama�o==2) {
				PFinal -= 0.50;
			}
			else {
				System.out.println("Tama�o no valido");
				return;
			}
		}
		else {
			System.out.println("Tipo de uva no valido");
			return;
		}
		
		
		System.out.println("El precio de la uva es "+ PFinal + " euros");
		
		
		
		

	}

}
