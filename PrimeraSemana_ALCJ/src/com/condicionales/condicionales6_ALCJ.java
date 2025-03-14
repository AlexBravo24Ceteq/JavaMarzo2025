package com.condicionales;

import java.util.Scanner;

public class condicionales6_ALCJ {

	public static void main(String[] args) {
		/* 6.- La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
		 * es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		 * entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		 * es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
		 * tamaño 2.
		 * Precio inicial se recibe desde teclado
		 */
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa el precio inicial por kilo de uva:");
        double precioInicial = teclado.nextDouble();
        
        System.out.println("Ingresa el tipo de uva (A o B):");
        char tipo = teclado.next().charAt(0);

        System.out.println("Ingresa el tamaño de uva (1 o 2):");
        int tamaño = teclado.nextInt();

        double precioFinal = precioInicial;
        
        if (tipo == 'A') {
            if (tamaño == 1) {
                precioFinal += 0.20;
            } else if (tamaño == 2) {
                precioFinal += 0.30;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precioFinal -= 0.30;
            } else if (tamaño == 2) {
                precioFinal -= 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " pesos.");
    }

	}
