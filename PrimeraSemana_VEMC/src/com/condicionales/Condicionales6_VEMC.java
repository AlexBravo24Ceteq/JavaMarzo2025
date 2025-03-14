package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VEMC {

	public static void main(String[] args) {
// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o,
//se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
//Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
Scanner input = new Scanner(System.in);
System.out.println("Introduce el precio inicial por kilo de uva: ");//solicitar el precio inicial por kilo
double precioInicial = input.nextDouble();

System.out.println("Introduce el tipo de Uva (A o B): ");//solictar el tipo de uva
char tipo = input.next().charAt(0);


System.out.println("Introduce el tama�o de Uva (1 o 2): ");//solicitar el tama�o
int tama�o = input.nextInt();

//calcular el precio segun tipo y tama�o
double precioFinal = precioInicial;

if (tipo == 'A') {//si es tipo A
	if (tama�o == 1) {
		precioFinal += 0.20; // se cargan 20 cm.
		} else if (tama�o == 2) {
			precioFinal += 0.30; // se cargan 30 cm.
		} else if (tipo == 'B') {//si es tipo b
		if (tama�o == 1) {
			precioFinal -= 0.30; //se rebajan 30 cm.
		} else if (tama�o == 2) {
			precioFinal -= 0.50; //se rebajan 50 cm.
		}
		} else {
			System.out.println("Tipo de Uva no valido. Debe ser A o B");
			
		}
}
System.out.println("El precio final por kilo de Uva es: " + precioFinal +"");


input.close();
	}

}
