package com.condicionales;

import java.util.Scanner;

public class condiciones6_JAFA {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado
		
		Scanner input = new Scanner(System.in);
		double PInicial;
		char tipo;
		int tamaño;
		
		System.out.println("Ingresa el precio por Kilo: ");
		PInicial=input.nextDouble();
		
		System.out.println("Ingresa en tipo de uva A o B");
		tipo = input.next().charAt(0);
		
		System.out.println("Ingresa el tamaño de la uva 1 o 2");
		tamaño= input.nextInt();
		
		double PFinal = PInicial;
		
		
		if (tipo == 'A') {
			if(tamaño == 1) {
					PFinal += 0.20;
			}
			else if (tamaño == 2) {
				PFinal += 0.30;
			}
			else {
				System.out.println("Tamaño no valido");
				return;
		}
			
		}
		else if(tipo == 'B') {
			if( tamaño == 1) {
				PFinal -= 0.30;
			}
			else if (tamaño==2) {
				PFinal -= 0.50;
			}
			else {
				System.out.println("Tamaño no valido");
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
