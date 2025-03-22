package com.condicionales;

import java.util.Scanner;

public class condicionales6_ALCJ {

	public static void main(String[] args) {
		/* 6.- La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y adem�s en tamanos (1 y 2). Cuando se realiza la venta del producto, �sta
		 * es de un s�lo tipo y tamano, se requiere determinar cu�nto recibir� un productor por la uva que 
		 * entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tamano 1 y 30 c�ntimos si 
		 * es de tamano 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tamano 1, y 50 c�ntimos cuando es de
		 * tamano 2.
		 * Precio inicial se recibe desde teclado
		 */
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa el precio inicial por kilo de uva:");
        double precioInicial = teclado.nextDouble();
        
        System.out.println("Ingresa el tipo de uva (A o B):");
        char tipo = teclado.next().charAt(0);

        System.out.println("Ingresa el tamano de uva (1 o 2):");
        int tamano = teclado.nextInt();

        double precioFinal = precioInicial;
        
        if (tipo == 'A') {
            if (tamano == 1) {
                precioFinal += 0.20;
            } else if (tamano == 2) {
                precioFinal += 0.30;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioFinal -= 0.30;
            } else if (tamano == 2) {
                precioFinal -= 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " pesos.");
    }

	}
