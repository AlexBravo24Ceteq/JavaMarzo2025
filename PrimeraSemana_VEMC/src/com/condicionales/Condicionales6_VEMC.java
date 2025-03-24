package com.condicionales;

import java.util.Scanner;

public class Condicionales6_VEMC {

	public static void main(String[] args) {
// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño,
//se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
//Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
Scanner input = new Scanner(System.in);
System.out.println("Introduce el precio inicial por kilo de uva: ");//solicitar el precio inicial por kilo
double precioInicial = input.nextDouble();

System.out.println("Introduce el tipo de Uva (A o B): ");//solictar el tipo de uva
char tipo = input.next().charAt(0);


System.out.println("Introduce el tamaño de Uva (1 o 2): ");//solicitar el tamaño
int tamaño = input.nextInt();

//calcular el precio segun tipo y tamaño
double precioFinal = precioInicial;

if (tipo == 'A') {//si es tipo A
	if (tamaño == 1) {
		precioFinal += 0.20; // se cargan 20 cm.
		} else if (tamaño == 2) {
			precioFinal += 0.30; // se cargan 30 cm.
		} else if (tipo == 'B') {//si es tipo b
		if (tamaño == 1) {
			precioFinal -= 0.30; //se rebajan 30 cm.
		} else if (tamaño == 2) {
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
